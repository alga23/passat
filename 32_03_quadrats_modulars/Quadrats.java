/*Prorama igual que l'anterior però aquesta
/vegada utilitzarem un mòdul per optimitzar
/el nostre programa
*/

public class Quadrats {
	public static void main (String[] args) {
		System.out.println("Quants?");
		int nombre = Integer.parseInt(Entrada.readLine()); 
		dibuixaQuadrats();
		}
		
		
		
		public static void dibuixaQuadrats() {
		int cont = 0;
		while(cont < nombre){
	
		for (int linia=1; linia <= 5; linia++) {
			dibuixaLinia();
			cont++;
			}
		}
	}

            // dibuixa una línia

           	 	
           	 public static void dibuixaLinia() {
           	 int cont = 0;
		while(cont < nombre){
           	 
           	 	for (int columna=1; columna <= 5; columna++) {
           	 		cont++;
           	 		}

                // dibuixa un element de la línia

                System.out.print(" X");

            }

            // dibuixa un salt de línia

            

        }
       
       }
      
     
