/*Classe vi que yutilitzarem per
/ a la botig de la senyora.
/El vi és el més esencial,
/i serà la fundació de 
/les altres classes
*/

public class Vi {
  
	private final String nom;
	private int preu;
	private int estoc;
	
		  public Vi(String strNom, int intPrecio) {      
			  
			 
			  this.nom =normalitzaNom(strNom);
			  
				if(intPrecio<0){
				this.preu = -1;
				}
				else{
				setPreu(intPrecio);
				}
		  }
		 public Vi(String strNom, int intPrecio, int intEstoc) {	
			 
			  this.nom =normalitzaNom(strNom);
			  
		  
				if(intPrecio<0){
					this.preu = -1;
				}
				else{
					setPreu(intPrecio);
				}
				
				if(intEstoc<0){
					this.estoc=-1;
				}
				else{
					setEstoc(intEstoc);
				}
	  
		  }
	  public String getNom() {
		  return nom;
	  }
	  
	  public int getPreu() {
		  return preu;
	  }
	  public void setPreu(int intPrecio) {
		  
				if(intPrecio*100 >0) {
					this.preu = intPrecio;
				}
				else {
					preu= preu;
				}
		  
	  }
	  public int getEstoc() {
		  return estoc;
	  }
	  public void setEstoc(int intEstoc) {
				if(intEstoc>0){
					this.estoc = intEstoc;
				}
				else{
					this.estoc=estoc;
				}
		  
		  
	  }
	  
	  public boolean esValid() {
		  if(nom.equals("NOM NO VÀLID!")){
			  return false;
		  }
		  if(preu<0){			  
			  return false;
		  }
		  if(estoc<0){			  
			  return false;
		  }
		  return true;
	  }
	  public static String normalitzaNom(String nombreRecibido) {
		  if(nombreRecibido.isBlank()) {	    	
			  return "NOM NO VÀLID!";
		  }
		  else {
			  return nombreRecibido.replaceAll(" +", " ").strip();
		  }
	  }
	  @Override
	  public String toString() {
		  
		  return String.format("\n    Vi: %s\n    Preu: %d\n    Estoc: %d\n", nom, preu, estoc);	
	  }
	  
  }

