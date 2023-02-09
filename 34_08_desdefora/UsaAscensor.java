/*programa que utilitzarà
/la classe ascensor per mostrar a l'usuari 
/a quin pis està l'ascensor
*/
public class UsaAscensor{
	public static void main(String [] args) {
		Ascensor ascensor;
		ascensor = new Ascensor();
		System.out.println("L'ascensor creat des de fora està al pis " + ascensor.pis);
		}
	}	
