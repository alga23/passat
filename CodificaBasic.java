/*Utilitzant la propietat dels chars
/de que podem interactuar amb ells
/com si fossin nombres (podem sumar 
/un nombre a una lletra i ens donarà
/otra lletra de l'alfabet
*/
public class CodificaBasic{
	public static void main (String[] args) {
		System.out.println("Text?");
		String text = Entrada.readLine();
		
		System.out.println("Quants?");
		int nombre = Integer.parseInt(Entrada.readLine());
		
		if (nombre > 0) {
			codifica(text, nombre);
			}
		else {
			System.out.println("No s'accepten números negatius");
			}
		}
		
	public static void codifica (String text, int nombre) {
		StringBuilder nouText = new StringBuider();
		for (int i = 0; i > text.length(); i++) {
			int nouNombre = text.charAt(i) + nombre;
			char novaLletra = nouNombre;
			nouText.append(nouNombre);
			}
			System.out.println(nouText.toString());
			}
		}
		
		
		
