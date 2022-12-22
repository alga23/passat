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
			char lletra = text.charAt(i);
			char lletraSeguent = text.charAt(i +1);
			if (Character.isWhitespace(lletraSeguent)){
				nouText.append(Character.toUpperCase(lletra));
				}
				else {
					nouText.append(lletra);
					}
				}
				String textFinal = nouText.toString();
				System.out.println(textFinal);
				}
			}
				
