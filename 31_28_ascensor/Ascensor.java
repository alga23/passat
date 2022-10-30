/*Aquest programa simularà un ascensor 
/dùn pis de tres plantes. Demanarem el 
/pis on està i el botó que té que pulsar
/per anar a un pis determinat. Si no 
/esta programat el pis i el botó, el 
/programa retornarà error
*/
public class Ascensor {
	public static void main (String[] args) {
		System.out.println("pis?");
		String pis = Entrada.readLine();
		
		System.out.println("botó?");
		String boto = Entrada.readLine();
		
		if (pis == "planta baixa" && boto == "pujar un") {
			System.out.println("primer pis");
			}
		
		else if (pis == "planta baixa" && boto == "pujar dos") {
			System.out.println("segon pis");
			}
		
		else if (pis == "primer pis" && boto == "pujar un") {
			System.out.println("segon pis");
			}
			
		
		else if (pis == "primer pis" && boto == "baixar un") {
			System.out.println("planta baixa");
			}
			
		
		else if (pis == "segn pis" && boto == "baixar un") {
			System.out.println("primer pis");
			}
			
		
		else if (pis == "segon pis" && boto == "pujar dos") {
			System.out.println("planta baixa");
			}
			
		else {
			System.out.println("error");
			}
		}
	}
			
