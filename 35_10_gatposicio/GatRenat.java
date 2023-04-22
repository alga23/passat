/*El ostre amic Renat que ja hem
/utilitzat a altres exercicis i
/durant la majoria de la UF4
*/
public class GatRenat{
  
    GatPosicio posicio=GatPosicio.ESTIRAT;

  public GatRenat(GatPosicio posicion){
      this.posicio=posicion;
  }
 

  public GatRenat(){
   }

  public GatPosicio getPosicio(){
     return this.posicio;
  }

  public void setPosicio(GatPosicio posicion){
       this.posicio = posicion;
  }
  }

 
