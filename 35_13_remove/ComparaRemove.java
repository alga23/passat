/*
    Comparació de l'operació remove() en ArrayList i LinkedList
    eliminant per l'inici, pel final i pel mig.

    Els resultats obtinguts han estat:

    Primera execució:
    =================

Comparant l'eficiència de les llistes

Comparació quan eliminem sempre de l'inici
test remove(0) LinkedList:       4272422
test remove(0) ArrayList:      248111233

Comparació quan eliminem sempre del final
test remove(últim) LinkedList: 5927150
test remove(últim) ArrayList:  1913269

Comparació quan eliminem sempre del mig
test remove(mig) LinkedList:  3011832345
test remove(mig) ArrayList:    123022979

        Segona execució:
        ================

Comparant l'eficiència de les llistes

Comparació quan eliminem sempre de l'inici
test remove(0) LinkedList:       4281084
test remove(0) ArrayList:      245003963

Comparació quan eliminem sempre del final
test remove(últim) LinkedList:   6194352
test remove(últim) ArrayList:    1962359

Comparació quan eliminem sempre del mig
test remove(mig) LinkedList:  2999902084
test remove(mig) ArrayList:    121543746

        Tercera execució:
        =================

Comparant l'eficiència de les llistes

Comparació quan eliminem sempre de l'inici
test remove(0) LinkedList:        4461615
test remove(0) ArrayList:       249534948

Comparació quan eliminem sempre del final
test remove(últim) LinkedList:    5875640
test remove(últim) ArrayList:     2008986

Comparació quan eliminem sempre del mig
test remove(mig) LinkedList:   3004167041
test remove(mig) ArrayList:     124290823

        Resultats
        =========

========== ================== ================== ======================================================
**prova**  **linkedList**      **ArrayList**      **resultat**
---------- ------------------ ------------------ ------------------------------------------------------
inici       4338373,67           247550048        LinkedList resulta 57,06 veces más rápido que ArrayList
final       5999047,33           1961538          ArrayList resulta 3,05 veces más rapido que LinkedList
mig         3005300490           122952516        ArrayList resulta 24,45 veces más rápido que LinkedList
========== ================== ================== ======================================================

    Per calcular cada columna:

    * la cel·la (1, 1) correspon al temps mig de la implementació LinkedList eliminant des de l'inici
      Es calcula sumant els valors obtinguts a les tres execucions i dividint-los per 3

    * el resultat per la fila inici indica quantes vegades és més ràpid un que l'altre. Per fer-ho, dividim
      el valor més petit pel més gran i arrodonim a l'enter.

    Conclusions
    ===========

    En vistes als resultats, en cas que hagi de fer servir una List per eliminar molts valors, escolliré ArrayList

     */
import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
public class ComparaRemove {
    private static final int LONGITUD = 100000;
    private static List<Integer> emplena(List<Integer> llista) {
        //codi que emplena la llista amb enters del 0 a LONGITUD - 1
                  
              for(int i =0; i<LONGITUD; i++){
               llista.add(i);
              }
        return llista;
    }
    private static long testRemove0(List<Integer> llista) {
        long tempsInicial = System.nanoTime();
        boolean listaVacia;
        // codi que elimina un a un tots els elements de la llista per la posició 0
        
        
          if(llista.isEmpty()){
             listaVacia=true;
          }
          else{
             listaVacia=false;
          }
          
          
          while(!listaVacia){
            llista.remove(0);
            
              if(llista.isEmpty()){
                  listaVacia=true;
              }
              else{
                  listaVacia = false;
              }
          }
        return System.nanoTime() - tempsInicial;
       
       
    }
    
    private static long testRemove(List<Integer> llista) {
        long tempsInicial = System.nanoTime();
        boolean listaVacia;
        //codi que elimina un a un tots els elements de la llista per la darrera posició
        
          if(llista.isEmpty()){
             listaVacia=true;
          }
          else{
             listaVacia=false;
          }
          
          
          while(!listaVacia){
            llista.remove(llista.size()-1);
            
              if(llista.isEmpty()){
                  listaVacia=true;
              }
              else{
                  listaVacia = false;
              }
          }
        return System.nanoTime() - tempsInicial;
    }
    private static long testRemoveMig(List<Integer> llista) {
        long tempsInicial = System.nanoTime();
         boolean listaVacia;
        //codi que elimina un a un tots els elements de la llista per la posició mig
        
          if(llista.isEmpty()){
             listaVacia=true;
          }
          else{
             listaVacia=false;
          }
          
          
          while(!listaVacia){
            llista.remove(llista.size() / 2);
            
              if(llista.isEmpty()){
                  listaVacia=true;
              }
              else{
                  listaVacia = false;
              }
          }
        return System.nanoTime() - tempsInicial;
    }
    
    public static void main(String[] args) {
        System.out.println("Comparant l'eficiència de les llistes");
        System.out.println();

        System.out.println("Comparació quan eliminem sempre de l'inici");
        System.out.printf("test remove(0) LinkedList:     %10d%n", testRemove0(emplena(new LinkedList<Integer>())));
        System.out.printf("test remove(0) ArrayList:      %10d%n", testRemove0(emplena(new ArrayList<Integer>())));
        System.out.println();
         

        System.out.println("Comparació quan eliminem sempre del final");
        System.out.printf("test remove(últim) LinkedList: %10d%n", testRemove(emplena(new LinkedList<Integer>())));
        System.out.printf("test remove(últim) ArrayList:  %10d%n", testRemove(emplena(new ArrayList<Integer>())));
        System.out.println();

        System.out.println("Comparació quan eliminem sempre del mig");
        System.out.printf("test remove(mig) LinkedList:   %10d%n", testRemoveMig(emplena(new LinkedList<Integer>())));
        System.out.printf("test remove(mig) ArrayList:    %10d%n", testRemoveMig(emplena(new ArrayList<Integer>())));
        
     
        System.out.println();
    }
}

