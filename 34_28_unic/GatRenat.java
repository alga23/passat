/*Versió del GatRenat modificicat
/per a que solament només pugui 
/agafar una instancia
*/

import java.util.Objects;
    public class GatRenat {
        private int vides = 7;
        private String posicio = "estirat";
        private static GatRenat instancia = new GatRenat();

        private GatRenat(int vides, String posicio) {
            setVides(vides);
            setPosicio(posicio);
        }
        private GatRenat(){
            setPosicio("estirat");
            setVides(7);
        }
        private GatRenat (String posicio) {
            setPosicio(posicio);
        }
        private GatRenat (int vides) {
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
    
        public static void main(String[] args) {
            GatRenat[] renats = {
                new GatRenat(),         // tot per defecte
                new GatRenat(8),        // 8 vides i posició per defecte
                new GatRenat("dret"),   // posició dret i vides per defecte
                new GatRenat(8, "dret") // 8 vides i posició dret
        
            };
            for (GatRenat renat: renats) {
                System.out.println(renat);
            }
        }
        public static GatRenat getInstancia () {
            if (instancia == null) {
                GatRenat instancia = new GatRenat();
                return instancia; 
            } else {
                return instancia;
            }
        }
        public static GatRenat getInstancia (int vides) {
            if (instancia == null) {
                GatRenat instancia = new GatRenat(vides);
                return instancia;
            } else {
                instancia.setVides(vides);
                return instancia;
            }
        }
        public static GatRenat getInstancia (String posicio) {
            if (instancia == null) {
                GatRenat instancia = new GatRenat(posicio);
                return instancia;
            } else {
                instancia.setPosicio(posicio);
                return instancia;
            }
        }
        public static GatRenat getInstancia (int vides, String posicio) {
            if (instancia == null) {
                GatRenat instancia = new GatRenat(vides,posicio);
                return instancia;
            } else {
                instancia.setVides(vides);
                instancia.setPosicio(posicio);
                return instancia;
            }
        }
    }

