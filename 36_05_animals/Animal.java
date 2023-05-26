/*Aquesta classe el que farà és
/representar en Java la
/taula ANIMALS de la nostra
/base de dades
 */
  
  public class Animal {
    private int id = -1;  // -1 indica no assignat/indefinit
    private String nom;
    private Categoria categoria;

    public Animal(String nom, Categoria categoria) {
        if (nom == null || nom.isBlank()) {
            throw new IllegalArgumentException("El nom no pot ser null ni blanc");
        }
        this.nom = nom;

        if (categoria == null){
            throw new IllegalArgumentException("La categoria no pot ser null"); 
        }
        this.categoria = categoria;
    }

    public Animal(int id, String nom, Categoria categoria) {
        if (nom == null || nom.isBlank()) {
            throw new IllegalArgumentException("El nom no pot ser null ni blanc");
        }
        this.nom = nom;

        if (id < 0) {
            throw new IllegalArgumentException("L'identificador ha de ser positiu");
        }
        this.id = id;

        if (categoria == null){
            throw new IllegalArgumentException("La categoria no pot ser null"); 
        }
        this.categoria = categoria;
    }

    public boolean idIndefinit() { return id < 0; }
    public int getId() {
        if (idIndefinit()) {
            throw new UnsupportedOperationException("L'identificador no està disponible");
        }
        return id;
    }
    public void setId(int id){
        if(id < 0){
            throw new IllegalArgumentException("L'identificador ha de ser positiu"); 
        } else{
            this.id = id;
        }
    }
    public String getNom() { return nom; }
    
    public void setNom(String nom) { 
        if (nom.isBlank() || nom == null){
            throw new IllegalArgumentException("El nom no pot estar en blanc i tampoc en null");
        } else {
            this.nom = nom;
        }
    }
    public Categoria getCategoria(){
        return categoria;
    }
    public void setCategoria(Categoria categoria){
        if (categoria == null){
            throw new IllegalArgumentException("La categoria no pot ser null");
        } else {
            this.categoria = categoria;
        }
    }

    @Override
    public String toString() {
        return "Categoria(id:" +
            (id < 0 ? "indefinit" : id) +
            ", " + nom + ")";
    }
}
