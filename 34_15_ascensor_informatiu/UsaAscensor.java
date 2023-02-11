/*Aquest programa fa us de la classe Ascensor per moure un ascensor */
	public class UsaAscensor {
    public static void main(String[] args) {
        Ascensor ascensor = new Ascensor();
        System.out.println("Pis inicial: " + ascensor.getPis());
        System.out.println("Moviment inicial: " + ascensor.getMoviment());
        System.out.println("Introdueix nou pis:");
        String piso =Entrada.readLine();
        if(UtilString.esEnter(piso)) {
          ascensor.setPis(Integer.parseInt(piso));
        }
        System.out.println("Introdueix nou moviment:");
	String moviment =Entrada.readLine();
	ascensor.setMoviment(moviment);
        System.out.println("Pis final: " + ascensor.getPis());
        System.out.println("Moviment final: " + ascensor.getMoviment());
        System.out.println("Estat de l'ascensor: " + ascensor.comEsta());
    }
   }
