/*Programa que rebrà una cadena i un nombre
/i repetira els caràcters de la cadena ( en cas de que
/acabi, torna a començar) fins a arribar al nombre
*/
public class CadenaContinua{
	public static void main (String[] args){
		System.out.println("Text?");
		String text = Entrada.readLine();
		if (text.equals("")){
			System.out.println("Error");
			}
		else{
		System.out.println("Nombre?");
		int nombre = Integer.parseInt(Entrada.readLine());
		if (nombre < 0){
			}
			else {
			mostraCadenaContinua(text, nombre);
			}
		}
	}
	public static void mostraCadenaContinua(String text ,int nombre){
		if(text.length() >= 1) {
        		int paraules = nombre / text.length();
        		for(int palabra = 1; palabra <= paraules; palabra++) {
           			 System.out.print(text);
        }
        int letras = nombre % text.length();
        for(int posicio = 0; posicio <= letras -1; posicio++) {
           System.out.print(text.charAt(posicio));
        }
			
			}
		}
	}
			
		
	
