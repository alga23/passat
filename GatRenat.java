/*Versió del GatRenat modificicat
/per a que solament només pugui 
/agafar una instancia
*/
public class GatRenat {
	  private static GatRenat instancia;
 	  private int vides = 7;
    	  private String posicio = "estirat";
    	
    	private  GatRenat(int vides, String posicio) {
        setVides(vides);
        setPosicio(posicio);
    }
    
    	private GatRenat () {
    		this.getVides();
    		this.getPosicio();
    		}
    	private GatRenat(int vides) {
    		this.setVides(vides);
    		}
    	private GatRenat (String posicio){
    		this.setPosicio(posicio);
    		}
    public static GatRenat getInstancia(){
    	if (instancia == null) {
            instancia = new GatRenat();
        }
        return instancia;
    }
     public static GatRenat getInstancia(int vides){
           if (instancia == null) {
            	instancia = new GatRenat(vides);
        }
        return instancia;
    }
     public static GatRenat getInstancia(String posicio){
        if (instancia == null) {
            instancia = new GatRenat(posicio);
        }
        return instancia;
    }
     public static GatRenat getInstancia(int vides, String posicio){
         if (instancia == null) {
            instancia = new GatRenat(vides, posicio);
        }
        return instancia;
    }
    public int getVides() { return vides; }
    public String getPosicio() { return posicio; }
    public void setVides(int novesVides) {
        if (novesVides >= 0)  {
            vides = novesVides;
        }
    }
    public void setPosicio(String posicio){
    	if (posicio.equals("dret")){
    		this.posicio = posicio;
    		}
    	else if (posicio.equals("assegut")){
    		this.posicio = "assegut";
    		}
    	else {
    		this.posicio = "estirat";
    		}
    	}
    @Override
    public String toString() { return String.format("Vides: %d. Posició: %s", vides, posicio); }
    public static void main(String[] args) {
    GatRenat[] renats = {
        new GatRenat(),         // tot per defecte
        new GatRenat(8),        // 8 vides i posició per defecte
        new GatRenat("dret"),   // posició dret i vides per defecte
        new GatRenat(8, "dret") // 8 vides i posició dret

    };
    for (GatRenat renat: renats) {
        System.out.println(renat);
    }
}
}
