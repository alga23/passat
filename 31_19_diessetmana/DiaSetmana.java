/*
/Aquest programa s'encarrega de donar-nos un
/dia de la setmana com a resposta al núero que
/li donem
*/

public class DiaSetmana {
	public static void main (String[] args) {
		int numero = Integer.parseInt(args[0]);
		//dilluns
		if (numero == 1) {
			System.out.println("Dilluns");
			}
		
		//dimarts
		else if (numero == 2) {
			System.out.println("Dimarts");	
			}
			
		//dimecres
		else if (numero == 3) {
			System.out.println("Dimecres");
			}
			
		//dijous
		else if (numero == 4) {
			System.out.println("Dijous");		
			}
			
		//divendres
		else if (numero == 5) {
			System.out.println("Divendres");	
			}
			
		//dissabte
		else if (numero == 6) {
			System.out.println("Dissabte");	
			}
			
		//diumenge
		else if (numero == 7) {
			System.out.println("Diumenge");	
			}
			
		//qualsevol entrada que no sigui un dels set nombres inclosos
		
		else {
			System.out.println("Error");
			}
		}
	}
