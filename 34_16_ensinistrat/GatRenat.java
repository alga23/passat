/*aquesta classe conté les variables, els sets i els gets d'UsaGatRenat perquè quest pugui funcionar i sigui un bon gat */
public class GatRenat {
	public boolean estatAixecat = false;
	public boolean estatEstirat = false;
        public boolean estatAssegut = false;
	
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
	}
		
		
	
	

