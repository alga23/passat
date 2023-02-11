//Classe que contè al GatRenat i els seus parametres
//(posicio i vides) més els mètodes booleans
// que confirmen el seu estat amb un true o
//un false

/*declarem e inicialitzem les variables */
public class GatRenat{
	private int vides = 7;
	private boolean estaViu = true;
	private boolean estaDret = false;
	private boolean estaAssegut = false;
	private boolean estaEstirat = true;
	private String posicio = "estirat";
	
	//posem els set i els get de vides
	public int getVides() {
		return vides;
	}
	 public void setVides(int novesVides) {
        if (novesVides >= 0) {
            vides = novesVides;
        }
       }
        //posem els get i el set de posicio
        public String getPosicio(){
        	return posicio;
        }
        public void setPosicio (String novaPosicio) {
        		
        	 if (novaPosicio.equals("dret") || novaPosicio.equals("assegut")) {
        		posicio = novaPosicio;
        		}
        	else {	
        		posicio = "estirat";
        	}
        }
        
        //posem les preguntes de les variables que hem fet en aquest exercici
        public boolean estaViu () {
        	if (vides > 0) {return true;}
        	else {
        		return false;}
        	}
        public boolean estaDret () {
        	if (posicio.equals("dret")){return true;}
        	else {	
        		return false;}
        	}
        	
        	
        	
        public boolean estaAssegut () {
        	if (posicio.equals("assegut")){return true;}
        	else {
        		return false;}
        	}
        	
        public boolean estaEstirat() {
        	if (posicio.equals("estirat")){return true;}
        	else {
        		return false;}
        	}
        }
        	
        	
