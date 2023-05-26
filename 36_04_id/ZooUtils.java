/*Conjunt de mètodes que ens serviren
/per facilitar la ineracció
/entre Zoo i UsaZoo
 */

import java.util.List;

public class ZooUtils{
    
    public static void mostraCategories(List<Categoria>categories){
        int comptador = 0;
        if (categories.isEmpty()){
            System.out.println("Cap categoria");
        }else{
            /*System.out.println("Nombre de categories: "+categorias.size());*/
            for(int i = 0;i<categories.size();i++){
                comptador++;
            }
            System.out.println("Nombre de categories: "+ comptador);

            for(Categoria ct2: categories){
                System.out.printf("\tCategoria(id:%d, %s)\n",ct2.getId(),ct2.getNom());
                /*\t tabula, %d es un integer y %s es un String*/
            }
            
        }
    }
}
