/*Versió del GatRenat al que hem afegit dos
/ulls. Cada un d'aquests ulls es podrà obrir
/i tancar
*/
public class GatRenat {
        private int vides = 7;
        private String posicio = "estirat";
        private UllDeGat[] ulls;

        public GatRenat(){
            setPosicio("estirat");
            setVides(7);
            ulls = new UllDeGat[2];
            ulls[0] = new UllDeGat(false);
            ulls[1] = new UllDeGat(false);
        }
        public GatRenat(int vides, String posicio) {
            setVides(vides);
            setPosicio(posicio);
            ulls = new UllDeGat[2];
            ulls[0] = new UllDeGat(false);
            ulls[1] = new UllDeGat(false);
        }
        public GatRenat(String posicio, boolean ull1, boolean ull2){
            setPosicio("estirat");
            setVides(7);
            ulls = new UllDeGat[2];
            ulls[0] = new UllDeGat(ull1);
            ulls[1] = new UllDeGat(ull2);
        }
        public GatRenat (String posicio) {
            setPosicio(posicio);
        }
        public GatRenat (int vides) {
            setVides(vides);
        }
        @Override
        public String toString() {
            return String.format("Vides: %d. Posició: %s", vides, posicio);
        }
        public int getVides() { return vides; }

        public void setVides (int vides) {
            if (vides >= 0) {
                this.vides = vides;
            } else {
                this.vides = 7;
            }
        }
    
        public String getPosicio() {return posicio;}
    
        public void setPosicio (String posicio) {
            if (posicioCorrecta(posicio)) {
                this.posicio = posicio; 
            }
            else {
                this.posicio = "estirat";
            }
        }
        //Comprova posicio correcta
        public static boolean posicioCorrecta (String posicio) {
            if(posicio.equals("dret") || posicio.equals("assegut") 
            || posicio.equals("estirat")) return true; 
            else return false;
        }
        public UllDeGat getUllDret() {
             UllDeGat ull = new UllDeGat(ulls[0].estaObert()); 
    	     return ull;
}
        
        public UllDeGat getUllEsquerre() {
           UllDeGat ull = new UllDeGat(ulls[1].estaObert()); 
    	   return ull;
}
        public void aixecat(){
            setPosicio("dret");
            ulls[1].obret();
            ulls[0].obret();
        }
        public void seu() {
            setPosicio("assegut");
            ulls[1].tancat();
            ulls[0].obret();
        }
        public void estirat() {
            setPosicio("estirat");
            ulls[0].tancat();
            ulls[1].tancat();
        }

   //main del programa     	

public static void main(String[] args) {
    GatRenat renat = new GatRenat();
    UllDeGat ullDret = renat.getUllDret();
    UllDeGat ullEsquerre = renat.getUllEsquerre();
    System.out.printf("Quan està %s: %b + %b%n",
            renat.getPosicio(),
            renat.getUllDret().estaObert(),
            renat.getUllEsquerre().estaObert());
    renat.seu();
    System.out.printf("Quan està %s: %b + %b%n",
            renat.getPosicio(),
            renat.getUllDret().estaObert(),
            renat.getUllEsquerre().estaObert());
    renat.aixecat();
    System.out.printf("Quan està %s: %b + %b%n",
            renat.getPosicio(),
            renat.getUllDret().estaObert(),
            renat.getUllEsquerre().estaObert());
}

    }
