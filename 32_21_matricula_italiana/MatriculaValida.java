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
		for (int i = 0; i < matri.length(); i++) {
			boolean esaMatri;
			
			if (Character.isLetter(matri.charAt(0))){
				if (Character.isLetter(matri.charAt(1))){
				
					if (Character.isDigit(matri.charAt(2))){
						if (Character.isDigit(matri.charAt(3))){
							if (Character.isDigit(matri.charAt(4))){
							
								if (Character.isLetter(matri.charAt(5))){
									if (Character.isLetter(matri.charAt(6))){
										System.out.println("És una matrícula italiana vàlida");
										}
									}
								}
							}
						}
					}
				}
				else {
					System.out.println("No és una matrícula italiana vàlida");
					}
				}
			}
		}
