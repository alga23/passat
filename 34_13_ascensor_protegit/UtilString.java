/*Classe que podrem utlitzar per fer distentes verificacions */
public class UtilString{
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
   }

