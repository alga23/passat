/*En aquest programa, agafarem un text que 
/revisarem per veure si és una matricula italiana
/(correspon amb les lleis d'identificacio
/que tenen aquestes
*/
public class MatriculaValida {
	public static void main (String[] args) {
		System.out.println("Introduïu una matrícula");
		
		String matricula = Entrada.readLine();
		
		esLletraValidaPerMatriculaItaliana(matricula);
		
		
		}
		
	public static void esLletraValidaPerMatriculaItaliana(String matri){
		boolean esValida = true;
		for (int i = 0; i < matri.length(); i++) {
			if (i == 0 || i == 1) {
			    if (!Character.isLetter(matri.charAt(i))) {
				esValida = false;
				break;
            }
			} else if (i >= 2 && i <= 4) {
			    if (!Character.isDigit(matri.charAt(i))) {
				esValida = false;
				break;
            }
			} else if (i >= 5 && i <= 6) {
			    if (!Character.isLetter(matri.charAt(i))) {
				esValida = false;
				break;
			    }
        }
    }
    if (esValida) {
        System.out.println("És una matrícula italiana vàlida");

        
    }else {
	 System.out.println("La matricula no es valida");
    	}
				}
			}
		
