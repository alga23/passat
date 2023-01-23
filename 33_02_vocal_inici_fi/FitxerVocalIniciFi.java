/*Nova versió del lloro
/que repeteix paraules però
/aquesta vegada el lloro
/repetirà solament les paraules 
/que comencen en vocal o acaben en vocal
/que es troben a dins
/d'un fitxer anomenat frases.txt
*/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class FitxerVocalIniciFi  {
	public static void main (String[] args) throws IOException {
		 String cami = "frases.txt";
        	FileReader fileReader = new FileReader(cami);
        	BufferedReader input = new BufferedReader(fileReader);
        	while (true) {
            		String linia = input.readLine();
            		if (UtilString.esVocal(linia) == true) {
            			System.out.println(linia);
            			}
            		else if (linia == null) {
            			break;
            			}
            			
        }
        input.close();
    }
}
		
		
