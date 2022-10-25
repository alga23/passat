/*Aquest programa el que farà és donar-nos 
/una resposta diferent depenent del color
/del semàfor que ens digui l'usuari. En cas
/de que no ens digui ungun dels colors indicats,
/li direm que gagi  l'oculista
*/
public class Semafor {
	public static void main (String [] args) {
		System.out.println("Color?");
		String color = Entrada.readLine();
		
		if (color.equals("vermell")) {
    System.out.println("espera");

		
		}else if (color.equals("groc")) {
    			System.out.println("corre!");
    			}
    			
    		else if (color.equals("verd")) {
    System.out.println("passa!");
		}else {
			System.out.println("ves a l'oculista");
			}
		}
	}
		



