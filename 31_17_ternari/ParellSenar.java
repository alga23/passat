/*
 * Programa que indica si el número proporcionat com a primer argument
 * és parell o senar.
 * Si no s'especifica cap número, el resultat és indeterminat.
 */
public class ParellSenar {
    public static void main(String[] args) {
        int numero = Integer.parseInt(args[0]);
        String parellOSenar = (numero % 2 == 0) ? "El número " + numero + " és parell" : "El número " + numero + " és senar";
        System.out.println(parellOSenar);  
       
  	}
  	

   }

