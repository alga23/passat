/*En aquest programa anirem inroduint diferents
/notes d'examens (que estaren totes entre 1 i 10) 
/i pararem quan ens doni un nombre negatiu. 
/Despŕes d'aixo, les compararem totes per veure quin és la més gran
*/
public class NotaMesAlta {
	public static void main (String[] args) {
		System.out.println("Introdueix les notes (-1 per finalitzar)");
		int nombre1 = Integer.parseInt(Entrada.readLine());
		int nombre2 = Integer.parseInt(Entrada.readLine());
		int mesAlta = 0;
		if ((nombre1 > 0 && nombre1 < 10) || (nombre2 > 0 && nombre2 < 10)){
		
			notaMesAlta(nombre1, nombre2, mesAlta);
		}
		else {
			System.out.println("Com a mínim calen dues notes");
			}
	}

	public static void notaMesAlta(int nombre1, int nombre2, int mesAlta) {
		 mesAlta = Math.max(nombre1, nombre2);
		 int nombre3 = Integer.parseInt(Entrada.readLine());
		 
		 if (nombre3 <= 0) {
		 	System.out.println("La nota més alta és " + mesAlta);
		 	}
		 	
		 else {
		 	notaMesAlta(nombre3, mesAlta, mesAlta);
		 	}
		 }
		}
		 
