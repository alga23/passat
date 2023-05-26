/*Classe Zoo a la que li hem afegit
/dos metodes nous, creaTaula i eliminaTaules
/per poder crear les taules i elimarles
*/

    import java.sql.DriverManager;
    import java.sql.ResultSet;
    import java.sql.Statement;
    import java.util.ArrayList;
    import java.util.LinkedList;
    import java.util.List;
    import java.sql.Connection;
    import java.sql.DatabaseMetaData;
    import java.sql.SQLException;
    public class Zoo {
        private static final String CATEGORIES = "animals.bd";
        private static final String CADENA_DE_CONNEXIO = "jdbc:sqlite:" + CATEGORIES + "?integrity_check&foreign_key_check";
        private Connection conn = null;
        public Zoo(){
            
        }
    
        public void connecta() throws SQLException {
            if (conn != null) return;   // ja connectat
            conn = DriverManager.getConnection(CADENA_DE_CONNEXIO);
        }
    
        public void desconnecta() throws SQLException {
            if (conn == null) return; // ja desconnectat
            conn.close();
            conn = null;
        }
        public void creaTaulaCategories()throws SQLException {
            String sql = "CREATE TABLE IF NOT EXISTS CATEGORIES (" +
                         "       id        INTEGER PRIMARY KEY AUTOINCREMENT," +
                         "       nom       VARCHAR(40))";
            Statement st = null;
            try {
                st = conn.createStatement();
                st.executeUpdate(sql);
            } finally {
                if (st != null) {
                    st.close();
                }
            }
        }
        public void eliminaTaulaCategories() throws SQLException{
            eliminaTaulaAnimals();
            String sql = "DROP TABLE IF EXISTS CATEGORIES";
            Statement st = null;
                
            try {    
                st = conn.createStatement();
                st.executeUpdate(sql);
            } finally {
                if (st != null) {
                    st.close();
                }
            }
        }
            
        public void afegeixCategoria(Categoria categoria) throws SQLException {
            String sql = String.format(
                    "INSERT INTO CATEGORIES (nom) VALUES ('%s')",
                    categoria.getNom());
            Statement st = null;
            try {
                st = conn.createStatement();
                st.executeUpdate(sql);
                ResultSet rs = st.getGeneratedKeys(); /*creem el cursor que ens donará l' ID*/
                rs.next();/*Anirá posició a posició retornant l' ID*/
                int ide = rs.getInt(1);
                categoria.setId(ide);
                
            } finally {
                if (st != null) {
                    st.close();
                }
            }
        }
        public Categoria obteCategoriaPerNom(String nom) throws SQLException{
            String sql = "SELECT * FROM CATEGORIES WHERE NOM = '"+nom+"'";
            Statement st = null;
            
            try {
                st = conn.createStatement();
                ResultSet rs = st.executeQuery(sql);
                Categoria categoria = null;
                while (rs.next()) {
                    categoria = new Categoria(rs.getInt("id"), rs.getString("nom"));
                    return categoria;
                }
                rs.close();
                return categoria;
            } finally {
                if (st != null) {
                    st.close();
                }
            }            
        }
        public List<Categoria> recuperaCategories() throws SQLException {
            String sql = "SELECT * FROM CATEGORIES ORDER BY nom";
            Statement st = null;
            try {
                st = conn.createStatement();
                ResultSet rs = st.executeQuery(sql);
                List<Categoria> categories = new LinkedList<>();
                while (rs.next()) {
                    int bdId = rs.getInt("id");
                    String nom = rs.getString("nom");
                    Categoria categoria = new Categoria(bdId, nom);
                    categories.add(categoria);
                }
                rs.close();
                return categories;
            } finally {
                if (st != null) {
                    st.close();
                }
            }
        }
        public void creaTaulaAnimals()throws SQLException {
            creaTaulaCategories();
            String sql = "CREATE TABLE IF NOT EXISTS ANIMALS (" +
                     "       id        INTEGER PRIMARY KEY AUTOINCREMENT," +
                     "       nom       VARCHAR(40)," +
                     "       categoria varchar(40)," +
                     "       FOREIGN KEY(categoria) REFERENCES CATEGORIES(id))";
            Statement st = null;
            try {
                st = conn.createStatement();
                st.executeUpdate(sql);
                } finally {
                    if (st != null) {
                        st.close();
                    }
                }
        }           
        
        public void eliminaTaulaAnimals() throws SQLException{
                String sql = "DROP TABLE IF EXISTS ANIMALS";
                Statement st = null;
                
            try {    
                st = conn.createStatement();
                st.executeUpdate(sql);
            } finally {
                if (st != null) {
                    st.close();
                }
            }
        }
        public String getNomTaules() throws SQLException {
            String sql = "SELECT name FROM sqlite_schema " +
                         "WHERE name NOT LIKE 'sqlite%' " +
                         "ORDER BY name";
            List<String> taules = new ArrayList<>();
            try (Statement st = conn.createStatement()) {
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) { taules.add(rs.getString("name")); }
                rs.close();
            }
            return taules.size() > 0 ? String.join(", ", taules) : "cap";
        }
}

