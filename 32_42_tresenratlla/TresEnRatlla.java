/*Prorama que servirà
/per a que dos persones
/puguin fer la seva propia partida
/de tres en ratlla */
public class TresEnRatlla {


    public static void main(String[] args) {
	char[][] taulell = new char[3][3];
        
        taulell[0][0] = '·';
        taulell[0][1] = '·';
        taulell[0][2] = '·';


        taulell[1][0] = '·';
        taulell[1][1] = '·';
        taulell[1][2] = '·';
        
        taulell[2][0] = '·';
        taulell[2][1] = '·';
        taulell[2][2] = '·';
        
        char jugador = 'X';
        boolean empat = false;

        System.out.println("Comença el joc");
        
        mostraTaulell(taulell);

        // indica quin és el jugador que té el torn
           System.out.println("X?");
           
           boolean quiGuanya = jugadorGuanya(taulell, jugador);
           
           boolean acabaPartida = false;

        while (acabaPartida == false) {
            mostraTaulell(taulell);
            mostraJugador(jugador);

	    String nombre = Entrada.readLine();
	    
	    
	    
	    preambulConversioNombre(nombre);
	   
	    
            // comprova abandonament
             if (nombre.charAt(0) == 'a') {
           	acabaPartida = true;
           	}
           

            // obté coordenades del moviment
            taulell[fila][col] = jugador;

            // comprova si la casella està ocupada
            boolean casellaOcupacio = casellaOcupada(taulell, fila ,col);
            while (casellaOcupacio == true) {
            	mostraTaulell(taulell);
           	mostraJugador(jugador);
           	}


            // comprova jugador guanya
           	quiGuanya = jugadorGuanya(taulell, jugador);
           	
           	if (quiGuanya == true ) {
           		acabaPartida=true;
           		}
           		
           	
           		

            // comprova empat
             empat = hiHaEmpat(taulell);
             if (empat == true) {
             	acabaPartida = true;
             	}

            // passa torn a l'altre jugador
            jugador = 'O'; 
        }
    }
    
     public static void mostraTaulell(char[][] taulell) {
        for (int fila = 0; col < taulell.length; fila++) {
        	for (int col = 0; col < taulell[fila].length; col++){ 
			System.out.print(taulell[fila][col] + " ");
  }
  System.out.println();
}

        }
	public boolean casellaOcupada(char[][] taulell, int fila, int columna) {
		if (taulell[fila][columna] != '·') {
			return true;
			}
		return false;
		}
		
	
	public int conversioNombreFila(String nombre) { 
		if (Character.isDigit(nombre.charAt(0))){ 
           		int fila = nombre.charAt(0);
			return fila;
           }
           return null;
          }
           
       public int conversioNombreColumna(String nombre) { 
	if (Character.isDigit(nombre.charAt(1))) {
           int col = nombre.charAt(1);
           	return columna;
           }
           return null;
          }
          
         public static void preambulConversioNombre(String nombre){ 
         int fila = conversioNombreFila(nombre);
		
	    int col = conversioNombreFila(nombre);
	    }
	    
	public static void mostraJugador(char jugador) {
		System.out.println(jugador);
		}
		
	public static boolean jugadorGuanya(char[][] taulell, char jugador){
		for (int i = 0; i < taulell.length; i++) {
    			if (taulell[i][0] != jugador && taulell[i][0] == taulell[i][1] && taulell[i][1] == taulell[i][2]) {
      return true;
    }
  }


	  	for (int j = 0; j < taulell[0].length; j++) {
    			if (taulell[0][j] != jugador  && taulell[0][j] == taulell[1][j] && taulell[1][j] == taulell[2][j]) {
      return true;
    }
  }


		  if (taulell[0][0] != jugadot && taulell[0][0] == taulell[1][1] && taulell[1][1] == taulell[2][2]) {
		    return true;
  }
		  if (taulell[0][2] != jugador && taulell[0][2] == taulell[1][1] && taulell[1][1] == taulell[2][0]) {
		    return true;
  }
  return false;
  }
  	public boolean hiHaEmpat(char[][] taulell){
  		 for (int i = 0; i < taulell.length; i++) {
    			for (int j = 0; j < taulell[i].length; j++) {
      				if (taulell[i][j] == '·') {

        			return false;
      }
    }
  }


  return true;
}
  

 



		
		
			
}
