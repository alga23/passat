/*Classe amb la que podrem construir
 categories de dos formes diferents
 (amb id o sense aquest)
 */
  
public class Categoria {
    private int id = -1;  // -1 indica no assignat/indefinit
    private String nom;

    public Categoria(String nom) {
        if (nom == null || nom.isBlank()) {
            throw new IllegalArgumentException("El nom no pot ser null ni blanc");
        }
        this.nom = nom;
    }

    public Categoria(int id, String nom) {
        this(nom);
        if (id < 0) {
            throw new IllegalArgumentException("L'identificador ha de ser positiu");
        }
        this.id = id;
    }

    public boolean idIndefinit() { return id < 0; }
    public int getId() {
        if (idIndefinit()) {
            throw new UnsupportedOperationException("L'identificador no està disponible");
        }
        return id;
    }
    public String getNom() { return nom; }
    
    public void setNom(String nom) { 
        if (nom.isBlank() || nom == null){
            throw new IllegalArgumentException("El nom no pot estar en blanc i tampoc en null");
        } else {
            this.nom = nom;
        }
    }

    public void setId(int id){
        if(id < 0){
            throw new IllegalArgumentException("L'identificador ha de ser positiu"); 
        } else{
            this.id = id;
        }
    }

    @Override
    public String toString() {
        return "Categoria(id:" +
            (id < 0 ? "indefinit" : id) +
            ", " + nom + ")";
    }
}
