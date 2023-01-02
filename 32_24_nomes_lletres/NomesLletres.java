/*Aquest programa agafa 
/una cadena i la converteix en una
/altre que separa tots els seus caràcters per 
 */

public class NomesLletres{

    public static void main(String[] args) {

        System.out.println("Text?");

        System.out.println(

                UtilString.lletresSeparades(

                    UtilString.nomesLletres(

                        Entrada.readLine()

                        )

                    )

                );

    }

}

