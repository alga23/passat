/*Aquest programa gafarà un text i mostrarà
/solament les lletres que tindrà aquest, eparades per comes
*/
public class NomesLletres{
	public static void main (String[] args) {
		System.out.println("Text?");
		String text = Entrada.readLine();
		
		filtraLletres(text);
		}
		
	public static void filtraLletres (String text) {
		System.out.print(text.charAt(0));
		for (int i = 1; i <=text.length()-1; i++) {
			char lletra = text.charAt(i);

			if (Character.isLetter(lletra)){
				System.out.print(", ");
				System.out.print(lletra);

				
			if (lletra == text.length()-1) {
				System.out.print(lletra);
				
			}
		}								      
				for (int j = text.length()-1; j < text.length();j++){  
					char lletraFinal = text.charAt(j);
					if (Character.isLetter(lletraFinal)){
					System.out.print(lletraFinal);
					} 
					
					
					}
				}
			}
		}
		
		
	

	
