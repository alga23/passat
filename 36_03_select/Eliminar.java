/*Classe que tuilitzarem per borrar
/les taules que es vagin 
acumulant*/

import java.sql.SQLException;

public class Eliminar{
    public static void main (String [] args) throws SQLException{
        Zoo zoo = new Zoo();
        System.out.print("Primer connectem amb la base de dades: ");
        zoo.connecta();
        System.out.println("connectat");

        System.out.println("Eliminem la taula CATEGORIES per si existia");
        zoo.eliminaTaulaCategories();

        System.out.println("Finalment tanquem la connexió amb la base de dades: ");
        zoo.desconnecta();
    }
}
