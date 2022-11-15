/*Demanarem dos nombres i sumarem tots els nombres que hi ha entre
/els dos
*/
public class SumaInterval {	
	public static void main (String[] args) {
		System.out.println("inici?");
		int inici = Integer.parseInt(Entrada.readLine());
		
		System.out.println("final?");
		int ultim = Integer.parseInt(Entrada.readLine());
		

		
		if (inici < ultim) {
		int diferencia = ultim - inici;
			
			for (int i = 0; i < diferencia; i++) {
				int x = i-1;
				int y = i+1;
				int suma = x + y;
				System.out.println(suma); 
				}
				}
		
		else if (inici > ultim) {
			
			for (int i = ultim; i > inici; i--) {
				int suma = (i+1) + i;
				System.out.println(suma); 
		}
	}
}
}

			
			

			
			 
		
		
		
		
		
