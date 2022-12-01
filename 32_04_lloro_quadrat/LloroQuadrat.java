/*Aquesta és una nova versió del lloro 
/en la que quan li diguem dibuixa quadrat o
/dibuixa rectangle ens dibuixarà la forma corresponent 
*/
public class LloroQuadrat {
	public static void main (String[] args) {

		boolean bucle = true; 
		while (bucle) {
			System.out.println("El lloro espera paraula:");
			String repeticio= Entrada.readLine();
			if (repeticio.equals("dibuixa rectangle")){
				dibuixaRectangle();
				}
				
			else if (repeticio.equals("dibuixa quadrat")){
				dibuixaQuadrat();
				}	
			else if (!repeticio.isBlank()) {
					System.out.println("El lloro repeteix: " + repeticio);	
					
			}				
							
			
			/*else if (repeticio.equals("dibuixa rectangle")){
				dibuixaRectangle();
				}
			
			else if (repeticio.equals("dibuixa quadrat")){
				dibuixaQuadrat();
				}*/	
			else {
				System.out.println("Adéu");
				bucle = false;
				}
			}
		}
		
		
		public static void dibuixaRectangle(){
			for (int i = 1; i<=5; i++){
				for (int j = 1; j<=10; j++){
					System.out.print(" X");
					}
				System.out.println("");
					
	}
	}
	public static void dibuixaQuadrat(){
			for (int i = 1; i<=5; i++){
				for (int j = 1; j<=5; j++){
					System.out.print(" X");
					}
				System.out.println("");
				}
			}
		}
