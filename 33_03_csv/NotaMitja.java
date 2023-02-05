/*Auest programa agafarà les dades
/d'un fitxer csv. Aquestes dades són
/les notes d'un estudiants, i farem
/les mitjanes d'aquestos
*/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class NotaMitja {
    public static void main (String[] args) throws IOException {
        String cami = "notes.csv";
        FileReader fileReader = new FileReader(cami);
        BufferedReader input = new BufferedReader(fileReader);
        
        double parseDouble=0.0;
    	double sumaDoubles =0.0;
    	int intContador=0;
       
        String strLinia = input.readLine();
    	intContador += 1;
             
	while (true) {   		    
		sumaDoubles=0;
		strLinia = input.readLine();   
		   
			   if (null != strLinia){
			     intContador += 1;
			   }
			   		    
			   if(intContador>1){
				    if(null == strLinia)break; 				    
				    String []cadena = strLinia.split(",");   					     
				    System.out.print(cadena[0]+ " ");
				    for(int i =1; i<cadena.length; i++){          
				    boolean blConfirma= UtilString.esEnter(cadena[i]);				    
					if(blConfirma){
					parseDouble = 
Double.parseDouble(cadena[i]);                  
				 sumaDoubles = sumaDoubles + parseDouble;
						 }
				     
				    }
			    
			  }
			  else{
			  System.out.println("Cap entrada");return;
			  }
			  
			  System.out.printf( "(%.2f)%n", sumaDoubles/6 );      
		  
		} 
            
        input.close();
    }
}
       
    			
    			 
    			
    				
    	
    	

