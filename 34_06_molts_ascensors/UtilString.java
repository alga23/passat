/*Aquest programa conté una serie d'instrucions per evaluar si una lletra és vocal */
public class UtilString {
    public static boolean esVocal(char c) {
        c = Character.toLowerCase(c);
        if ("aeiouàèéíïòóúü".contains("" + c)) {
            return true;
        }
        return false;
    }
    
    public static String lletresSeparades(String text) {
        String textSeparat = "";
        for (int i = 0; i < text.length(); i++) {
            textSeparat += (i == 0 ? "" : ", ") + text.charAt(i);
        }
        return textSeparat;
    }
    
    public static String nomesLletres(String text) {
        String textLletres = "";
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i))) {
                textLletres += text.charAt(i);
            }
        }
        return textLletres;
    }
    
    public static String intervalString(String text, int primer, int segon) {
        String seccio = "";
        if (primer <= segon) {
            if (primer < 0) {
                primer = 0;
            }
            if (segon > text.length() - 1) {
                segon = text.length() - 1;
            }
            for (int i = primer; i <= segon; i++) {
                seccio += text.charAt(i);
            }
        } else {
            if (segon < 0) {
                segon = 0;
            }
            if (primer > text.length() - 1) {
                primer = text.length() - 1;
            }
            for (int i = primer; i >= segon; i--) {
                seccio += text.charAt(i);
            }
        }
        return seccio;
    }
    
    public static boolean esEnter(String text) {
        boolean enter = text.length() == 0 ? false : true;
        for (int i = 0; i < text.length(); i++) {
            if (!((i == 0 && (text.charAt(0) == '+' || text.charAt(0) == '-') && text.length() > 1 && Character.isDigit(text.charAt(1))) || (enter && Character.isDigit(text.charAt(i))))) {
                enter = false;
            }
        }
        return enter;
    }
    
    public static boolean esEnter(String text, boolean estricte) {
        if (estricte) {
            return esEnter(text);
        }
        return esEnter(text.strip());
    }
    
    public static int aEnter(String text, boolean estricte) {
        if (estricte) {
            return Integer.parseInt(text);
        }
        return Integer.parseInt(text.strip());
    }
}


