/*Nou EnvoltaString que aquesta vegada
/ens permitirà comparar un EnvoltaString
/amb un String
*/
public class EnvoltaString {
    private String valor;

    public EnvoltaString(String otroValor) {
      
      this.valor = otroValor; 
    }

    public String toString() { 
      return String.format("ENVOLTAT(\"%s\")", valor); 
    }
    
    public boolean equals(EnvoltaString altre) {
       boolean confirma = getValor(altre.valor);     
	       if(confirma){
		 return true;
	       }
		else {
		return false;
		}
     }
     
    @Override
    public boolean equals(Object obj) {
	    if (obj instanceof String) {  
		String valorRecivido = (String)obj;
		boolean confirma = getValor(valorRecivido);	
			if(confirma){
			return true;
			}
			else{
			return false;
			}
	    }
         return false;
}
    
    public boolean getValor(String otroValor){    
	      if(valor.equalsIgnoreCase(otroValor)){
		return true;
	      }
	       return false;
	      }
    }

