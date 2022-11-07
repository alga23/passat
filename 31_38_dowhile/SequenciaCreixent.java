/*El nostre programa s'encarregarà de pedir nombres a l'usuari.
/Si el nombre introduit no és més gran que l'anterior( o es igual),
/el programa és detendrà i ens mostrarà la quantitat de nombres que li hem introduit
/sense contar l'últim
*/
public class SequenciaCreixent {
	public static void main (String[] args) {
		//entrem al bucle
		int valor = 0;
		int valorAntic = 0;
		int contador = 0;
		
		do {
			valorAntic = valor;
			System.out.println("Introdueix un valor");
			valor = Integer.parseInt(Entrada.readLine());
			contador++;
			}
		while (valor != valorAntic || valorAntic < valor);
		
		//missatge qu s'imprimirà sempre,
		//que en cas e que no entra ningun nombre
		//ens mostrarà 0
		System.out.println("Longitud de la següència creixent: " + contador);
		}
	}
	

