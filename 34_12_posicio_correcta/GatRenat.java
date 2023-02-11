//Classe que contè al GatREnat i els seus parametres
//(posicio i vides)

public class GatRenat {
    private int vides = 7;
    private String posicio = "estirat";
    
    
    public int getVides() {  //  retorna el nombre de vides
        return vides;
    }
    public void setVides(int novesVides) {   // modifica el nombre de vides si ens donen un de vàlid
        if (novesVides >= 0) {
            vides = novesVides;
        }
       }
        
         public String getPosicio() {  //  retorna la posicio
        return posicio;
    }
    public void setPosicio(String novaPosicio) {   //modifica la posicio
       	
        	 if (novaPosicio.equals("dret") || novaPosicio.equals("assegut")) {
        		posicio = novaPosicio;
        		}
        	else {	
        		posicio = "estirat";
        	}
        	
        
    }
    }
   

