/*Aquest programa és com el de sumar notes
/però no tenim que sumar, tenim que 
/calcular la mitjana de les notes
*/
public class NotaMitja {
	public static void main (String[] args) {
	  boolean bucle = true;
	// demanem una nota


        System.out.println("Introdueix un valor");

        int nota = Integer.parseInt(Entrada.readLine());
        
        if (nota < 0) {
        	System.out.println("Cap nota vàlida introduïda");
        	bucle = false;
        	}
        
        int suma = 0; 
        int contador = 0;



        // ves sumant mentre la nota estigui entre el 0 i el 100

        while (bucle) {

            suma = suma + nota;
            contador++;

            // demana un nou valor

            System.out.println("Introdueix una nota");

            nota = Integer.parseInt(Entrada.readLine());
            if (0 >= nota && nota >= 100) {
            	   System.out.println("La suma de les notes vàlides és " + suma/contador);
            	   bucle = false;

        }


        // mostrem el resultat

        System.out.println("La suma de les notes vàlides és " + suma/contador);

    }

}
}

