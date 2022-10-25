/*El programa ens donarà el mes seguent
/i el mes anterior del mes i any 
/que nosaltres li introduim
*/
public class MesosAnys {
	public static void main (String[] args) {
		System.out.println("Mes?");
		int mes = Integer.parseInt(Entrada.readLine());
		System.out.println("Any?");
		int any = Integer.parseInt(Entrada.readLine());  
		
		if (mes == 1) {
			int mesAnterior = 12;
			mes = mes +1;
		       int anyAnterior = any -1;
			System.out.println("Mes anterior "  + mesAnterior + "/" + anyAnterior + " i mes següent " + mes + "/" + any);
			}
		else if (mes >= 12) {
			int mesSegüent = 1;
			int anySegüent = any +1;
			mes = mes -1;
			System.out.println("Mes anterior "  + mes+ "/" + any + " i mes següent " + mesSegüent + "/" + anySegüent);
			}
		else {
		
			int mesAnterior = mes -1;
			int mesSegüent = mes +1;
			System.out.println("Mes anterior "  + mesAnterior + "/" + any + " i mes següent " + mesSegüent + "/" + any);
		
		
	
			
			}
		
		
		
		}
	}
	
		
		

