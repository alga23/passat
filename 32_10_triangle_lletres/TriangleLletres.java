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
	      	 char caracterSeguent;
	      	 char coma = ',';
	      	for (int i = 0; i < linia; i++) {
	      		char caracter = textTriangle.charAt(i);
	      		String caracterString = caracter;
	      		caracterSeguent = textTriangle.charAt(i + 1); 
	      		String paraula = caracterString.concat(caracterSeguent);
	      		String piramide = paraula + coma;
	      		System.out.print(piramide);
	      		}
	      	}
	      }
	      	
	      	
			
