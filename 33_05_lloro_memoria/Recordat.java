/*
 * programa que simula un lloro que recorda les frases que li han dit
 /i les guarda a un fitxer
 /que després ens ho recordarà repetint-les
 
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
public class Recordat {
    public static void main(String[] args) throws IOException {
        String cami = "records.txt";
        processaEntrada(cami);
        System.out.println("D'acord");
        mostraRecords(cami);
    }
    

    /**
     * Demana frases per entrada estàndard i les guarda a un fitxer
     * @param nomFitxer: nom del fitxer
     */
    public static void processaEntrada(final String nomFitxer) throws IOException {
     BufferedWriter input = new BufferedWriter(new FileWriter(nomFitxer));
      System.out.println("El lloro pregunta paraula:");
      String paraula = Entrada.readLine();
      while(!paraula.isBlank()){
      	System.out.println("El lloro registra: " + paraula);
      	input.write(paraula);
      	input.newLine();
      	System.out.println("El lloro pregunta paraula:");
      	paraula=Entrada.readLine();
      	}
      
      	input.close();
      	}
      	
    

    /**
     * Mostra el contingut del fitxer amb nom nomFitxer
     * @param nomFitxer: el nom del fitxer del que es mostrarà el contingut
     */
    public static void mostraRecords(final String nomFitxer) throws IOException {
        BufferedReader input = new BufferedReader(new FileReader(nomFitxer));
        if(input.readLine() == null) {
        	System.out.println("El archivo está vacío.");
    	} else {
        	for(String linea = input.readLine(); linea != null; linea = input.readLine()) {
        		System.out.println("El lloro recorda: " + linea);
        	}
        System.out.println("Adéu");
        input.close();
        }

    }
   }
   


