/*Anirem agafant les notes dels alumnes d'una classe
/i les anirem sumant. Totes les notes tenen que estar
/entre el 0 i el 100. En quant s'agafi un valor fora d'aquest
/rang, el programa deixarà de preguntar i ens mostrarà
/la suma del que tenim fins ara
*/
public class SumaNotes {

    public static void main(String[] args) {


        // creem la variable on guardarem el resultat de sumar

        int suma = 0;   // inicialment no hem sumat res i per tant és 0


        // demaem una nota

        System.out.println("Introdueix una nota");

        int nota = Integer.parseInt(Entrada.readLine());


        // ves sumant mentre la nota estigui entre el 0 i el 100

        while (0 < nota && nota < 100) {

            suma = suma + nota;

            // demana un nou valor

            System.out.println("Introdueix una nota");

            nota = Integer.parseInt(Entrada.readLine());

        }


        // mostrem el resultat

        System.out.println("La suma de les notes vàlides és " + suma);

    }

}
