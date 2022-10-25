/*Simulació d'una transacció de diners entre
/dues persones. Un pregunta per el preu i l'altre
/paga. Si falten o sobren diners el programa ho dirà.
*/
public class Pagament {
	public static void main (String[] args) {
		System.out.println("Preu?");
		int preu = Integer.parseInt(Entrada.readLine());
		
		System.out.println("Paga?");
		int pagament = Integer.parseInt(Entrada.readLine());
		
		if (preu > pagament) {
			int dinersQueFalten = preu - pagament;
			System.out.println("Falten " + dinersQueFalten + "€");
			
		}else if (preu < pagament) {
			int dinersQueSobren= pagament - preu;
			System.out.println("Sobren " + dinersQueSobren + "€");
			
		}else {
			System.out.println("No sobra ni falta res");
			}
		}
	}
			

