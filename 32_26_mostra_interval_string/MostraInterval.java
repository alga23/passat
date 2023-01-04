/*Versio modular de l'exercici que ens agafava 
/un String i depenent dels nombres que li
/posem ens mostrarà uns nombres e caracters o uns altres
/. Si el nombre final és molt gran. mostrarem solament
/del principi del substring al final. Farem el 
/programa utilitzant UtilString
*/
public class MostraInterval {
	public static void main (String[] args) {
		System.out.println("text?");
		String text = Entrada.readLine();
		
		System.out.println("inici?");
		int valorInicial = Integer.parseInt(Entrada.readLine());		
		
		System.out.println("final?");
		int valorFinal = Integer.parseInt(Entrada.readLine());
		
		System.out.println(UtilString.intervalString(text, valorInicial, valorFinal));
		}
	}
