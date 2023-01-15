/*Aquest progrgramaagafarà un text 
/ i farà una epecie d'encriptació
/Cesar. EL nombre de lletres al
/que pot saltar una letra i ser
/substituida per el resultat
/pot ser escollit per l'usuari
*/
public class CodificaBasic{
	public static void main(String[] args) {
		System.out.println("Text?");
		String text = Entrada.readLine();
		System.out.println("Quants?");
		int quants = Integer.parseInt(Entrada.readLine());
		if (quants < 0){
			System.out.println("No s'accepten números negatius");
		}
		else{
		
			codifica(text, quants);
		}
	}
	public static void codifica(String text, int quants) {
		char lletra;
		String textCodificat = "";
		int nombreVocabulari = 26;
		for(int i = 0; i < text.length(); i++){
			  if (text.charAt(i) >= 'a' && text.charAt(i) <= 'z') {
				if (text.charAt(i) == 'z' && quants > 0) {
					System.out.print((char)('a' + quants - 1));
				} else if (text.charAt(i) == 'y' && quants > 1) {
					System.out.print((char)('a' + quants - 2));
				} else {
				lletra = (char)(text.charAt(i) + quants);
				System.out.print(lletra);
				}
			} else {
				System.out.print(text.charAt(i));
			}
		}
		System.out.println();
	}
}

		
	
