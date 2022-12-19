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
		for (int i = 0; i < text.length()-1; i++) {
			char lletra = text.charAt(i);
												      System.out.print(lletra + ", ");
				}								      
				for (int j = text.length()-1; j < text.length();j++){  
					char lletraFinal = text.charAt(j);
					System.out.print(lletraFinal); 
					//while (lletra == text.charAt(text.length() -1)) {
						//System.out.print(lletra);
					
					}
				}
			}
		
	

	
