/*
/Aquest programa s'encarrega de donar-nos un
/dia de la setmana com a resposta al número que
/li donem però a diferència de l'anterior exercici el que farem serà
/utilitzar el switch i no el condicionals if, else if i else
*/

public class DiaSetmana {
	public static void main (String[] args) {
		int numero = Integer.parseInt(args[0]);
		switch(numero) {
		//dilluns
			case 1:
				System.out.println("Dilluns");
				break;
		//dimarts
			case 2:
				System.out.println("Dimarts");
				break;
		//dimecres
			case 3:
				System.out.println("Dimecres");
				break;
		
		//dijous
			case 4:
				System.out.println("Dijous");
				break;
				
		//divendres
			case 5:
				System.out.println("Divendres");
				break;
				
		//dissabte
			case 6:
				System.out.println("Dissabte");
				break;
		
		//diumenge
			case 7:
				System.out.println("Diumenge");
				break;
				
		//qualsevol entrada que no sigui un dels set nombres inclosos
			default:
				System.out.println("Error");
				}
			}
		}
	
