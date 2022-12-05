/*Aquest programa agafa el caràcter d'un text (el que l'indiquem)
/i aquest ens dirà qsi es tracta d'una lletra, un nombre, una
/altra cosa o si esta fora de rang
*/
public class AnalitzaCaracter{
	public static void main (String[] args) {
		System.out.println("Text?");
		String cadena = Entrada.readLine();
		System.out.println("Posició?");
		int nombre = Integer.parseInt(Entrada.readLine());
		if (nombre < 0) {
			System.out.println("Fora de rang");
			
			}
			
		
		if (nombre > 0){
		char caracterEscollit = cadena.charAt(nombre);
		
		
		analitzaCaracter(caracterEscollit, cadena);
		}
		
		
		}
	public static void analitzaCaracter(char caracter, String cadena) {
		
		 if(Character.isDigit(caracter)){
			System.out.println("'"+caracter+ "' és un nombre");
			int nombreCaracter = caracter;
			if (nombreCaracter < 0 || nombreCaracter > cadena.length()){
				System.out.println("Fora de rang");
			}
			
			
			}
		else if(Character.isLetter(caracter)){
			System.out.println("'"+caracter+ "' és una lletra");
			}
		else {
			System.out.println("'"+caracter+ "' és una altra cosa");
			}
		}
	}
			
		


		
		 
		

