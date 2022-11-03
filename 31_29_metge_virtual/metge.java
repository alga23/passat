/*Aquest programa el que farà és 
/presentar-nos a un metge que ens dirà 
/que tenim que prendre per poder recuperar-nos
/de les nostres malalties
*/

public class metge{
	public static void main (String [] args) {
		String simptomes1 = "no";
		
		String simptomes2 = "no";
		
		String simptomes3 = "no";
		
		int edat = 0;
		
		System.out.println("Bon dia, quins simptomes tens");
		
		simptomes1 =Entrada.readLine();
		
		System.out.println("Algun més");
		
		simptomes2 =Entrada.readLine();
		
		System.out.println("Aixó és tot?");
		
		simptomes3 =Entrada.readLine();
		
		System.out.println("Quants anys té?");
		
		
		if ((simptomes1.equals("esternuts") && simptomes2.equals("mal de cap") && simptomes3.equals("no")) || (simptomes1.equals("mal de cap") && simptomes2.equals("esternuts") && simptomes3.equals("no") ||)) {
		
		System.out.ptintln("Necessites àcid acetil salicílic (AAS) ");
		
		}
		
		
		else if ((simptomes1.equals("esternuts") && simptomes2.equals("mal de cap") && simptomes3.equals("problemes d'estómac")) || (simptomes1.equals("mal de cap") && simptomes2.equals("esternuts") && simptomes3.equals("pobemes d'estómac") ||)) {
		
		System.out.ptintln("Necessites paracetamol");
		
		}
		
		else if ((simptomes1.equals("tos") && edat  || (simptomes1.equals("mal de cap") && simptomes2.equals("esternuts") && simptomes3.equals("pobemes d'estómac") ||)) {
		
		System.out.ptintln("Necessites paracetamol");
		
		}
