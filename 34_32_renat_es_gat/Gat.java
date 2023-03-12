/*Classe Java que conté
/tots els membres del Gat
*/
public class Gat {
   private int vides = 7;
   private String posicio = "estirat";
   
   public String getPosicio() {
        return posicio;
    }

    public int getVides() {
        return vides;
    }

    public void setVides(int novesVides) {
        if(novesVides >= 0 && novesVides <= 7);
        vides = novesVides;
    }

    public void setPosicio(String novaPosicio) {
        if ( novaPosicio.equals("dret")| 
             novaPosicio.equals("assegut")|
             novaPosicio.equals("estirat")){
             posicio = novaPosicio;
        }
    }
}
