/*Aquest programa agafarà un String i ens
/mostrara un interval que començarà a partir
/del nombre que nosaltres li diguem i acabarà
/a partir del que li diguem
*/
public class MostraInterval {
	public static void main (String[] args) {
		System.out.println("text?");
		String text =Entrada.readLine();
		System.out.println("inici?");
		int inici = Integer.parseInt(Entrada.readLine());
		if (inici < 0){
			inici = Math.abs(text.length()+inici);
			}
		System.out.println("final?");
		int nFinal = Integer.parseInt(Entrada.readLine());
		
	
		
		mostraInterval(text, inici, nFinal);
		}
		
	public static void mostraInterval(String text, int inici, int nFinal) {
		if (inici < nFinal) {
			if (nFinal > text.length()){
				for(int i =inici; i < text.length(); i++){
					System.out.println(text.charAt(i));
				}
			}
			else if (inici < 0) {
				for(int i =0; i < text.length(); i++){
					System.out.println(text.charAt(i));
					}
				}
				
			else{
				
				for(int i =inici; i <= nFinal; i++){
				System.out.println(text.charAt(i));
				}
			}
		}
			
			
		else if(inici > nFinal) {
			
      			for(int i = inici; i >= nFinal; i--) {
      				System.out.println(text.charAt(i));
			}
				}
				
		else {
			for(int i =0; i < text.length(); i++){
					System.out.println(text.charAt(i));
		
		
			}
		}
	}
}
		

			
				 
		
			

    

				 
				
		
		
		
		
	
	




				

		
		
		
		
