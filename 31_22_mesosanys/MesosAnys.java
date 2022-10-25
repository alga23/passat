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
		
		int mesAnterior = mes-1;
		int mesSegüent = mes + 1;
		
		int anyAnterior = any -1;
		int anySegüent = any +1;
		
		if (mes >=12) {
			mesSegüent = 1;
			
			}
		else if (mes == 1) {
			mesAnterior = 12;
			any = anyAnterior;
			
			
			
			}
		
			System.out.println("Mes anterior "  + mesAnterior + "/" + any + " i mes següent " + mesSegüent + "/" + anySegüent);
			
			}
		
		
		
		}
	
		
		

