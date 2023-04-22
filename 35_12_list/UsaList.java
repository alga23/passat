/*Classe o utilitzem un List i 
/explorem les seves posibilitats
/i la majora de coses que podem fer amb
/aquesta
*/
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class UsaList {
    public static void main(String[] args) {
        List<String> lista;

        // TODO: inicialitza la llista amb una instància de  ArrayList
        //       un LinkedList. Com et vingui de gust
            lista = new ArrayList<String>();

        System.out.println("Obtenim les entrades");
        System.out.println("====================");
        String valor;

        valor = Entrada.readLine();

        // TODO: afegeix valor a la llista
            lista.add(valor);

        valor = Entrada.readLine();

        // TODO: afegeix el valor a l'inici de la llista
        lista.add(0, valor);

        valor = Entrada.readLine();

        // TODO: afegeix el valor al mig de la llista
        lista.add((lista.size()/ 2), valor);

           // System.out.println(llista);
        System.out.println("Cerquem elements de la llista");
        System.out.println("=============================");
        String text = Entrada.readLine();

        boolean esTroba=false;
        
        // TODO: inicialitza esTroba a true si text està a la llista
                if(lista.contains(text)){
                   esTroba = true;
                }
               // System.out.println("el texto " + text + " si esta" + esTroba);
        System.out.printf("El text %s és troba a la llista: %s%n", text, esTroba);
      
        int indexPrimerOcurrencia;
        // TODO: inicialitza indexPrimerOcurrencia a l'índex on es troba text
                indexPrimerOcurrencia= lista.indexOf(text);
        System.out.printf("Posició de %s a la llista: %s%n", text, indexPrimerOcurrencia);


        System.out.println("Mostrem les entrades introduïdes");
        System.out.println("================================");
        boolean listaBuida=false;
        // TODO inicialitza llistaBuida de manera que valgui cert si
        // la llista està buida.
                if(lista.isEmpty()){
                    listaBuida=true;
                }
           
        while (! listaBuida) {
            String entrada="";
            // TODO: inicialitza entrada de manera que contingui el
            // primer element de la llista
               entrada = lista.get(0);

            System.out.println(entrada);
            // TODO: elimina el primer element de la llista
               lista.remove(0);
            // TODO: actualitza el valor de llistaBuida
                if(lista.isEmpty()){
                    listaBuida=true;
                }
        }
        
    }
}
