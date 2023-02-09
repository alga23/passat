/*Aquest programa disposarà d'una funció que permitirà que amb el nombre que li introduim irà assignant-li scensors que comencin per el 0(ex: possem nombre 2, el programa donarà ascensor 0, ascensor 1, ascensor 2) */ 
public class Ascensor {
	public int pis;
    public static Ascensor[] creaAscensors(int quants) {
       	if (quants <= 0) {
       		quants = 0;
       		System.out.println("Cap ascensor");
       		}
       	Ascensor [] ascensors = new Ascensor[quants];
       	for (int i = 0; i < quants; i++) {
       		ascensors[i] = new Ascensor();
       		ascensors[i].pis = i;
       		}
       		return ascensors;
       	}
       	
     public static void main(String [] args){
        int quants = 0;
        if (args.length == 1 && UtilString.esEnter(args[0])) {
        	quants = Integer.parseInt(args[0]);
        	}
        Ascensor[] ascensors = creaAscensors(quants);
        for (int i = 0; i < ascensors.length; i++) {
            System.out.printf("Ascensor %d al pis %d%n", i, ascensors[i].pis);
        }
    }
}
