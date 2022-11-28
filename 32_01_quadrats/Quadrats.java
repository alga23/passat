/*En aquest programa demanarem a l'usuari un numero
/i e s dibuixara tants quadrat com l'usuari hagi
/indicat */
public class Quadrats {
	public static void main (String[] args) {
		System.out.println("Quants?");
		int nombre = Integer.parseInt(Entrada.readLine()); 
		int cont = 0;
		while(cont < nombre){
	
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
