/*Programa que agafarà un text 
/i amb una funció pura
/ens dirà si és tracta d'un 
/nombre enter
*/
public class EsEnter {
	public static void main(String[] args) { 
		System.out.println("Introdueix texts (enter sol per finalitzar)");
		String textNombre = Entrada.readLine();
		boolean enterONo;
		while(!textNombre.isEmpty()){
			enterONo = UtilString.esEnter(textNombre);
			if (enterONo == true){
				System.out.println("És enter");
				}
			else if (enterONo == false){
				System.out.println("No és enter");
				}
			textNombre = Entrada.readLine();
			}
		System.out.println("Adéu");
		}
	}
