/*Programa que agafa tres fitxers
/en forma d'arguments i el que fem és substituir
/certes praraules clau a un fitxer per altres
*/
import java.io.File;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
public class Traducio{
	public static void main(String[] args){
		String fitxerOrigen = args[0];
		String fitxerTraduccio = args[1];
		String fitxerDestinacio = args[2];
		if (fitxerOrigen.isBlank() || fitxerTraduccio.isBlank() || fitxerDestinacio.isBlank()){
			System.out.println("ERROR: Cal especificar els fitxers origen, traduccio i destinació");
		}
	else {
		tradueix(fitxerOrigen, fitxerTraduccio, fitxerDestinacio);
		}
	}
		
	public static void tradueix(String fitxerOrigen, String fitxerTraduccio, String fitxerDestinacio){
		BufferedReader origen = new BufferedReader(new FileReader(fitxerOrigen));
		BufferedReader traduccio = new BufferedReader(new FileReader(fitxerTraduccio));
		BufferedWriter destinacio = new BufferedWriter(new FileWriter(fitxerDestinacio));
		String[] lineaTraduccio = new String[10];
		int comptador = 0;
		for (String linea = traduccio.readLine(); linea != null; linea = traduccio.readLine()){
			lineaTraduccio[comptador] = linea;
			comptador++;
			}
			 
		int segonComptador= 0;
		for (String linea = origen.readLine(); linea != null; linea = origen.readLine()) {
			if (lineaTraduccio[].contains(linea)){
				String liniaTraduida = tradueixLinia(linea,fitxerTraduccio);
				destinacio.write(liniaTraduida);
				destinacio.newLine();
				}
			}
			origen.close();
			traduccio.close();
			destinacio.close();
		}
		
	public static String tradueixLinia(String linia, String fitxerTraduccio){
		BufferedReader traduccio = new BufferedReader(new FileReader(fitxerTraduccio));
		String [] liniasSeparades = new String[10];
		int comptador = 0;
		for (String linea = traduccio.readLine(); linea != null; linea = traduccio.readLine()) {
			liniasSeparades[comptador] = linea;
			comptador++;
			}
		for (int i = 0; i < liniasSeparades.length; i++){
			if (linia.contains(liniasSeparades[i])) {
				linia.replace(liniasSeparades[i], liniasSeparades[i + 1]);
				}
			}
			traduccio.close();
			return linia;
			}
		}
			
			
			

		
	        	
	        	 
	       	



		
	
