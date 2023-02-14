/*aquesta classe conté les variables, els sets i els gets d'UsaGatRenat perquè quest pugui funcionar i sigui un bon gat */
public class GatRenat {
	private boolean estaAixecat = false;
	private boolean estaEstirat = false;
        private boolean estaAssegut = false;
        private String posicio = "estirat";
        

	
	public String aixecat (){
		estaAixecat = true;
		estaEstirat = false;
		estaAssegut = false;
		return "m'aixeco";
		if (estaAixecat == true){
			return "no faig res";
			}
		} 
		
		
	

	

	public String estirat () {
		estaEstirat = true;
		estaAixecat = false;
		estaAssegut = false;
		return "m'estiro";
		if (estaEstirat == true){
			return "no faig res";
			}
		} 
	
		
		
	
	public String seu () {
		estaAssegut = true;
		estaAixecat = false;
		estaEstirat = false;
		return "m'estiro";
		if (estaAssegut == true){
			return "no faig res";
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
		
	
		
		
	
	

