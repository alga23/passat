/*Prorama igual que l'anterior però aquesta
/vegada utilitzarem un mòdul per optimitzar
/el nostre programa
*/

public class Quadrats {
	public static void main (String[] args) {
		System.out.println("Quants?");
		int nombre = Integer.parseInt(Entrada.readLine()); 
		dibuixaQuadrats(nombre);
		}
		
		
		
		public static void dibuixaQuadrats(int quantitat) {
		int cont = 0;
		while(cont < quantitat){
	
		for (int linia=1; linia <= 5; linia++) {

            // dibuixa una línia

           	 	for (int columna=1; columna <= 5; columna++) {

                // dibuixa un element de la línia

                System.out.print(" X");

            }

            // dibuixa un salt de línia

            System.out.println();
           

        }
        System.out.println();
        cont+= 1;
       }
      }
     }
