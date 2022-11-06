/*Anirem preguntant a l'usuari per diferents nombres, i pararem 
/quan ens doni un negatiu. Després d'aixó, li donarem el nombre
/més gran dels que ens ha dit. SI solament tenim un negatiu,
/direm que el més gran és 0
*/
public class TrobaMaxim {
	public static void main (String [] args) {
		System.out.println("Introdueix un valor");
		int valor = Integer.parseInt(Entrada.readLine());
		int maxim = valor;
		if (valor < 0) {
			maxim = 0;
			}
		
		while (valor > 0) {
			System.out.println("Introdueix un valor");
			valor = Integer.parseInt(Entrada.readLine());
			if (valor > maxim) {
				maxim = valor;
				}
			}
		System.out.println("El màxim és " + maxim);
		}
	}
			
				
