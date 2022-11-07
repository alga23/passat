/*Aquest programa és com el de sumar notes
/però no tenim que sumar, tenim que 
/calcular la mitjana de les notes
*/
public class NotaMitja {
	public static void main (String[] args) {
	 
	 	int suma = 0;
	 	int contador = 0;
	 	int divisio = 0;
	 	
	 	System.out.println("Introdueix una nota");

        	int nota = Integer.parseInt(Entrada.readLine());
        	if (nota < 0) {
        		System.out.println("Cap nota valida");
        		}
        		
        	
        	while (0 <= nota && nota <= 100) {

            		suma = suma + nota;
            		contador++;
            		divisio = suma/contador;
			System.out.println("Introdueix una nota");

            		nota = Integer.parseInt(Entrada.readLine());
            		

        	}
        	if (0 >=nota && nota >= 100){
        	        System.out.println("La suma de les notes vàlides és " + divisio);
        	        }
        	       }
        	      }
