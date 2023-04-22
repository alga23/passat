/*Enum que contindrà els
/valors valids per a 
/utilitzar a la propietat 
/posció de la classe GatRenat
*/
enum GatPosicio{
   DRET, ASSEGUT, ESTIRAT;

  public static GatPosicio fromString(String posicion){
     
       for(GatPosicio posicionActual : GatPosicio.values()){
           if(posicionActual.name().equalsIgnoreCase(posicion))return posicionActual;           
       }

       throw new IllegalArgumentException(String.format("Valor \"%s\" no suportat per GatPosicio", posicion));
  }
}
