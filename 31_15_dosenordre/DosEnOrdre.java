/*
 * Programa que ordena dos nombres
 */
public class DosEnOrdre {
    public static void main(String[] args) {
        System.out.println("Primer?");
        int primer = Integer.parseInt(Entrada.readLine());
	
	System.out.println("Segon?");
        int segon = Integer.parseInt(Entrada.readLine());

        if (primer > segon) {
        	System.out.println(segon + " i " + primer);
        	}
        
        else if (primer < segon) {
        	System.out.println(primer + " i " + segon);
        	}
        
        else if (primer == segon) {
        	System.out.println(primer + " i " + segon);
        	} // Si dos numeros son iguals, seran imprimits a la pantalla igualment
    }
}
