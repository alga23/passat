/*Auest programa agafarà les dades
/d'un fitxer csv. Aquestes dades són
/les notes d'un estudiants, i farem
/les mitjanes d'aquestos
*/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class NotaMitja {
    public static void main (String[] args) throws IOException {
        String cami = "notes.csv";
        FileReader fileReader = new FileReader(cami);
        BufferedReader input = new BufferedReader(fileReader);
        int lineas = 0;
    	for (String linia; (linia = input.readLine()) != null;) {
        	lineas++;
		}
	if (lineas == 1) {
        System.out.println("Cap entrada");
    } else if (lineas > 1){
        String linia ="";       
        for (int i = 2; (linia = input.readLine()) != null; i++) {
    		sumaNotes(linia);
    		System.out.println();
		}
	}

	input.close();
	}
            	
            		
            	
            	
        

    
    
    public static void sumaNotes(String linia) {
    	String [] liniasSeparades = linia.split(",");
    	char nombre = ' ';
    	double notaMitja = 0;
    	int[] conjuntNotes = new int[6];
    	for (int i = 1; i < liniasSeparades.length; i++){
    		if (liniasSeparades[i].length() == 1) {
    			nombre = liniasSeparades[i].charAt(0);
    			if (Character.isDigit(nombre)){
    				int nombreInt = (int)nombre - (int) '0';
    				String nombreString = String.valueOf(nombreInt);
    				double numero = Double.parseDouble(nombreString);
            			notaMitja = notaMitja + numero;
    				}
    			}
    		}
    		
    			notaMitja = notaMitja / 6;
    			System.out.printf("%s (%.2f)",liniasSeparades[0], notaMitja);
    			}
    		}
    			
    			 
    			
    				
    	
    	

