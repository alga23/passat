/*Aquest rpograma agafarà un String i ens
/mostrara un interval que començarà a partir
/del ombre que nosaltres li diguem i acabarà
/a partir del que li diguem
*/
public class MostraInterval {
	public static void main (String[] args) {
		System.out.println("text?");
		String text =Entrada.readLine();
		System.out.println("inici?");
		int nInici = Integer.parseInt(Entrada.readLine());
		System.out.println("final?");
		int nFinal = Integer.parseInt(Entrada.readLine());
		
		mostraInterval(text, nInici, nFinal);
		}
		
		public static void mostraInterval(String text, int nInici, int nFinal){
		if (nInici > nFinal) {
			for(int i = nInici; i >= nFinal; i--){
				char lletra = text.charAt(i);
				System.out.println(lletra);
				}
				if (nInici > text.length()){
				
			}
		}
				
		
		else if (nInici < nFinal){
			for (int i = nInici; i <= nFinal; i++){
				char lletra = text.charAt(i);
				System.out.println(lletra);
			}
		}
		else if (nFinal > text.length()){
			for (int i = nInici; i <= text.length();i++){
			char lletra = text.charAt(i);
			System.out.println(lletra);
			}
		}
	}
}
    

				 
				
		
		
		
		
	
	




				

		
		
		
		
