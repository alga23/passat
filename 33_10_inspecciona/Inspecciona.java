/*Desenvolupa un programa que consideri els arguments de línia de comanda com si fossin camins del sistema de fitxer.
Per cada argument, comprovarà si correspon a un camí existent.
Si no existeix, indicarà "No trobat".
En cas que existeixi, indicarà els seus permisos per l’usuari en el format típic de GNU (rwx)
A continuació, indicarà si correspon a un fitxer o un directori.
En cas de ser un directori, mostrarà el nom dels fitxers i directoris que contingui.
Si és un fitxer, indicarà la seva longitud en bytes.
En cas que es pugui llegir i que la seva extensió sigui una de les conegudes, el programa mostrarà el seu contingut envoltant cada línia entre dos caràcters | per permetre distingir espais.
Es consideraran extensions conegudes .java i .txt.*/


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.io.File;
public class Inspecciona{
  public static void main(String[]args)throws IOException{
      
      String argumentoRecibido ="";
      
      for(int i=0; i<args.length; i++){
         argumentoRecibido=args[i];        
         String camino = argumentoRecibido;         
         File fitxer = new File(camino);
         
		  if(!fitxer.exists()){
		           String longitudArgs = args[i];
			   int intCantidadDeGuiones= 0;	  
			   intCantidadDeGuiones = longitudArgs.length();	
			   String strCantidadDeGuiones ="";
			   for( int j=1; j<=intCantidadDeGuiones; j++){
			     strCantidadDeGuiones =strCantidadDeGuiones+ "=";
			   } 
		  
		    System.out.println("Processant argument: " + fitxer );
		    System.out.println("=====================" + strCantidadDeGuiones);
		    System.out.println();
		    System.out.println("No trobat");
		    System.out.println();
		  }          
		  else{
		    
			 if(fitxer.isDirectory()){	
					    
			  String [] contenido = fitxer.list();
			  String longitudArgs = args[i];
			  int intCantidadDeGuiones= 0;	  
			  intCantidadDeGuiones = longitudArgs.length();	
			  String strCantidadDeGuiones ="";
				   for( int j=1; j<=intCantidadDeGuiones; j++){
				     strCantidadDeGuiones =strCantidadDeGuiones+ "=";
				   }  
			   
					     if(contenido.length>=1){
					     Arrays.sort(contenido);
						  System.out.println("Processant argument: " + fitxer);
						  System.out.println("=====================" + strCantidadDeGuiones );
						  System.out.println();
						  
						  
							    for(int j =0; j<contenido.length; j++){
									  if(j==0){
									  System.out.print("rwx directori que conté: " +contenido[j]);
									  
									  }
									  else if(j >=1){
									  System.out.print(", " + contenido[j]);									  
									  }
							    }
						System.out.println();
						System.out.println();
					     }
					     else if (contenido.length<=1){					     
					       System.out.println("Processant argument: " + fitxer);
					       System.out.println("=====================" + strCantidadDeGuiones);
						System.out.println();
					       System.out.println("rwx directori buit");
					       System.out.println();
					     }
			  }
			  else if(fitxer.isFile()){
			   String longitudArgs = args[i];
			   int intCantidadDeGuiones= 0;	  
			  intCantidadDeGuiones = longitudArgs.length();	
			  String strCantidadDeGuiones ="";
			   for( int j=1; j<=intCantidadDeGuiones; j++){
			     strCantidadDeGuiones =strCantidadDeGuiones+ "=";
			   } 
					   if(fitxer.length()>0){
					   
						      if(camino.contains("txt")){
						      System.out.println("Processant argument: " + fitxer);
						      System.out.println("====================="+ strCantidadDeGuiones);
						      System.out.println();				       
						      System.out.println("rw- fitxer de mida en bytes: " + fitxer.length());
						      System.out.println("Amb els continguts:");		      
						      lecturaFichero(fitxer);
						      }						   
						      else{
						      System.out.println("Processant argument: " + fitxer);
						      System.out.println("====================="+ strCantidadDeGuiones);
						       System.out.println();				       
						      System.out.println("rw- fitxer de mida en bytes: " + fitxer.length());
						      }
					    
					     
					  }
					  else{
					    System.out.println("Processant argument: " + fitxer);
					    System.out.println("====================="+ strCantidadDeGuiones);
					     System.out.println();
					    System.out.println("rw- fitxer buit");
					    System.out.println();
					  }
			  }
		     
		  }
      
      } 
  }
   
  public static void lecturaFichero(File fitxer)throws IOException{
  
     BufferedReader input = new BufferedReader(new FileReader(fitxer));
		    		     		   
		      while(true){
		      String linea = input.readLine();
		       if(null == linea)break;
		      linea = "|" + linea + "|";
		      
		      System.out.println(linea);
		      }
		      input.close();
  }
}

