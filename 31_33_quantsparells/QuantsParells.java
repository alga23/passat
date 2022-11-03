/*Anirem demanant nombres i sumant-los. El programa acabarà quant
/l'usuari afegeixi un nombre negatiu.
*/
public class QuantsParells {
	public static void main (String [] args) {
		
		
	// creem la variable on guardarem el resultat de sumar

        int suma = 0;   // inicialment no hem sumat res i per tant és 0
        
        
        // demanem un valor

        System.out.println("Introdueix un valor");

        int valor = Integer.parseInt(Entrada.readLine());
        
       
       //farem una variable amb el mateix valor
       
       int mateixValor = valor;
       
       
       //inicialitzem el bucle
       
       while (valor - mateixValor == 0) {

            System.out.println("Introdueix valor");

            valor = Integer.parseInt(Entrada.readLine());

            if (valor  - mateixValor == 0) {

                suma++;

            }

        }

        System.out.println("Nombre de parells introduïts:" + suma);
        }
       }	
       	
