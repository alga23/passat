/*programa que utilitzarà
/la classe ascensor per mostrar a l'usuari 
/a quin pis està l'ascensor i else seus
/moviments inicials i finals
*/
public class UsaAscensor{
	public static void main(String [] args) {
		Ascensor ascensor;
		ascensor = new Ascensor();
		System.out.println("Pis inicial: " + ascensor.pis);
		System.out.println("Moviment inicial: " + ascensor.moviment);
		if(ascensor.moviment.equals("aturat")){
			ascensor.moviment = "pujant";
			}
		System.out.println("Moviment final: " + ascensor.moviment);
		}
	}	
