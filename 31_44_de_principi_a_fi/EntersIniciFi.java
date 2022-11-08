/*Pedirem tres nombres a l'usuari:
/un inicial, un final i un salt.
/El que farem és dir-li a l'usuari 
/quants nombres de salt hi ha entre
/l'inicial i el final
*/
public class EntersIniciFi {
	public static void main (String[] args) {
		//demanem l'inicial
		
		System.out.println("Valor inicial?");
		int valorInicial =Integer.parseInt(Entrada.readLine());
		//demanem el final
		
		System.out.println("Valor final?");
		int valorFinal =Integer.parseInt(Entrada.readLine());
		
		//demanem el de salt
				
		System.out.println("Salt?");
		int salt =Integer.parseInt(Entrada.readLine());
		
		while (valorInicial <= valorFinal) {
			System.out.println(valorInicial);
			valorInicial = valorInicial +salt;
			}
		}
	}
		
