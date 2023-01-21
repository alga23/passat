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
		
		System.out.println("final?");
		int nFinal = Integer.parseInt(Entrada.readLine());
		
		
		if(nFinal > text.length()-1){
      			nFinal = text.length()-1;
    			}
    		if(inici > text.length()-1){
      			inici= text.length()-1;
    }
 
    mostraInterval(text, inici, nFinal);
    }
 
public static void mostraInterval(String text, int inici, int nFinal) {
	  if(inici < 0) {
	       inici = 0; 
    }
  	if(nFinal < 0) {
    		nFinal = 0;}
  		if(inici >= 0 || nFinal >= 0) {
    			if (inici < nFinal) {
     				 for (int i = inici; i <= nFinal; i++) {
        System.out.println(text.charAt(i));   
      }
   }else if(inici >= nFinal) {
      for(int i = inici; i >=nFinal; i++) {
      System.out.println(text.charAt(i));
      } 
  }
  }
}
}
	
		

		
	
		

			
				 
		
			

    

				 
				
		
		
		
		
	
	




				

		
		
		
		
