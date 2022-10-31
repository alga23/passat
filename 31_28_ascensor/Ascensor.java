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
		
		if (pis.equals("planta baixa") && boto.equals("pujar un")) {
			System.out.println("primer pis");
			}
		
		else if (pis.equals("planta baixa") && boto.equals("pujar dos")) {
			System.out.println("segon pis");
			}
		
		else if (pis.equals("primer pis") && boto.equals("pujar un")) {
			System.out.println("segon pis");
			}
			
		
		else if (pis.equals("primer pis") && boto.equals("baixar un")) {
			System.out.println("planta baixa");
			}
			
		
		else if (pis.equals("segon pis") && boto.equals("baixar un")) {
			System.out.println("primer pis");
			}
			
			
		else if (pis.equals("segon pis") && boto.equals("baixar dos")) {
			System.out.println("planta baixa");
			}
			
		else if (pis.equals("planta baixa") && boto.equals("pujar un")) {
			System.out.println("primer pis");
			} 
		else {
			System.out.println("error");
			
		
		
	}
}
}
			
