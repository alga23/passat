/*En aquest programa el que farem és demanar un text i dibuixar
/*un triangle amb les lletres d'aquest. Ho farem utulitzant varios moduls
*/
public class TriangleLletres {
	public static void main (String[] args) {
		System.out.println("Text?");
		String text = Entrada.readLine();
		
		//pedim text
		
		dibuixaTriangle(text);
		}
		
		
		//creem modul
		
		public static void dibuixaTriangle(String textTriangle){
			int linea = textTriangle.length();
			//creem un int que té el mateix valor que nombre de lletres text
			
			dibuixaLinia(textTriangle, linea);
			
			}
			
	      public static void dibuixaLinia(String textTriangle, int linia) {
	      	 for (int i = 0; i < linia; i++) {
        		String triangle = textTriangle.substring(0, i+1);
        		System.out.println(", "+ triangle);
	      		
	      		 
	      
	      }
	     }
	    }
	      	
	      	
			
