/*Crearem un programa que
/agafarà un String i posarà
/les seves lletres entre parentesis
*/
public class Parentitza {
	public static void main (String[] args) {
		System.out.println("Text?");
		String text = Entrada.readLine();
		
		parentitza(text);
		}
		
	public static void parentitza(String text) {
		for (int posicio = 0; posicio < text.length(); posicio++) {
		      char caracter = text.charAt(posicio);
		      if(Character.isLetter(caracter)) {
		      System.out.print("(" + text.charAt(posicio) + ")");
		      }else {
		      System.out.print(text.charAt(posicio));
		      }
		     }
		   }
		 }
