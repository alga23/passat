/*Programa que agafa un fitxer i llegeix el
/conjunt de lletres i nombres que hi ha.
/Si encaixen amb el que és una matricula, anirà a 
/parar a un arxiu que es diu italianes.txt. Si no,
/anirà a parar a un fitxer anomenat desconegudes.txt
*/
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.FileReader;
public class ClassificaMatricules {
	public static void main (String[] args) throws IOException{
		String camiItalianes = "italianes.txt";
    		 BufferedWriter italianes = new BufferedWriter(new 		FileWriter(camiItalianes)); 
     italianes.close();
     
    		 String camiDesconegudes = "desconegudes.txt";
     		BufferedWriter desconegudes = new BufferedWriter(new FileWriter(camiDesconegudes)); 
    		 desconegudes.close();
     
     		String cami= "llegides.txt";
    		 lecturaFicheroMatriculas(cami);      
   
  }
  
  
  public static void lecturaFicheroMatriculas(String camiFitxer)throws IOException{
     boolean confirma= true;
     boolean comprueba;
     
     BufferedReader input = new BufferedReader(new FileReader(camiFitxer));
     String matricula="";
     
     while(true){
        matricula=input.readLine();
	  if(null == matricula)break;
	  
	   boolean afirma = matriculaItalianaValida(matricula);
		if(afirma){
		  matriculesValides(matricula);
		  
		}
		else{
		matriculesErronies(matricula);
		}
          
     }    
     input.close();
      
  }
  
     public static boolean matriculaItalianaValida(String lineaPalabra){
        char lletra;
	int matrVal=0;
	boolean afirma;
	boolean retornaValor= true;
	
	   if(lineaPalabra.length()==7){
			for(int i =0;i<lineaPalabra.length();i++){
			lletra=lineaPalabra.charAt(i);
			afirma = esLletraValidaPerMatriculaItaliana(lletra);
				if(i<=1&&afirma){
				matrVal = matrVal + 1;
				}
				if(i>1&&i<=4&&!afirma){
				matrVal = matrVal + 1;
				}
				if(i>4&&i<=6&&afirma){
				matrVal = matrVal + 1;
				}
			  }
		}
			
		if(matrVal == 7){
		//System.out.println("És una matrícula italiana vàlida");
		retornaValor = true;
		}else{
		//System.out.println("No és una matrícula italiana vàlida");
		retornaValor = false;
		}
	  return retornaValor;
      }
  
  
     public static boolean esLletraValidaPerMatriculaItaliana(char lletra){
   
	   if(Character.isUpperCase(lletra)&&Character.isLetter(lletra)&&lletra!='I'&&
	   lletra!='Q'&&lletra!='O'&&lletra!='U'&&lletra!='Ñ'&&lletra!='Ç'&&lletra!='À'&&
	   lletra!='ß'&&lletra!='È'&&lletra!='É'){
	   
	   return true;
	   }
	   return false;
                           
   }
  
  public static void matriculesValides(String matriculaValida)throws IOException{
       String camiValid = "italianes.txt";
       BufferedWriter sortida = new BufferedWriter(new FileWriter(camiValid, true));
       
       sortida.write(matriculaValida);
       sortida.newLine();
       sortida.close();
       
  }
  
    public static void matriculesErronies(String matriculaIncorrecta)throws IOException{
       String camiValid = "desconegudes.txt";
       BufferedWriter sortida = new BufferedWriter(new FileWriter(camiValid, true));
       
       sortida.write(matriculaIncorrecta);
       sortida.newLine();
       sortida.close();
       
  }
}
		  
