/*Aquest rpograma agafarà un String i ens
/mostrara un interval que començarà a partir
/del ombre que nosaltres li diguem i acabarà
/a partir del que li diguem
*/
public class MostraInterval {
	public static void main (String[] args) {
		System.out.println("text?");
		String text =Entrada.readLine();
		System.out.println("inici?");
		int nombreInicial = Integer.parseInt(Entrada.readLine());
		System.out.println("final?");
		int nombreFinal = Integer.parseInt(Entrada.readLine());
		
		if (nombreInicial > 0 && nombreFinal > 0) {
			mostraInterval(text, nombreInicial, nombreFinal);
			}
		}
		
		public static void mostraInterval(String text, int nombreInicial, 							int nombreFinal) {
		
		if (nombreInicial > nombreFinal) {
			for(int i = nombreFinal; i >= nombreInicial; i--){
				char lletra = text.charAt(i);
				System.out.println(lletra);
				}
			}
				
		
		else if (nombreInicial < nombreFinal){
			for (int i = nombreInicial; i <= nombreFinal; i++){
				char lletra = text.charAt(i);
				System.out.println(lletra);
			}
		}
		/*else if (nombreFinal > text.length()){
			for (int i = nombreInicial; i <= text.length();i++){
			char lletra = text.charAt(i);
			System.out.println(lletra);
			}*/
		}
	}
				

		
		
		
		
