/*Nova versió de l'anterior programa
/que permitirà a l'usuari escollir 
/el nombe d'elemnets que tindrà
/l'array
*/
public class EntersEntreComes {

    public static void main(String[] args) {
    
   	 System.out.println("Quants?");

        int quants = Integer.parseInt(Entrada.readLine());
        
        if (quants > 0) {
        	entersEntreComes(quants);
        	}
        else {
        	System.out.println("Res a fer");
        	}
        }


        
       public static void entersEntreComes (int quants) {
       	
       		int[] numeros = new int[quants];

       		for (int i = 0; i < numeros.length;i++) {
       			 int j = 1;
       			 System.out.println("Valor " + (i+1) + "?");
        		 numeros[i] = Integer.parseInt(Entrada.readLine());
        		 j++;
        			
        		}
        		comaEntreNombres(numeros);
        	}
        public static void comaEntreNombres (int[] numeros) {
        	System.out.print(numeros[0]);

        		for (int i = 1; i < numeros.length; i++) {

            			System.out.print(", " + numeros[i]);

        }

        System.out.println();
        }
       }
        	
        		
        
   

