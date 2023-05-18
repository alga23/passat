import java.util.LinkedList;

/*Classe Botiga que extenderà 
/la classe Vi i podrem veurà amb
/aquesta la quantitat de vins que tenim,
/i també podrem interactuar amb ells
/(afegir, quitar...)
*/

public class Botiga {
    private final int DEFAULT_MAX_VINS=10;
   // private Vi vins[];
    LinkedList <Vi>vins;

    public Botiga() {       
        vins = new LinkedList<>();
    }
    
    public Vi afegeix(Vi vins){
        if(vins.getPreu()<0){
            return null;
        }
        if(vins.getEstoc()<0){
            return null;
        }
        if(vins.getNom().equals("NOM NO VÀLID!")){
            return null;
        }
        Vi vinoEncontrado = cerca (vins.getNom());  
        if( vinoEncontrado == null){            
            for(int i =0; i<this.vins.length; i++){
                if(this.vins[i]== null){
                    this.vins[i]=vins;
                    return vins;
                }
            }
        }
        return null;
    } 
    
    public Vi elimina(String nombreVino){
       
     Vi vinoAEliminar = cerca(nombreVino);
        if(vinoAEliminar == null){

        }
        else{
                if(vinoAEliminar.getEstoc()>0){
                    return null;
                }
                else{
                        for(int i=0;  i<this.vins.length; i++){
                                if(this.vins[i] == null){
                                    return vinoAEliminar;    
                                }
                                else{
                                        if(this.vins[i].getNom().equals(nombreVino)){
                                                if(this.vins[i].getEstoc() == 0){
                                                    vinoAEliminar = this.vins[i];
                                                    this.vins[i] = null;
                                                }
                                        }                       
                                        else{
                                    
                                            this.vins[i] = null;
                                        }
                                }
                        }
                 }
        }        
        return vinoAEliminar;
    }
    
    public Vi cerca(String nom){
        Vi vinoADevolver=null;
        String  normaliza=Vi.normalitzaNom(nom);
          
        for(int i =0; i <this.vins.length; i++){
                if(this.vins[i]!=null){
                        if(this.vins[i].getNom().toLowerCase().equals(normaliza.toLowerCase())){
                                if(this.vins[i].esValid()== true){
                                    vinoADevolver = this.vins[i];

                                }
                                else{
                                    vinoADevolver = null;
                                }                         
                        }                         
                }
        }

        return vinoADevolver;
    }


    }


