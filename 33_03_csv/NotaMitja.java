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
        if (input.readLine() == null){
        	System.out.println("Cap entrada");
        	}
        else{
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
    	int[] conjuntNotes = new int[6];
    	for (int i = 1; i < liniasSeparades.length; i++){
    		if (liniasSeparades[i].length() == 1) {
    			nombre = liniasSeparades[i].charAt(0);
    			if (Character.isDigit(nombre)){
    				int conversio = nombre;
    				conjuntNotes[i] = conversio;
    				}
    			}
    		}
    		double notaFinal = 0;
    		for (int i= 0; i < conjuntNotes.length; i++){
    			notaFinal =+ conjuntNotes[i];
    			}
    			notaFinal = notaFinal / 6;
    			System.out.printf("%s(%.2f)",liniasSeparades[0], notaFinal);
    			}
    		}
    			
    			 
    			
    				
    	
    	

