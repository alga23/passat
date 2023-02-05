/*Programa log que s'encarrega de mostrar
/a lùsuari certes fallles que ha comet.
/Les podem dividir en quatre categories:
/ERROR, WARINING, DEBUG i INFO
*/
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
public class Log{
	private static int comptador = 0;
	
	public static void printError(String linia) throws IOException {
		String camiLog = "log.txt";
		BufferedWriter log = new BufferedWriter(new FileWriter(camiLog, true));
		log.write("[ " + comptador + " ] " + "ERROR: " + linia);
		comptador++;
		System.out.println("[ " + comptador + " } " + "ERROR: " + linia);
		log.close();
		
		}
		
	public static void printWarning(String linia) throws IOException {
		String camiLog = "log.txt";
		BufferedWriter log = new BufferedWriter(new FileWriter(camiLog, true));
		log.write("[ " + comptador + " } " + "WARNING: " + linia);
		comptador++;
		System.out.println("[ " + comptador + " ] " + "WARNING: " + linia);
		log.close();
		}
		
		
	public static void printInfo(String linia)  throws IOException {
		String camiLog = "log.txt";
		BufferedWriter log = new BufferedWriter(new FileWriter(camiLog, true));
		log.write("[ " + comptador + " ] " + "INFO: Argument " + linia+ ":   " +linia);
		comptador++;
		System.out.println("[ " + comptador + " ] " + "ARGUMENT: " + linia);
		log.close();
		}
		
	public static void printDebug(String linia)  throws IOException {
		String camiLog = "log.txt";
		BufferedWriter log = new BufferedWriter(new FileWriter(camiLog, true));
		log.write("[ " + comptador + " ] " + "DEBUG: " + linia);
		comptador++;
		System.out.println("[ " + comptador + " ] " + "DEBUG: " + linia);
		log.close();
		}
		
	     public static void reset() {
	       
	       comptador=0;
	}
}
		
