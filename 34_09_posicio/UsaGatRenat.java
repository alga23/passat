/* Aquest programa ens mostrarà quantes
/vides té el GatRenat i la seva posicio
/inicial i la final
*/
 public class UsaGatRenat {
     public static void main(String[] args) {
         GatRenat renat;
         renat = new GatRenat();
         System.out.println("Vides inicials: " + renat.vides);
         System.out.println("Posició inicial: " + renat.posicio);
         if (renat.posicio.equals("estirat")){
         	renat.posicio = "assegut";
         	}
         System.out.println("Posició final: " + renat.posicio);
     }
 }
