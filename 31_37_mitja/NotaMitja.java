/*Aquest programa és com el de sumar notes
/però no tenim que sumar, tenim que 
/calcular la mitjana de les notes
*/
public class NotaMitja {
	public static void main (String[] args) {
		// creem la variable on guardarem el resultat de sumar

        int suma = 0; 
        int contador = 0;



        // demaem una nota

        System.out.println("Introdueix una nota");

        int nota = Integer.parseInt(Entrada.readLine());
        
        if (nota < 0) {
        	System.out.println("Cap nota vàlida introduïda");


        // ves sumant mentre la nota estigui entre el 0 i el 100

        while (0 <= nota && nota <= 100) {

            suma = suma + nota;
            contador++;

            // demana un nou valor

            System.out.println("Introdueix una nota");

            nota = Integer.parseInt(Entrada.readLine());

        }


        // mostrem el resultat

        System.out.println("La suma de les notes vàlides és " + suma/contador);

    }

}
}
