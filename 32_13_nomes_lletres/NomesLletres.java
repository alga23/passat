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
		String fraseAmbComes = "";
		for (int i = 0; i < text.length(); i++){
			if (Character.isLetter(text.charAt(i))){
				if(i + 1 > text.length()){
				
				fraseAmbComes = fraseAmbComes+text.charAt(i);
				
				}
			else{
				fraseAmbComes = fraseAmbComes+text.charAt(i) +  ", ";
				}
			
			}
			System.out.println(fraseAmbComes);

			}
		}
	}
		
		
	
		
			
			
		

		
