/*Mòdul que contindrà la funció 
/esVocal que ens permitirà saber si
/la primera o l'última lletra d'una
/cadena
*/
public class UtilString {
	public static boolean esVocal(String paraula) {
		if (paraula == null){
			return false;
			}
		paraula= paraula.toLowerCase();
		
		char primeraLletra = paraula.charAt(0);
		
		char ultimaLletra = paraula.charAt(paraula.length() -1);
		
		if (primeraLletra == 'a' || primeraLletra == 'e' || primeraLletra == 'i' || primeraLletra == 'o' || primeraLletra == 'u' || primeraLletra == 'à' || primeraLletra == 'è' || primeraLletra == 'é' || primeraLletra == 'í' || primeraLletra == 'ï' || primeraLletra == 'ó' || primeraLletra == 'ó' || primeraLletra == 'ú' || primeraLletra == 'ü' ){
		return true;           
		}
		
		if (ultimaLletra == 'a' || ultimaLletra == 'e' || ultimaLletra == 'i' || ultimaLletra == 'o' || ultimaLletra == 'u' || ultimaLletra == 'à' || ultimaLletra == 'è' || ultimaLletra == 'é' || ultimaLletra == 'í' || ultimaLletra == 'ï' || ultimaLletra == 'ó' || ultimaLletra == 'ó' || ultimaLletra == 'ú' || ultimaLletra == 'ü' ){
		return true;
		}
		return false;
	}
	
	public static String  nomesLletres (String paraula) {	
		StringBuilder novaParaula = new StringBuilder();
		for (int i = 0; i < paraula.length(); i++) {
			char lletra = paraula.charAt(i);
			
			novaParaula.append(lletra);
			}
			paraula = novaParaula.toString();
			
			return paraula;
			}
			
	public static String lletresSeparades (String paraula) {
		StringBuilder paraulaAmbComa = new StringBuilder();
		for (int i = 1; i < paraula.length()-2; i++){
			char lletraAmbComa = paraula.charAt(0);
			
			paraulaAmbComa.append(lletraAmbComa + ",");
			}
			paraula = paraulaAmbComa.toString();
			
			return paraula;
			}
		
		
	public static String intervalString (String text, int valorInicial, int valorFinal) {
	StringBuilder nouText = new StringBuilder();
	if (valorFinal > valorInicial){
	for (int i = valorInicial; i < text.length(); i++) {
		char lletra = text.charAt(i);
		
		nouText.append(lletra);
		
		}
		 text = nouText.toString();
		 return text;
	}
		
		else if (valorFinal > valorInicial) {
		
			for (int i = valorFinal; i > text.charAt(valorInicial); i--) {
				char lletra = text.charAt(i);
		
				nouText.append(lletra);
			  	}
			  	 text = nouText.toString();
			  	 return text;
			  }
			  else if (valorFinal > text.length()){
			  
			  	for (int i = valorFinal; i < text.length(); i++) {
					char lletra = text.charAt(i);
				
					nouText.append(lletra);
			  	}
			  	 text = nouText.toString();
			  	return text;
			  }
			return text;
			 }
			 
		public static boolean esEnter(String text) {
			 if (text.charAt(0) == '+' || text.charAt(0) =='-'){
			 	for (int i = 1; i < text.length(); i++) {
    					char c = text.charAt(i);

   				 	if (!Character.isDigit(c)) {
      					return false;
      					}
      				}
      			}/*
      			if (text.startsWith("")) {
      				String nouText = text.trim();
      				if (nouText.charAt(0) == '+' || nouText.charAt(0) =='-'){
			 	for (int i = 1; i < nouText.length(); i++) {
    					char c = nouText.charAt(i);

   				 	if (!Character.isDigit(c)) {
      					return false;
      					}
      				}
      			}
      			else {
      				for (int i = 0; i < nouText.length(); i++) {
    				char c = nouText.charAt(i);

   				 if (!Character.isDigit(c)) {
      					return false;
      					}
      				}
      			}
      		}
      		return false;
      		*/
      		
      				
      				else {

  			for (int i = 0; i < text.length(); i++) {
    				char c = text.charAt(i);

   				 if (!Character.isDigit(c)) {
      					return false;
      					}
      				}
      				

      					
      					
    }
  


 			 return true;
				}
			}
			
		
			
	
		
		


			
