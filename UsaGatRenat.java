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
if(novaPosicio.equals("1")){
            this.posicio= "estirat"
          }
          if(novaPosicio.equals("2")){
            this.posicio= "assegut"
          }
           if(novaPosicio.equals("3")){
            this.posicio= "dret"
          }
          if(!novaPosicio.equlas("1") || !novaPosicio.equlas("2") || !novaPosicio.equlas("3")){
            this.posico= novaPosicio;
          }
