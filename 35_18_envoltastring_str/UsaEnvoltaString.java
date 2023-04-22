/*Classe UsaEnvoltString que
/ens permitirà poder utilitzar 
/EnvoltaStrig i veurà si la
/hem codificat bé
*/
public class UsaEnvoltaString {
     public static void main(String[] args) {
         String nom1 = "Renat";
         String nom2 = args.length > 0 ? args[0] : "nom per defecte";
         System.out.printf("\"%s\".equals(\"%s\") -> %b%n", nom1, nom2, nom1.equals(nom2));

         EnvoltaString envoltaNom1 = new EnvoltaString(nom1);
         EnvoltaString envoltaNom2 = new EnvoltaString(nom2);
         System.out.printf("%s.equals(%s) -> %b%n", envoltaNom1, envoltaNom2, envoltaNom1.equals(envoltaNom2));
         System.out.printf("%s.equals(\"%s\") -> %b%n", envoltaNom1, nom2, envoltaNom1.equals(nom2));
         //Una instancia puede tener una propiedad, tener un valor y coincidir con el valor de un String, pero un String no puede ser igual que una instancia 
         System.out.printf("\"%s\".equals(%s) -> %b%n", nom1, envoltaNom2, nom1.equals(envoltaNom2));
     }
 }
