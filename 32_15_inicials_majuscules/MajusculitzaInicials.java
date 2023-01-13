/*Programa que agafa un text 
/ i ens ho retorna amb les
/inicials en majucules
*/
public class MajusculitzaInicials{
	public static void main (String[] args) {
		System.out.println("Text?");
		String text = Entrada.readLine();
		majusculitzaInicials(text);
		
	}
	public static void majusculitzaInicials(String text){
		StringBuilder nouText = new StringBuilder();


		for (int i = 0; i <text.length(); i++) {
			if (i == 0) { 	
				System.out.print(Character.toUpperCase(text.charAt(i)));
							
			}
 			else if (Character.isLetter(text.charAt(i)) && Character.isLetter(text.charAt(i - 1)) == false) {
 				System.out.print(Character.toUpperCase(text.charAt(i)));
 			} else {
 				System.out.print(Character.toLowerCase(text.charAt(i)));
 			}
 		}
 		System.out.println();
 	}
 }
			
				
