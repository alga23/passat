/*Aquest programa preguntarà a l'usuari si és major
/d'edat utilitzant la funció respoastaBoolean. En 
/cas afirmatiu, li preguntarem per el color del
/semafir i depenent del que ens digui, li donare 
/una resposta o una altra
*/
public class Semafor {
	public static void main (String[] args) {
		System.out.println("Ets major d'edat?");
		
		String majorSioNo = Entrada.readLine();
		
		if (UtilitatsConfirmacio.respostaABoolean(majorSioNo)){
			System.out.println("Color?");
			String color = Entrada.readLine();
			colorSemafor(color);
			}
		else {
			System.out.println("No pots fer servir aquest programa sense supervisió");
			}
		}
		
	public static void colorSemafor (String color) {
		if(color.equals("groc")){
			System.out.println("corre!");
			}
		else if (color.equals("vermell")){
			System.out.println("espera");
			}
		else if(color.equals("verd")){
			System.out.println("passa");
			}
		else {
			System.out.println("ves a l'oculista");
		}
	}
}
