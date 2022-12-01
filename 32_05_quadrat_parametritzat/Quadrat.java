/*Aquest programa crearà un quadrat de x
/amb el nombre que l'usuari li hagi indicat
/a l'args[0]
*/
public class Quadrat {	
	public static void main (String[] args) {
		int nombreX = Integer.parseInt(args[0]);
		dibuixaQuadrat(nombreX);
		
		}
	public static void dibuixaQuadrat(int nombreX){
		for (int i = 1; i <= nombreX; i++){
			for (int j = 1; j <=nombreX; j++){
				System.out.print(" X");
				}
			System.out.println("");
			}
		}
	}
