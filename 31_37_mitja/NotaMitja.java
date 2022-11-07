/*Aquest programa és com el de sumar notes
/però no tenim que sumar, tenim que 
/calcular la mitjana de les notes
*/
public class NotaMitja {
	public static void main (String[] args) {
	 
	 	int suma = 0;
	 	int contador = 0;
	 	int divisio = 0;
	 	
	 	System.out.println("Introdueix un valor");

        	int nota = Integer.parseInt(Entrada.readLine());
        	if (nota < 0 || nota > 100) {
        		System.out.println("Cap nota vàlida introduïda");
        		}
        		
        	
        	while (0 <= nota && nota <= 100) {

            		suma = suma + nota;
            		contador++;
            		divisio = suma/contador;
			System.out.println("Introdueix un valor");

            		nota = Integer.parseInt(Entrada.readLine());
            		

        	}
        	if (0 >=nota && nota >= 100){
        	        System.out.println("La suma de les notes vàlides és " + divisio);
        	        }
        	       }
        	      }
