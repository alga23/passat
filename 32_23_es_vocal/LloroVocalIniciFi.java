/*Versió del lloro que agafa 
/una cadena i si comença amb 
/vocal o/i acaba amb vocal,
/el lloro repeteix i ens torna 
/a preguntar.Si no, acabara
/el programa
*/
public class LloroVocalIniciFi {
	public static void main (String[] args) {
		System.out.println("El lloro demana paraula amb vocal a l'inici o/i final");
		String paraula = Entrada.readLine();
			lloro(paraula);
			
			}
		
		
	public static void lloro(String paraula) {
	if (paraula.isEmpty()) {
			System.out.println("El lloro demana confirmació per finalitzar");
			String finalitzar = Entrada.readLine();
			
			if (UtilitatsConfirmacio.respostaABoolean(finalitzar) == false) {
				System.out.println("El lloro demana paraula amb vocal a l'inici o/i final");
				paraula = Entrada.readLine();
				lloro(paraula);
				}
			else if (UtilitatsConfirmacio.respostaABoolean(finalitzar) == true){
			System.out.println("Adéu");
			}
		}
		else if (UtilString.esVocal(paraula) == true) {
			System.out.println("El loro diu: " + paraula);
			System.out.println("El lloro demana paraula amb vocal a l'inici o/i final");
			paraula = Entrada.readLine();
			lloro(paraula);
			}
		else if (UtilString.esVocal(paraula) == false) {
			System.out.println("El lloro demana paraula amb vocal a l'inici o/i final");
			paraula = Entrada.readLine();
			lloro(paraula);
			}
		
		}
	}

				
			
			
			 
			

	
	
	
				
		
