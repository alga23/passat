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

        int numEs = quantesOcurrencies(entrada, 'e');
        
        int numIs = quantesOcurrencies(entrada, 'i');
        
        int numOs = quantesOcurrencies(entrada, 'o');
        
        int numUs = quantesOcurrencies(entrada, 'u');

        mostraOcurrencies('a', numAs);

        mostraOcurrencies('e', numEs);
        
        mostraOcurrencies('i', numIs);
                
        mostraOcurrencies('o', numOs);
                       
        mostraOcurrencies('u', numUs);
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
