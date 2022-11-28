/*Escriurem un programa que ens doni un enter positiu més gran que 0
/i ens donarà un quadrat amb els nombres del 1 fins el valor de l'entrada.
/Si el nombre es més gran que 9 o menor de 1 mostrarem el misatge de 
/valor inadequat
*/
public class QuadratNombres {
	public static void main (String[] args){
		System.out.println("Valor final?");
		int valorFinal = Integer.parseInt(Entrada.readLine());
		if (valorFinal > 9 || valorFinal < 1 ) {
			System.out.print("Valor inadequat");
			}
		else {
			for (int linia=1; linia <= valorFinal; linia++) {

    			for (int columna=1; columna <= valorFinal; columna++) {

        			System.out.print(" " + columna);

   					 }

    			System.out.print();

			}
		}
	}
}
