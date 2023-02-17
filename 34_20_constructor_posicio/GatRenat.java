/*Versió inmutable del GatRenat
/que contè solament el nombre
/de vides i la posició
*/
public class GatRenat {
    private int vides;
    private String posicio;
    public GatRenat() {
        vides = 7;
        posicio = "estirat";
    }
    @Override
    public String toString() {
        return String.format("Vides: %d. Posició: %s", vides, posicio);
    }
    public int getVides() { return vides; }
    
    public String getPosicio() { return posicio; }
    }

