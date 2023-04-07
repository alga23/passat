/*Classe Botiga que extenderà 
/la classe Vi i podrem veurà amb
/aquesta la quantitat de vins que tenim,
/i també podrem interactuar amb ells
/(afegir, quitar...)
*/
public class Botiga {
	private final int DEFAULT_MAX_VINS = 10;
	private Vi[] vins;
	
	public Botiga() {
		vins = new Vi[DEFAULT_MAX_VINS];
		}
	public Botiga( int maxVins) {
		vins = new Vi[maxVins];

		}
	
	public Vi afegeix(Vi nouVi) {
		if (!viEnLlista(vins, nouVi.getNom())) {
		    for(int i=0;i<vins.length;i++) {
		        if(vins[i]==null) {
		            if(nouVi.esValid()) {
		                vins[i] = nouVi;
		                return vins[i];
		            }
		        } else {
		            continue;
		        }
		    }
		    return null;
		} else {
		    return null;
		}
	    }


    public Vi elimina(String nomVi) {
        nomVi = normalitzaNom(nomVi);
        for(int i=0;i<vins.length;i++) {
            if (vins[i]==null){
                continue;
            } else if((vins[i].getNom().toLowerCase()).equals(nomVi.toLowerCase()) && vins[i].getEstoc() <= 0 ) {
                Vi viEliminat = vins[i];
                vins[i] = null;
                return viEliminat;
            }
        }
        return null;
    }

    public Vi cerca(String nomVi) {
        nomVi = normalitzaNom(nomVi);
        for(int i=0;i<vins.length;i++) {
            if(vins[i] == null) {
                continue;
            } else if (vins[i].getNom().toLowerCase().equals(nomVi.toLowerCase())) {
                return vins[i];
            }
        }
        return null;
    } 

    public Vi modificaVi(String nom, int preu, int estoc) {
        nom = normalitzaNom(nom);
        for(int i=0;i<vins.length;i++) {
            if(vins[i] == null) {
                continue;
            } else if (vins[i].getNom().toLowerCase().equals(nom.toLowerCase())) {
                vins[i].setEstoc(estoc);
                vins[i].setPreu(preu);
                return vins[i];
            }
        }
        return null;
    }  


    private boolean viEnLlista (Vi[] vins, String nomVi) {
        for(int i=0;i<vins.length;i++) {
            if(vins[i] == null) {
                continue;
            } else if (vins[i].getNom().equals(nomVi)) {
                return true;
            }
        }
        return false;
    }

    public static String normalitzaNom(String nom) {
        if (nom.isBlank()) {
            return "NOM NO VÀLID!";
        }
        nom = nom.trim();
        nom = String.format(nom.replaceAll(" +"," "));
        return nom;
    }
}
		  
