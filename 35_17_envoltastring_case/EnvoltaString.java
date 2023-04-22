/*Clase EnvoltaString que considerarà
/igual dos EnvoltaString encara que 
/no encaixin en les majuscules i 
/minuscules (no és case sensitive)
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
    
    
    public boolean getValor(String otroValor){
    
      if(valor.equalsIgnoreCase(otroValor)){
        return true;
      }
       return false;
      }
    }

