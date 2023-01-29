/*Programa que jugarà 
/amb 'usuari a una vrsió
/del penjat. Agafarà les paraules
/d'un fitxer i les formes
/del personatge penjat
/d'un altre
*/
public class Penjat{
	public static void main(String[] args)throws IOException{
		String fitxerParaules = "paraules.txt";
		String fitxerRecursos = "recursos.txt";
		String paraula = new String();
		String paraulaCensorada = new String();
		int intents = 10;
		char lletra = '0';
		int comptadorChar = 0;
		char[] conjuntLletres = 
		BufferedReader inputParaules = new BufferedReader(new FileReader(fitxerParaules));
		BufferedReader inputRecursos = new BufferedReader(new FileReader(fitxerRecursos));
		String solucio = new String();

		
		paraula = inputParaules.readLine();
		for(int i = 0; i < paraula.length(); i++){
			paraulaCensorada.charAt(i) = '*';
			}
		
		System.out.println("Comencem a jugar");
		while (!solucio.equals(paraula)) {
			System.out.println("Paraula: " + paraulaCensorada);
			System.out.println("Utilitzades: cap ");
			System.out.println("Intents disponibles: " + intents);
			System.out.println("Introduexi una lletra");
			lletra = Entrada.readLine().charAt(0);
			comptadorChar++;
			conjuntLletres[comptadorChar] = lletra;
			for (int i = 0; i < paraulaCensorada.length(); i++) {
				if (paraula.charAt(i) == lletra) {
					paraulaCensorada.charAt(i)== lletra;
					}
				}
				
			
			
			
