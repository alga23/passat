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
		String textCodificat = "";
		int nombreVocabulari = 26;
		for(int i = 0; i < text.length(); i++){
			char lletra =text.charAt(i);
			if (Character.isLetter(lletra) == true ){
				
				int volta = (lletra - 'a' + quants) % nombreVocabulari + 'a';
				char lletraCodificada= (char) volta;
				textCodificat += lletraCodificada;
			}
			else {
				textCodificat += lletra;
			}	
		System.out.print(textCodificat);
		}
	}
}
		
	
