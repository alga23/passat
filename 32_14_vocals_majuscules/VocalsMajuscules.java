/*Agafarem un text i posarem
/en majuscula totes les vocals
/que el nostre rograma hi trobi.
/Ho farem utilitzant un modul
*/
public class VocalsMajuscules {
	public static void main (String [] args) {
		System.out.println("Text?");
		String text = Entrada.readLine();
		
		majusculitzaVocals(text);
		}
		
	public static void majusculitzaVocals (String text) {
		StringBuilder nouText = new StringBuilder();
		for (int i = 0; i < text.length(); i++) {
			char lletra = text.charAt(i);
			
			
			if (lletra >= 'A' && lletra <= 'Z' && lletra != 'A' && lletra != 'E' && lletra != 'I' && lletra != 'O' && lletra!= 'U'){
			
				nouText.append(Character.toLowerCase(lletra));
				
			}else if (lletra == 'a' || lletra == 'e' || lletra == 'i' || lletra == 'o' || lletra == 'u') {
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
		
	
		
	
