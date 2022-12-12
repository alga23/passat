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
			char caracterEscollit = cadena.charAt(nombre);
			
			}
			
			
		
		if (nombre > 0){
		char caracterEscollit = cadena.charAt(nombre);
		
		
		analitzaCaracter(caracterEscollit, cadena);
		}
		
		
		
		}
	public static void analitzaCaracter(char caracter) {
		
		 if(Character.isDigit(caracter)){
			System.out.println("'"+caracter+ "' és un nombre");
			
			
			
			
			}
		else if(Character.isLetter(caracter)){
			System.out.println("'"+caracter+ "' és una lletra");
			}
		else {
			System.out.println("'"+caracter+ "' és una altra cosa");
			}
		}
	}
			
		


		
		 
		

