/*Class que té els objectes d'ascensor perque l'altre fitxer que contè el programa UsaAscensor pugui funcionar */
public class Ascensor {
	private int pis = -1;
	private String moviment = "aturat";
	private boolean estaAbaix = true;
	private boolean estaAmunt = false;
	private boolean estaMovent = false;
	private boolean estaPujant = false;
	private boolean estaBaixant = false;
	private String comEsta;
	
	
	
	//classes get
	
	public void setPis(int pisNou) {
		if (pisNou >= -1 && pisNou <= 10) {
			pis = pisNou;
			}
		}
	public void setMoviment(String novaPosicio) {
		if ( novaPosicio.equals("aturat") || novaPosicio.equals("pujant") || novaPosicio.equals("baixant")) {
			moviment = novaPosicio;
			}
		}
	public int getPis() {
		return pis;
		}
	public String getMoviment() {
		return moviment;
		}
	

	public boolean estaAmunt () {
		if (pis > 1) { return true;}
		else {	
			return false;}
		} 
	public boolean estaMovent () {
		if (moviment.equals("aturat")) { return false;}
		else {return true;}
		}
	public boolean estaAbaix () {
		if (pis == -1) { return true;}
		else {return false;} 
			 }
	public boolean estaPujant () {
		if (moviment.equals("pujant")) { return true;}
		else {	return false;}
			} 
	public boolean estaBaixant () {
		if (moviment.equals("baixant")) { return true;}
		else {	return false;}
			}
	
	public boolean estaAturat () {
		if (moviment.equals("aturat")) {return true;}
		else {return false;} 
			}
	public String comEsta () {
		String estat = moviment + " al pis " + pis;
		return estat;
		}
		
	}

