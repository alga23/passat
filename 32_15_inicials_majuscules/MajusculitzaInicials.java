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
			if ( Character.isWhitespace(lletra)){
				int vocalNombre= text.indexOf(lletra) -1; 
				char vocalMajuscula = text.charAt(vocalNombre);	nouText.append(Character.ToUpperCase(vocalMajuscula));
				}
				else {
				nouText.append(i);
				}
			}
			String textFinal = nouText.ToString();
			System.out.println(textFinal);
		}
	}
				
