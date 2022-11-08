/*Aquest exercici és una versió de l'anterior on l'usuari pot cancelar el joc
/ sempre que ell vulgui introduint una cadena buida
*/
public class EndevinaNombre {
	public static void main(String[] args) {
		//posem els primer dos nombres
		System.out.println("Ves introduint enters entre 1 i 100 fins que encertis el que jo he pensat");
		int nombreAEndevinar = 42;
		int nombre = 0;
		String entrada = "";
		
		while ( nombreAEndevinar != nombre ) {
			System.out.println("Introdueix un valor");
			entrada = Entrada.readLine();
			
			 if (entrada.equals("")){
				System.out.println("Cancel·lat!");
				entrada = "42";
				nombre = Integer.parseInt(entrada);
			
			else if (nombre == nombreAEndevinar) {
			 	nombre = Integer.parseInt(entrada);
	 			System.out.println("Has encertat!");
	 			}
	 			
				
			
			
	 		
	 		//programen tots els possibles 
	 		//camins que l'usuari pot tomar
	 		if (!entrada.isEmpty()); {
	 			nombre = Integer.parseInt(entrada);
				
	 		 if (nombre < nombreAEndevinar) {
	 		 	if (nombre <=0) {
	 		 		System.out.println("Com a mínim 1");
	 		 		}
	 		 	else {
	 		 	System.out.println("És més gran que " + nombre);
	 		 	}
	 		 }

	 		 else if (nombre > nombreAEndevinar) {
	 		 	if (nombre > 100) {
	 		 		System.out.println("Com a màxim 100");
	 		 		}
	 		 	else {
	 		 	System.out.println("És més petit que " + nombre);
	 		 	}
	 		 }
	 		 
	 		
	 	
	 		
	 		
	 		}
	 		}
	 			
	 			
			
				}
							
				
				}
	 		
	 	
	 
	
