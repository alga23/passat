/*aquesta classe conté les variables, els sets i els gets d'UsaGatRenat perquè quest pugui funcionar i sigui un bon gat */
public class GatRenat {
	private boolean estatAixecat = false;
	private boolean estatEstirat = false;
        private boolean estatAssegut = false;
        private String posicio = "estirat";

	
	public String aixecat () {
		if (estatAixecat == false){
			estatAixecat = true;
			return "m'aixeco";

			}
		else if (estatAixecat == true){
			return "no faig res";
		}
		return "";
	}
	

	

	public String estirat () {
		if (estatEstirat == false){
			estatEstirat = true;
			return "m'estiro";

			}
		else if (estatEstirat == true){
			return "no faig res";
		}
		return "";
	}
		
		
	
	public String seu () {
	if (estatAssegut == false){
			estatAssegut = true;
			return "m'assec";

			}
		else if (estatAssegut == true){
			return "no faig res";
		}
		return "";

		}
		//posem els set i els get de vides
	
	
	
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
		
	
		
		
	
	

