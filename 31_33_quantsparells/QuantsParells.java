/*Anirem demanant nombres i sumant-los. El programa acabarà quant
/l'usuari afegeixi un nombre negatiu.
*/
public class QuantsParells {
	public static void main (String [] args) {
		int suma = 0;
		boolean valorPositiu = true;
		
		while (valorPositiu) {
			System.out.println("Introdueix un valor");
			int valor = Integer.parseInt(Entrada.readLine());
			
			if (valor >= 0) {
				if ( valor % 2 == 0) {
					suma++;
					}
				}
				else {
					valorPositiu = false;
					System.out.println("Nombre de parells introduïts: " + suma);
			}
		 }
       }
      }
       	
