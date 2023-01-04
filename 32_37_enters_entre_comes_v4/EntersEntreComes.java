/*Nova versió del programa que agafa un
/array de nombres i els separa. Pero, 
/aquesta vegada l'usuari podrà escollir
/tant el nombre d'elements de l'array
/com el simbol que els separara. Utilitzarem
/un módul que és troba a UtilString
*/
public class EntersEntreComes {
	public static void main (String[] args) {
	
		System.out.println("Quants?");
		char numero =  Entrada.readLine().charAt(0);
		boolean bucle = true;
		while(bucle){
		
		if(!Character.isDigit(numero)) {
			System.out.println("Per favor, un valor enter");
			numero =  Entrada.readLine().charAt(0);
			}
		else {
			int nombre = numero;
			bucle = false;
			}
		System.out.println("Separador?");
		char separador =  Entrada.readLine().charAt(0);		
			

			
		
