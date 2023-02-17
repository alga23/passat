/*Versió del GatRenat que ens dirà 
/que es pot cambiar les vides i la posicio
/.La posició té que ser un canvi en especific,
/s no ens mostrarà la predeterminada (estirat)
*/
public class GatRenat {
    private int vides = 7;
    private String posicio = "estirat";
    public GatRenat(int vides, String posicio) {
        setVides(vides);
        setPosicio(posicio);
    }
    public int getVides() { return vides; }
    public void setVides(int novesVides) {
        if (novesVides >= 0)  {
            vides = novesVides;
        }
    }
    public void setPosicio(String novaPosicio){
    	if (novaPosicio.equals("dret")){
    		posicio = novaPosicio;
    		}
    	else {
    		posicio = "estirat";
    		}
    	}
    @Override
    public String toString() { return String.format("Vides: %d. Posició: %s", vides, posicio); }
    public static void main(String[] args) {
        System.out.println(new GatRenat(7, "dret"));
    }
}
