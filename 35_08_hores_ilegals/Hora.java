/*Classe Hora a la que hem afegit
/l'IllegalArgumetException per poder
/controlar els errors
*/
public class Hora {
  
    private int hores;
    private int minuts;
    private int segons;
       
    public Hora() {
        this.hores = 0;
        this.minuts =0;
        this.segons = 0;
    }


    public Hora(int hora, int minuto, int segundo) {
        setHores(hora);
        setMinuts(minuto);
        setSegons(segundo);
    }


    public int getHores() {
        return hores;
    }


    public void setHores(int hora) throws IllegalArgumentException{
        if(hora>=0 && hora<24){

            this.hores = hora;
        }else{

            throw new IllegalArgumentException("hores fora de rang: "+hora+"");
        }
        
    }


    public int getMinuts() {
        return minuts;
    }


    public void setMinuts(int minuts)throws IllegalArgumentException {
        if(minuts>=0 && minuts<24){

            this.minuts = minuts;
        }else{

            throw new IllegalArgumentException("minuts fora de rang: "+minuts+"");
        }
    }



    public int getSegons() {
        return segons;
    }

    public void setSegons(int segons)throws IllegalArgumentException {
        if(segons>=0 && segons<24){

            this.segons = segons;
        }else{

            throw new IllegalArgumentException("segons fora de rang: "+segons+"");
        }
    }
    
    public String toString() {
        return String.format("%d:%02d:%02d", hores, minuts, segons);
    }

}
