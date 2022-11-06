/*Aquest programa ens demanarà un nombre anomenat ancora.
/DEsprés d'aixó, ens anirà demanant més nombres fins que li donem un de negatiu
/Després del negatiu, el programa ens dirà quin nombre de tots els que hem posat
/és el més proper
a l'ancora
*/
public class TrobaMesProxim{
	public static void main (String[] args) {
		System.out.println("Introdueix l'àncora");
		int ancora = Integer.parseInt(Entrada.readLine());
		if (ancora < 0) {
			System.out.println("Àncora no vàlida");
			}
		System.out.println("Introdueix un valor");
		int valor = Integer.parseInt(Entrada.readLine());
		 if (valor < 0) {
			System.out.println("No s'ha introduït cap valor positiu");
		
			}
		
		
		int diferencia = ancora - valor;
		int diferenciaMesGran = diferencia;
		int valorMesProxim = valor;
		boolean bucle = true;
		
		while (valor > 0) {
			int diferenciaAnterior = diferencia;
			System.out.println("Introdueix un valor");
			valor = Integer.parseInt(Entrada.readLine());
			if (valor > 0) {
				
			diferencia = ancora - valor;
			
			if (diferencia < diferenciaAnterior) {
				diferenciaAnterior = diferencia;
				valorMesProxim = valor;
				}
			else if (diferencia == diferenciaAnterior) {
				int nombrePetit = Math.min(valor, valorMesProxim);
				valorMesProxim = nombrePetit;
				}
			
					
				
			}else {
				System.out.println("El valor introduït més pròxim a " + ancora + " és " + valorMesProxim);

			}
			
		}
	}
}
			
			 
				
			
			
			
			
			
