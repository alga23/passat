/*Classe Zoo que contindrà
/els mètodes necessaris per
/a que funcioni la nostra
/base de dades
*/
import java.sql.DriverManager;
import java.sql.Statement;
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
}
