/*
/Aquest programa s'encarrega de donar-nos un
/dia de la setmana com a resposta al núero que
/li donem
*/

public class DiaSetmana {
	public static void main (String[] args) {
		int numero = Integer.parseInt(Entrada.readLine());
		//dilluns
		if (numero == 1) {
			System.out.println("Dilluns");
			}
		
		//dimarts
		if (numero == 2) {
			System.out.println("Dimarts");	
			}
			
		//dimecres
		if (numero == 3) {
			System.out.println("Dimecres");
			}
			
		//dijous
		if (numero == 4) {
			System.out.println("Dijous");		
			}
			
		//divendres
		if (numero == 5) {
			System.out.println("Divendres");	
			}
			
		//dissabte
		if (numero == 6) {
			System.out.println("Dissabte");	
			}
			
		//diumenge
		if (numero == 7) {
			System.out.println("Divendres");	
			}
			
		//qualsevol entrada que no sigui un dels set nombres inclosos
		
		else {
			System.out.println("Divendres");
			}
		}
	}
