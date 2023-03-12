/*Classe que heredera al Gat
/ i li afegeix nous membres/metodes
*/
class GatRenat extends Gat {

   public boolean estaViu() {
        if (getVides() <= 0) {
           return false;
        }
        else { return true; } 
    }
    public boolean estaDret() {
        if (getPosicio().equals("dret")) {
           return true;
        }
        else { return false; }
    }
    
    public boolean estaAssegut() {
        if (getPosicio().equals("assegut")) {
           return true;
        }
        else { return false; }
    }
    
    public boolean estaEstirat() {
        if (getPosicio().equals("estirat")) {
           return true;
        }
        else { 
        	return false; 
        	}
        	
    }

    public String aixecat() { 
        if(getPosicio().equals("dret")) { 
        	return "no faig res"; 
        }
        else { setPosicio("dret"); return "m'aixeco"; }
   }
    
    public String seu() {
       if(getPosicio().equals("assegut")) { return "no faig res"; }
       else { setPosicio("assegut"); return "m'assec"; }
   }
 
   public String estirat() {
     if(getPosicio().equals("estirat")) { return "no faig res"; }
     else { setPosicio("estirat"); return "m'estiro"; }
   }

}

