/*Programa log que s'encarrega de mostrar
/a lùsuari certes fallles que ha comet.
/Les podem dividir en quatre categories:
/ERROR, WARINING, DEBUG i INFO
*/
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
public class Log{
	 static private int numLinea =1;     
            
	    public static String printError(String msjTexto) throws IOException {
	       
		String cami = "log.txt";
		BufferedWriter sortida = new BufferedWriter(new FileWriter(cami, true));
		//                          El mode ampliació s'especifica aquí  ↑↑↑
		String error = "["+ numLinea + "] ERROR: " + msjTexto;
		sortida.write(error);
		numLinea++;
		sortida.newLine();      
		sortida.close();
		return error.toString();
	    }
	    
	       public static String printWarning(String msjTexto) throws IOException {
	       
		String cami = "log.txt";
		BufferedWriter sortida = new BufferedWriter(new FileWriter(cami, true));
		//                          El mode ampliació s'especifica aquí  ↑↑↑
		String warnig = "["+ numLinea + "] WARNING: " + msjTexto;
		sortida.write(warnig);
		numLinea++;
		sortida.newLine();
		sortida.close();
		return warnig.toString();
	    }
	    
	      public static String printInfo(String msjTexto) throws IOException {
	       
		String cami = "log.txt";
		BufferedWriter sortida = new BufferedWriter(new FileWriter(cami, true));
		//                          El mode ampliació s'especifica aquí  ↑↑↑
		
		String info = "["+ numLinea + "] INFO: " + msjTexto;
		sortida.write(info);
		numLinea++;
		sortida.newLine();
		sortida.close();
		return info.toString();
	    }
	    
	     public static void reset() {
	       
	       numLinea=1;
	    }
	    
	       public static String printDebug(String msjTexto) throws IOException {
	       
		String cami = "log.txt";
		BufferedWriter sortida = new BufferedWriter(new FileWriter(cami, true));
		//                          El mode ampliació s'especifica aquí  ↑↑↑       
		String debug = "["+ numLinea + "] DEBUG: " + msjTexto;
		sortida.write(debug);
		numLinea++;
		sortida.newLine();
		sortida.close();
		return debug.toString();
	    }
		
}
		
