/*Classe AScensor que contè
//els objectes per fer-la funcionar
*/
public class Ascensor {
	private int pis = -1;
	private String moviment = "aturat";
	
	public int getPis () {
		return pis;
		}
	public void setPis (int nouPis) {
		if (nouPis >= -1 && nouPis <=10) {
			pis = nouPis;
		}
		else {
			pis = pis;
			}
		}
		
	public String getMoviment () {
		return moviment;
		}
	public void setMoviment (String nouMoviment) {
		if (nouMoviment.equals("pujant") || nouMoviment.equals("baixant") || nouMoviment.equals("aturat")){
			moviment = nouMoviment;
		}
		else {
			moviment = moviment;
		}
	}
}
		
