/*Versió de GatREnat que 
/contindrà uns moduls que
/ens diuen el nombre de vides, les
/quita i fins i tot es poden retornar */
public class GatRenat {

    private int vides = 7;
    private String posicio = "estirat";
    // Da el valor de las vidas 
    public int getVides() {
        return vides;
    }
    public void setVides(int valor) {
        if (valor >= 0) {
            vides = valor;
        }
    }
    public String getPosicio() {
        return posicio;
    }
    public void setPosicio (String novaPosicio) {
        if (posicioCorrecta(novaPosicio)) {
            posicio = novaPosicio; 
        }
    }
    public static boolean posicioCorrecta (String posicio) {
        if(posicio.equals("dret") || posicio.equals("assegut") 
        || posicio.equals("estirat")) return true;
        return false;
    }
    public boolean estaViu () {
        if (vides <= 0) return false;
        else return true;
    }
    public boolean estaAssegut() {
        if (posicio.equals("assegut")) return true;
        else return false;
    }
    public boolean estaDret() {
        if (posicio.equals("dret")) return true;
        else return false;
    }
    public boolean estaEstirat() {
        if (posicio.equals("estirat")) return true;
        else return false;
    }
    public String aixecat() {
        if(estaDret()){
            return "no faig res";
        } else {
            setPosicio("dret");;
            return "m'aixeco";
        }
    } 
    public String seu() {
        if(estaAssegut()){
            return "no faig res";
        } else {
            setPosicio("assegut");
            return "m'assec";
        } 
    }
    public String estirat() {
        if(estaEstirat()){
            return "no faig res";
        } else {
            setPosicio("estirat");
            return "m'estiro";
        }
    }
    public String mor() {
        if(vides > 0) {
            setVides(getVides()-1);
            if (vides > 0) return "auch";
            else return "ximpún";
        } else {
            return "...";
        } 
    }
    public String resuscita() {
        if(estaViu()) {
            return "...";
        }
        setVides(1);
        return "guai!";        
    }
    public String resuscita(int vides) {
        if(estaViu()) {
            return "...";
        }
        setVides(vides);
        if(!estaViu()) {
            return "...";
        }
        return "guai!";
    }
}
