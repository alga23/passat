/*Farem un lloro que reptirà totes les paraules
/que li diguem. En el moment en el que no li diguem res,
/el lloro ens dirà adeu i és tancarà
*/
public class Lloro {
	public static void main (String[] args) {

		boolean bucle = true; 
		while (bucle) {
			System.out.println("El lloro espera paraula:");
			String repeticio= Entrada.readLine();
			if (!repeticio.isBlank()) {
					System.out.println("El lloro repeteix: " + repeticio);					
					}			
			else {
				System.out.println("Adéu");
				bucle = false;
				}
			}
		}
	}
				
		
