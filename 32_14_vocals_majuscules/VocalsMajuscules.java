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
		for (int i = 0; i <= text.length(); i++) {
			char lletra = text.charAt(i);
			String nouText;
			if (lletra == 'a' || lletra == 'e' || lletra == 'i' || lletra == 'o' || lletra == 'u' ){
				lletra = Character.toUpperCase(lletra);
				}
			System.out.print(lletra);
			}
		}
	}
