/*Programa que jugarà 
/amb 'usuari a una vrsió
/del penjat. Agafarà les paraules
/d'un fitxer i les formes
/del personatge penjat
/d'un altre
*/
import java.util.*;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;public class Penjat{
	public static void main(String[] args)throws IOException{

   
    //Declaro variables globales que se usaran en todo el código
    List<String> lstPalabrasLeidasFichero = new ArrayList<String>();
    int intNumTotalPalabrasFichero = 0;
    int intNumPalabrasAcertadas = 0;
    int intNumPalabrasCanceladas = 0;
    int intNumPalabrasFalladas = 0;
    int intNumPalabrasJugadas = 0;
    String muestraFichero="";
    int intNumeroDePalabras=4;
    
   //Llamo a LeerFichero y le paso el parámetro lstPalabrasLeidasFichero por referencia 
   leerFichero(lstPalabrasLeidasFichero, intNumPalabrasJugadas, intNumPalabrasAcertadas, intNumPalabrasFalladas, intNumPalabrasCanceladas);             
   intNumTotalPalabrasFichero = lstPalabrasLeidasFichero.size();      
   
   
    muestraFichero = muestraFichero + lstPalabrasLeidasFichero;
    
      if(muestraFichero == null){
      System.out.println("no hay palabras");
      }
   
   
     if(intNumTotalPalabrasFichero ==0){
      return;
     }
   
     //Comenzamos el juego
     System.out.println("Comencem a jugar");
     
     //Recorro el listado de palabras  
	     for(String strPalabra : lstPalabrasLeidasFichero){
	     
	        int contadorLista =4;
	        contadorLista--;	      
		List<String> lstHistorialEntradasRealizadas = new ArrayList<String>();
		lstHistorialEntradasRealizadas.add("cap"); // empieza con este valor
		int intNumIntentosDisponibles = 10;
		boolean blnTerminarJuego = false;
		
		String strPalabraTraducida = TraducirPalabra(strPalabra);
		intNumPalabrasJugadas++;
	     
     
		     //Mientras tenga intentos le pido una entrada y le muestros su resumen
		     while (intNumIntentosDisponibles > 0){
		     MostrarResumenPartida(strPalabraTraducida, lstHistorialEntradasRealizadas, intNumIntentosDisponibles);
		     System.out.println("Introdueix una lletra");
		     String strEntrada=Entrada.readLine();
		     // Lo paso todo a mayusculas tanto la palabra como la entrada, asi no se distingue entre may o min
	            strEntrada = strEntrada.toUpperCase(); 
                    
                    
                    //Compruebo la entrada
	            switch (strEntrada){
	              
	              case "PROU":
	                    //fin del , cancela palabra actual y el resto de palabras que queden
	                    System.out.println("Vols finalitzar?");
	                    String preguntaSiAbandona=Entrada.readLine();
	                    boolean confirma = UtilitatsConfirmacio.respostaABoolean(preguntaSiAbandona);
			              if(confirma){	
			              intNumeroDePalabras--;		           
		                      intNumPalabrasCanceladas++;
		                      intNumIntentosDisponibles = 0;
		                      blnTerminarJuego = true;
		                      MostrarResumenJuego(intNumPalabrasJugadas, intNumPalabrasAcertadas,intNumPalabrasFalladas,intNumPalabrasCanceladas);
		                      break;
		                     }
                                     else{
                                     break;
                                    }
                            
                      case "GLUPS":
                           //cancela palabra acttual, siguiente palabra
                            intNumPalabrasCanceladas++;
                            intNumeroDePalabras--;
                            intNumIntentosDisponibles = 0;
                            break;
                      
                     default: //en cualquier otro caso
                        
                           if(entradaValida(strEntrada)){//si es un solo caracter y es letra
                                  //si ya ha introducido la misma letra no cuenta como error
                                  if(lstHistorialEntradasRealizadas.contains(strEntrada)){
                                   System.out.println("La lletra ja ha estat utilitzada");
                                  }
                                  else{
                                  //agrego la entrada al historial
                                  lstHistorialEntradasRealizadas.add(strEntrada); 
                                  
                                         //Compruebo si la palabra contiene esa letra
                                         if (palabraContieneLetra(strPalabra, strEntrada)){
                                          
                                             //destapo letra
                                             strPalabraTraducida = descubreLetra(strPalabra, lstHistorialEntradasRealizadas);
                                                //Compruebo si ha descubierto la palabra entera
                                                if (!strPalabraTraducida.contains("*")){
                                        
                                            System.out.println("Has encertat! La paraula era " + strPalabraTraducida.toLowerCase());
                                            intNumeroDePalabras--;
                                             intNumPalabrasAcertadas++;
                                             intNumIntentosDisponibles = 0;
                                                }
                                             
                                         }
                                         else{
                                         intNumIntentosDisponibles--;
                                                  if (intNumIntentosDisponibles ==0){
                                        
                                                   intNumPalabrasFalladas++;
                                                   }
                                            //muestro la figura
                                            mostraFigura(intNumIntentosDisponibles);    
                                         }
                                  }
                           }
                           else{
                           //es númerico o cualquier otra palabra, por lo tanto mensaje de error
                            System.out.println("Error: cal una lletra entre 'a' i 'z', 'prou' o 'glups'");
                           }break;
	            }
	     }
	     
	      //compruebo si el usuario a finalizado el juego si es asi salgo del foreach
                if (blnTerminarJuego){
                
                    break;
                }
	   }
	     if(intNumeroDePalabras == 0){
	         System.out.println("No queden més paraules");
	         MostrarResumenJuego(intNumPalabrasJugadas, intNumPalabrasAcertadas,intNumPalabrasFalladas,intNumPalabrasCanceladas);
	         return;
	        }
     }
   
   /* Leer Fichero, recibe por referencia un listado
   * Lee el fichero y cada linea leida la guarda en el listado
   */  
   public static void leerFichero(List<String> lstListadoPalabras, int intNumPalabrasJugadas, int intNumPalabrasAcertadas, int intNumPalabrasFalladas, int intNumPalabrasCanceladas )throws IOException  {
           int intContador =0;
           String camino = "paraules.txt";
           FileReader fileReader = new FileReader(camino);
           BufferedReader input = new BufferedReader(fileReader);
             
            while (true ){//Leemos línea por línea, cuando no hay mas líneas es null
		      String strPalabra = input.readLine();
		     
		     if(null != strPalabra){
		      intContador+=1;
		     }
		     
		     if(intContador>0){
			     if(strPalabra == null)break;
			     			     
				lstListadoPalabras.add(strPalabra.toUpperCase()); //agrefg la línea al listado en mayusculas
						    		                		                		                   	    
		     }
		     else{
		     System.out.println("No tinc paraules per jugar");return;
		     }
		    
            }
            
           /* if(lstListadoPalabras.size()==4){
            MostrarResumenJuego(intNumPalabrasJugadas, intNumPalabrasAcertadas, intNumPalabrasFalladas, intNumPalabrasCanceladas);
            }*/
            input.close();
            
        }
   
   public static String TraducirPalabra(String strPalabraActual){
            
           // System.out.println(strPalabraActual);          
            String strPalabraTraducida = "";
            for(int i =0; i<strPalabraActual.length(); i++){
               strPalabraTraducida = strPalabraTraducida + "*";
               
            }
            return strPalabraTraducida;
   }
   
    public static void MostrarResumenPartida(String strPalabraActualTraducida, List<String> lstEntradasUtilizadas, int intNumIntentosDisponibles ){
            
            strPalabraActualTraducida=strPalabraActualTraducida.toLowerCase();           
            System.out.println("Paraula: " + strPalabraActualTraducida);  
                       
            
              if (lstEntradasUtilizadas.size() > 1) {
                lstEntradasUtilizadas.remove("cap");
                           
                              
				System.out.print("Utilitzades: ");
				
			      for(int i=0; i<lstEntradasUtilizadas.size(); i++){
				
					  if(i==0){
					  System.out.print(lstEntradasUtilizadas.get(i));
					  }
					  if(lstEntradasUtilizadas.size() == 2 && i==lstEntradasUtilizadas.size()-1){
					  System.out.print(" i "+lstEntradasUtilizadas.get(i));
					  }
					  if(lstEntradasUtilizadas.size() > 2){
						       if(i>=1 && i!=lstEntradasUtilizadas.size()-1){
							  System.out.print(", "+lstEntradasUtilizadas.get(i));
						       }
							if(i==lstEntradasUtilizadas.size()-1){
							  System.out.print(" i "+lstEntradasUtilizadas.get(i));
						       }
					  }
				   														        
			    }
			    System.out.println();
             
             }
             else{
              String strEntradasUtilizadas = String.join(", ", lstEntradasUtilizadas);
              System.out.println("Utilitzades: " + strEntradasUtilizadas);
             }
                      
               
            System.out.println("Intents disponibles: " + intNumIntentosDisponibles);
    }
    
    
     public static void MostrarResumenJuego(int intNumPalabrasJugadas,int intNumPalabrasAcertadas, int intNumPalabrasFalladas, int intNumPalabrasCanceladas){
        
            System.out.println("Paraules jugades: " + intNumPalabrasJugadas);
            System.out.println("Paraules encertades: " + intNumPalabrasAcertadas);
            System.out.println("Paraules fallades: " + intNumPalabrasFalladas);
            System.out.println("Paraules cancel·lades: " + intNumPalabrasCanceladas);
            System.out.println("Espero que t'hagis divertit");
      }
      
     public static boolean entradaValida(String strEntrada){
      //devuelve true si es un solo caracter y ademas es letra, caso contrario false
        return (strEntrada.length() == 1 && Character.isLetter(strEntrada.charAt(0)));
    }
   
    public static boolean palabraContieneLetra(String strPalabraActual,  String strLetra){
        
      /* boolean confirma = true;
        for(int i =0; i<strPalabraActual.length(); i++){
         
            if(chrLetra == strPalabraActual.charAt(i)){
               confirma = true;
            }
            else{
            confirma = false;
            }
        }
        return confirma;*/
         
       return strPalabraActual.contains(strLetra);
        
    }
    
    
      public static String descubreLetra(String strPalabraActual, List<String> lstEntradas){
        
            String strPalabraDescubierta = "";
          
            for(int i = 0; i<strPalabraActual.length(); i++){
		        
		        char letraPalabra = strPalabraActual.charAt(i);
		        //transformo el char letraPalabra en string
		        if (lstEntradas.contains("" + letraPalabra)){
		        
		            strPalabraDescubierta = strPalabraDescubierta + letraPalabra;
		        }
		        else{
		        
		            strPalabraDescubierta = strPalabraDescubierta + '*';
		        }
            }
            return strPalabraDescubierta;
        }
        
        
        public static void mostraFigura(int intNumIntentosDisponibles)throws IOException{
        
            String strRutaFigura = "";
            switch (intNumIntentosDisponibles)
            {
                case 0:
                    strRutaFigura = "recursos/figura9.txt";
                    break;
                case 1:
                    strRutaFigura = "recursos/figura8.txt";
                    break;
                case 2:
                    strRutaFigura = "recursos/figura7.txt";
                    break;
                case 3:
                    strRutaFigura = "recursos/figura6.txt";
                    break;
                case 4:
                    strRutaFigura = "recursos/figura5.txt";
                    break;
                case 5:
                    strRutaFigura = "recursos/figura4.txt";
                    break;
                case 6:
                    strRutaFigura = "recursos/figura3.txt";
                    break;
                case 7:
                    strRutaFigura = "recursos/figura2.txt";
                    break;
                case 8:
                    strRutaFigura = "recursos/figura1.txt";
                    break;
                case 9:
                    strRutaFigura = "recursos/figura0.txt";
                    
                    break;
            }
            pintarFigura(strRutaFigura);
      }
      
        public static void pintarFigura(String strFigura)throws IOException {
        
            BufferedReader input = new BufferedReader(new FileReader(strFigura));
            
            while (true){ //Leemos línea por línea hasta el finall 
            
                String strPalabra = input.readLine();
                if(null == strPalabra)break;
                System.out.println(strPalabra);
                
                
                }
                
                if(strFigura.equals("recursos/figura9.txt")){
                System.out.println("Has mort");
            }
            
            input.close();
        }
   
}
			
			
			
