/*Programa que rebrà una cadena i un nombre
/i repetira els caràcters de la caena ( en cas de que
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
	public void static mostraCadenaContinua(String text ,int nombre){
		for (int i = 0; i < nombre; i++){
			char caracter = text.charAt(i);
			
		
	
