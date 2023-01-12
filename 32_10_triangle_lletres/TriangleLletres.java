/*En aquest programa el que farem és demanar un text i dibuixar
/*un triangle amb les lletres d'aquest. Ho farem utulitzant varios moduls
*/
public class TriangleLletres {
	public static void main (String[] args) {
		System.out.println("Text?");
		String text = Entrada.readLine();
		dibuixaTriangle(text);
		
		}
		
	public static void dibuixaTriangle(String text) {
		for(int linia = 1; linia <= text.length(); linia++){
			dibuixaLinia(text, linia);
			System.out.println();
			}
		
		}
		
	public static void dibuixaLinia(String text, int linia) {
		for (int i = 0; i < linia; i++) {
			if (i + 1 == linia) {
				System.out.print(text.charAt(i));
			} else
				System.out.print(text.charAt(i) + ", ");
		}
	}
}

		
		
	
	      	
			
