/*Agafarem un text amb aquest programa i
/ho posarem amb totes les lletres
/al reves
*/
public class TextReves {
	public static void main (String[] args) {
		System.out.println("Text?");
		String text = Entrada.readLine();
		
		mostraReves(text);
		
		}
	public static void mostraReves(String text){
    		StringBuilder nouText = new StringBuilder();

		for (int i = text.length() -1; i >= 0; i--) {
			if( i < text.length() - 1) {
			nouText.append(", " + text.charAt(i));
			}
			System.out.println(nouText.toString());
			}

		}
	}

