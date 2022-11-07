/*Petit joc on l'usuari té que averiguar un nombre donat per el programa
/.Li donarem diferents respostes depenent del número que li posi l'usuari
/i el programa acabarà quan l'usuari ho endevini el nombre
*/
public class EndevinaNombre {
	public static void main(String[] args) {
		//posem els primer dos nombres
		System.out.println("Ves introduint enters entre 1 i 100 fins que encertis el que jo he pensat");
		int nombreAEndevinar = 42;
		int nombre = 0;
		
		while ( nombreAEndevinar != nombre ) {
			System.out.println("Introdueix un valor");
			nombre = Integer.parseInt(Entrada.readLine());
	 		
	 		//programen tots els possibles 
	 		//camins que l'usuari pot tomar
	 		 if (nombre < nombreAEndevinar) {
	 		 	if (nombre < 0) {
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
	 		 
	 		
	 	
	 		
	 		else if (nombre == nombreAEndevinar) {
	 			System.out.println("Has encertat!");
	 			}
	 		
	 	}
	 }
	}
	 			
	 	
