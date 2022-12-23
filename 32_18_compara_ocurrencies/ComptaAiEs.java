/* programa que mostra quantes 'a's i 'e's té el text llegit per stdin */
public class ComptaAiEs {
    public static void main(String[] args) {
        System.out.println("Introdueix un text");
        String entrada = Entrada.readLine();
        comparaOcurrencies(entrada, 'a', 'e');
    }
    
      
    public static void comparaOcurrencies (String text, char lletra1, char lletra2) {
        int comptadorA = 0;
        int comptadorE = 0;
        for (int i=0; i < text.length(); i++) {
            if (text.charAt(i) == lletra1) {
                comptadorA += 1;
            } else if (text.charAt(i) == lletra2) {
                comptadorE += 1;
            }
        }
        System.out.println("Nombre de 'a's: " + comptadorA);
        System.out.println("Nombre de 'e's: " + comptadorE);
        if (comptadorA > comptadorE) {
            System.out.println("Hi ha més 'a's que 'e's");
        } else if (comptadorA < comptadorE) {
            System.out.println("Hi ha menys 'a's que 'e's");
        } else {
            System.out.println("Hi ha tantes 'a's com 'e's");
        }
    }
}
