/*Utilitzem el bucle per indicar quins nombres
/hi ha de salt (afegit per l'usuari) entre un 
/valor inicial i un final
*/
public class EntersIniciFi {
	public static void main (String[] args) {
		System.out.println("Valor inicial?");
		int valorInicial = Integer.parseInt(Entrada.readLine());
		
		System.out.println("Valor final?");
		int valorFinal = Integer.parseInt(Entrada.readLine());
		
		System.out.println("Salt?");
		int salt = Integer.parseInt(Entrada.readLine());
		
		for (int i = valorInicial; i < valorFinal; i = i + salt) {
			System.out.println(i);
			}
		}
	}
