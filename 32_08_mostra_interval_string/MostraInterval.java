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
	
		
		if(nInici> text.length()-1){
      			nFinal = text.length()-1;
   			 }
    		if(nFinal > text.length()-1){
     			 nInici = text.length()-1;
   			 }
 
    		mostraInterval(text, nInici, nFinal);
    }
 
public static void mostraInterval(String text, int nInici, int nFinal) {
  	if(nInici < 0) {
       		nInici = 0; 
    		}
  	if(nFinal < 0) {
    		nFinal = 0;
    		}
  	if(nInici >= 0 || nFinal >= 0) {
    		if (nInici < nFinal) {
    			int ultimCar = text.length()-1;
      			for (int i = nInici; i <= ultimCar; i += 1) {
        			System.out.println(text.charAt(i));   
      				}
   		}
   		else if(nInici >= nFinal) {
      		for(int i = nInici; i >=nFinal; i -=1) {
      			System.out.println(text.charAt(i));
      } 
  }
  }
}
}
			

    

				 
				
		
		
		
		
	
	




				

		
		
		
		
