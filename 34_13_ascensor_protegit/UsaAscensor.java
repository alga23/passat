/*UsaAscensor que contindrà la manera
/de poder ineractuar amb els objects de la classe
/Ascensor
*/
public class UsaAscensor {
     public static void main(String[] args) {
         Ascensor ascensor = new Ascensor();
         System.out.println("Pis inicial: " + ascensor.getPis());
         System.out.println("Moviment inicial: " + ascensor.getMoviment());
         System.out.println("Introdueix nou pis:");
	String pis = Entrada.readLine();
         if(UtilString.esEnter(pis)){
        	ascensor.setPis(Integer.parseInt(pis));
        	}
         System.out.println("Introdueix nou moviment:");
         ascensor.setMoviment(Entrada.readLine());
         System.out.println("Pis final: " + ascensor.getPis());
         System.out.println("Moviment final: " + ascensor.getMoviment());
     }
 }
