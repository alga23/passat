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
		 for (int i = 0; i < paraula.length(); i++) {
   		 	char lletra = paraula.charAt(i);


    		if (Character.isLetter(lletra)) {
      			paraulaAmbComa.append(lletra);

      			if (i < paraula.length() -2 ) {
        paraulaAmbComa.append(", ");
      }
    }
  }

  return paraulaAmbComa.toString();
  }
 }
 
		


			
