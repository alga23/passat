/*Nova classe que ens permitirà
/recuperar l'id
*/

    import java.sql.DriverManager;
    import java.sql.ResultSet;
    import java.sql.Statement;
    import java.util.LinkedList;
    import java.util.List;
    import java.sql.Connection;
    import java.sql.SQLException;
    public class Zoo {
        private static final String CATEGORIES = "animals.bd";
        private static final String CADENA_DE_CONNEXIO = "jdbc:sqlite:" + CATEGORIES;
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
}

