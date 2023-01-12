/*Nova versió del TruangeLetres que aquesta vegada 
/imprimirà el text en qüestió a l'inversa
/(ho imprimirem al reves i anirà fen una 
/piramide invertida finas arribar a la 
/primera lletra)
*/
public class TriangleLletresInvertit {
	public static void main (String[] args) {
		System.out.println("Text?");
		String text = Entrada.readLine();
		dibuixaTriangleInvertit(text);
		
		}
		
	public static void dibuixaTriangleInvertit(String text) {
		for(int linia = 0; linia >= 0 && linia <= text.length(); linia++){
			dibuixaLiniaInvertida(text, linia);
			System.out.println();
			}
		
		}
		
	public static void dibuixaLiniaInvertida(String text, int linia) {
		for (int i = text.length() -1; i >= linia; i--) {
			if (i == linia) {
				System.out.print(text.charAt(0));
			} else
				System.out.print(text.charAt(i - linia) + ", ");
		}
	}
} 
