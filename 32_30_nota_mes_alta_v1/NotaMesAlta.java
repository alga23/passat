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
		if(nombre1 == -1 || nombre2 == -1){
			System.out.println("Com a mínim calen dues notes");
			}
		else {
		
			notaMesAlta(nombre1, nombre2, mesAlta);
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
		 
