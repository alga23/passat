/*NOva versió del quadrat on l'usuari
/apart d'elegir el número d'elements
/que compondrà el quadrat també podrà
/dir quin caràcter serà aquest element
*/
public class Quadrat {	
	public static void main (String[] args) {
		int nombre = Integer.parseInt(args[0]);
		String caracter = args[1];
		dibuixaQuadrat(nombre, caracter);
		
		}
	public static void dibuixaQuadrat(int nombre, String caracter){
		for (int i = 1; i <= nombre; i++){
			for (int j = 1; j <=nombre; j++){
				System.out.print(" " +caracter);
				}
			System.out.println("");
			}
		}
	}
