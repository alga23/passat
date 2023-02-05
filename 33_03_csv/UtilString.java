/*En esta clase se crea un módulo que recibe una cadena de  texto, analiza si se trata de una cadena que solo contenga enteros, si es así devolvera un true caso contrario false*/

public class UtilString{

    
   public static boolean esEnter(String texto){
   
   boolean blComprueba = texto.matches("-?\\d+");
   
       if(blComprueba || texto.contains("+")){
        return true;
       }
       else
       return false;
   
   }
}
