/*Aquesta versió d'UsGatRenat agafa
/l'única instancia de GatRenat i li afegeix
/una nova posició
*/ 
 public class UsaGatRenat {
     public static void main(String[] args) {
         GatRenat renat = GatRenat.getInstancia();
         System.out.println("Inicialment Renat està " + renat.getPosicio());
         for (String posicio: args) {
             canviaPosicio(posicio);
             System.out.println("Ara està " + renat.getPosicio());
         }
     }
     private static void canviaPosicio(String novaPosicio) {
	 String posicio = novaPosicio;
    if (novaPosicio.equals("1") || novaPosicio.equals("estirat")) {
        posicio = "estirat";
    } else if (novaPosicio.equals("2") || novaPosicio.equals("assegut")) {
        posicio = "assegut";
    } else if (novaPosicio.equals("3") || novaPosicio.equals("dret")) {
        posicio = "dret";
    }
      GatRenat.getInstancia(novaPosicio);

          }
         }
        
