/* Prorama que agafarà un text (String)
/i es posarà a contar quina és
/la quantitat de nombre de cada vocal
/de les que hi hagi al text
 */
public class ComptaVocals {
    public static void main(String[] args) {
        System.out.println("Introdueix un text");

        String entrada = Entrada.readLine();

        int numAs = quantesOcurrencies(entrada, 'a');
        
        int numAsAcent = quantesOcurrencies(entrada, 'à');

        
        
        int numEs = quantesOcurrencies(entrada, 'e');
        
        int numEsObert = quantesOcurrencies(entrada, 'è');
        
        int numEsTancat = quantesOcurrencies(entrada, 'é');
        
        
        
        int numIs = quantesOcurrencies(entrada, 'i');
        
        int numIsTancat = quantesOcurrencies(entrada, 'í');
        
        int numIAmbDosPunts = quantesOcurrencies(entrada, 'ï');
        
        
        
        int numOs = quantesOcurrencies(entrada, 'o');
        
        int numOsTancat = quantesOcurrencies(entrada, 'ó');
        
        int numOsObert = quantesOcurrencies(entrada, 'ò');
        
        
        
        int numUs = quantesOcurrencies(entrada, 'u');
        
        int numUsTancat = quantesOcurrencies(entrada, 'ú');
        
        int numUsAmbDosPunts = quantesOcurrencies(entrada, 'ü');

        
        
        mostraOcurrencies('a', numAs);
        
        mostraOcurrencies('à', numAsAcent);

        mostraOcurrencies('e', numEs);
        
        mostraOcurrencies('è', numEsObert);
        
        mostraOcurrencies('é', numEsTancat);
        
        mostraOcurrencies('i', numIs);
        
        mostraOcurrencies('í', numIsTancat);
        
        mostraOcurrencies('ï', numIAmbDosPunts);
                
        mostraOcurrencies('o', numOs);
        
        mostraOcurrencies('ó', numOsTancat);
        
        mostraOcurrencies('ò', numOsObert);
                       
        mostraOcurrencies('u', numUs);
        
        mostraOcurrencies('ú', numUsTancat);
        
        mostraOcurrencies('ü', numUsAmbDosPunts);
    }
    public static void mostraOcurrencies(char lletra, int quantes) {
        System.out.println("Nombre de '" + lletra + "'s: " + quantes);
    }
    public static int quantesOcurrencies(String text, char lletra) {
        int comptador = 0;
        for (int i=0; i < text.length(); i++) {
            if (text.charAt(i) == lletra) {
                comptador += 1;
            }
        }
        return comptador;
    }
}
