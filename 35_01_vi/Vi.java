/*Classe vi que yutilitzarem per
/ a la botig de la senyora.
/El vi és el més esencial,
/i serà la fundació de 
/les altres classes
*/
public class Vi{
	private String nom ="";
	private int preu;
	private int estoc = 0;
	
	public Vi (String nom, int preu, int estoc){
		this.nom = normalitzaNom(nom);
		if (preu < 0) {
			this.preu = -1;
			}
		else {
			this.preu = preu; 
			}
		if (estoc < 0) {
			this.estoc = -1;
		}else {
			this.estoc= estoc; 
			}
		
		}
		
	public Vi (String nom, int preu) {
		this.nom = normalitzaNom(nom);
		this.preu = preu;
		}
		
	public String getNom() {
		return nom;
		}
	public int getPreu() {
		return preu;
		}
	public int getEstoc() {
		return estoc;
		}
		
	public void setPreu (int preu) {
		if (preu > 0) {
			this.preu = preu;
			}
		}
	public void setEstoc(int estoc){
		if (estoc > 0) {
			this.estoc= estoc;
			}
		}
			
	public static String normalitzaNom(String nom) {
		nom = nom.trim();
		for ( int i = 0; i < nom.length(); i++) {
			if (nom.charAt(i) == ' ') {
				nom =nom.replace(nom.charAt(i), ' ');
				}
			}
			return nom;
			}
			
	public boolean esValid() {
		if (this.nom.equals("NOM NO VÀLID!") || this.preu == -1 || this.estoc == -1)  {
			return false;
			}
		return true;
		}
		
		
	@Override
	public String toString() {
	return "\n    Vi: " + nom + " \n    Preu: " + preu+ "\n    Estoc: " + estoc + "\n";

			   
			  }
		}
			    
			
		
			
				
	
		
	 
