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
		
		invocaLloro(paraula);
		
		if (paraula.isEmpty()){
			invocaLloro(paraula);
			}
			
		
	}
	public static void invocaLloro(String paraula) {
		
			lloro(paraula);
			
			if (paraula.isEmpty()){
				lloro(paraula);
			}	
			

			}
		
	public static void lloro (String paraula) {
	
		if (UtilString.esVocal(paraula)) {
			System.out.println("El lloro diu: " + paraula);
			System.out.println("El lloro demana paraula amb vocal a l'inici o/i final");  
			paraula=Entrada.readLine();
			if (!paraula.isEmpty()){
			invocaLloro(paraula);
			}
			
			else {
				System.out.println("El lloro demana confirmació per finalitzar");
				
				paraula = Entrada.readLine();
				
				if(UtilitatsConfirmacio.respostaABoolean(paraula)){
					System.out.println("Adéu");
					}
				else {
					System.out.println("El lloro demana paraula amb vocal a l'inici o/i final");
					invocaLloro(paraula);
					}
				}
			}
		}
	}
				
		
