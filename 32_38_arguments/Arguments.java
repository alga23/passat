/*Aquest programa agafa els arguments de
/un programa i anlitza que son
/utilitzant les funcions de 
/lÙtilString
*/
public class Arguments {
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
	 		String arg = args[i];
	 		System.out.print(args);
	 		boolean enter = UtilString.esEnter(arg);
	 		if (enter == true) {
	 			String argu = arg;
	 			System.out.println("[ " + i + " ]: no és enter");
	 			}
	 		else {
	 			String argu = arg;
	 			System.out.println("[ " + i + " ] :  és enter");
	 			
	 		}
	 	}
	 }
}
	 	
