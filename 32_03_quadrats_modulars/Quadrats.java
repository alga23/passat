/*Prorama igual que l'anterior però aquesta
/vegada utilitzarem dos moduls per optimitzar
/el nostre programa. Un dels moduls serà cridat
per l'altre, i cada un faran solament un des dos
for
*/

public class Quadrats {
		public static void main (String[] args) {
		System.out.println("Quants?");
		int nombre = Integer.parseInt(Entrada.readLine()); 
		int contador = 0;
                while(contador < nombre){
			dibuixaQuadrats();
			contador+=1;
		}
	}
		
		
		
		public static void dibuixaQuadrats() {
			dibuixaQuadrat();
			}
		
	
		public static void dibuixaQuadrat(){
		for (int linia=1; linia <= 5; linia++) {
			dibuixaLinia();

			}
		System.out.println();
		}
		

            // dibuixa una línia

           	 public static void dibuixaLinia(){
           	 for (int columna=1; columna <= 5; columna++) {
           	 	System.out.print(" X");
           	 	}

                // dibuixa un element de la línia

                System.out.println();

            }
            }




           

        
      
     
