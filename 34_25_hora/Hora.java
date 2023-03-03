/*Classe hora que simularà
/l'hora d'un rellotge.
/També incluirà els seus moduls
/per poder canviar-la
*/
public class  Hora {
		private int hores = 0; 
		private int minuts = 00;
		private int segons = 00;
		
	public Hora(){
		this.getHores();
		this.getMinuts();
		this.getSegons();
		}
	public Hora (int hores, int minuts, int segons){
		setHores(hores);
		setMinuts(minuts);
		setSegons(segons);
		}
	public int getHores () {return hores;}
	
	public int getMinuts () {return minuts;}
	
	public int getSegons () {return segons;}
	
	public void setHores (int hores){
		if (hores >= 24 && hores < 0) {
			this.hores = 0;
			}
		else {
			this.hores = hores;
			}
		}
	public void setMinuts (int minuts){
		if (minuts >= 60 && minuts< 0) {
			this.minuts = 0;
			}
		else {
			this.minuts = minuts;
			}
		}
		
	public void setSegons(int segons){
		if (segons >= 60 && segons < 0) {
			this.segons = 0;
			}
		else {
			this.segons = segons;
			}
		}
	public void incrementa () {
	    segons++;
	    if (segons >= 60) {
		segons = 0;
		minuts++;
		if (minuts >= 60) {
		    minuts = 0;
		    hores++;
		    if (hores >= 24) {
		        hores = 0;
		    }
		}
	    }
	}

	public void incrementa (int incrementSegons) {
	    segons += incrementSegons;
	    while (segons >= 60) {
		segons -= 60;
		minuts++;
		if (minuts >= 60) {
		    minuts = 0;
		    hores++;
		    if (hores >= 24) {
		        hores = 0;
		    }
		}
	    }
	}
	
	public void decrementa(int decrementSegons) {
	       int totalSegons = this.hores * 3600 + this.minuts * 60 + this.segons;
    totalSegons -= decrementSegons;

    while (totalSegons < 0) {
        totalSegons += 86400; // Se agrega un día (86400 segundos)
    }

    this.hores = (totalSegons / 3600) % 24;
    totalSegons %= 3600;
    this.minuts = totalSegons / 60;
    totalSegons %= 60;
    this.segons = totalSegons;
}

	public void decrementa() {

    if (segons > 0) {
        segons--;
    } else {
        if (minuts > 0) {
            minuts--;
            segons = 59;
        } else {
            if (hores > 0) {
                hores--;
                minuts = 59;
                segons = 59;
            } else {
                hores = 23;
                minuts = 59;
                segons = 59;
            }
        }
    }
}


	
	public int compareTo (Hora hora2) {
		if (this.hores > hora2.hores) {
			return 1;
			}
		else if (this.hores == hora2.hores){
			if (this.minuts > hora2.minuts){
				return 1;
				}
				else if (this.minuts == hora2.minuts) {
					if (this.segons > hora2.segons){
						return 1;
				}
				}
			}
		
		else if (this.minuts == hora2.minuts) {
			if (this.segons > hora2.segons){
				return 1;
				}
			}
				
		if (this.hores < hora2.hores) {
			return -1;
			}
		else if (this.hores == hora2.hores){
			if (this.minuts < hora2.minuts){
				return -1;
				}
			else if (this.minuts == hora2.minuts) {
				if (this.segons < hora2.segons){
					return -1;
					}
				}
				}
			
		else if (this.minuts == hora2.minuts) {
			if (this.segons < hora2.segons){
				return -1;
				}
			}
		return 0;

		}
		
    @Override
    public String toString() { return String.format("%d:%02d:%02d", hores, minuts, segons); }
    
    /**
 * Compara dues hores i retorna l'operador corresponent
 * Per exemple, si hora1 és menor que hora2, l'operador serà "<". Els
 * altres dos valors possibles són ">" i "=="
 * @param hora1: primera hora a comparar
 * @param hora2: segona hora a comparar
 * @return operador resultant
 */
private static String composaOperadorComparacio(Hora hora1, Hora hora2) {
    int comparacio = hora1.compareTo(hora2);
    if (comparacio < 0) {
        return "<";
    } else if (comparacio > 0) {
        return ">";
    } else {
        return "==";
    }
}

public static void main(String[] args) {
    Hora hora1 = new Hora();
    Hora hora2 = new Hora(0, 0, 2);
    System.out.printf("Inicialment hora1: %s %s hora2: %s%n",
            hora1,
            composaOperadorComparacio(hora1, hora2),
            hora2);
    System.out.println("Incrementem 1 segon a la primera i decrementem 1 segon a la segona");
    hora1.incrementa();
    hora2.decrementa();
    System.out.printf("Finalment hora1: %s %s hora2: %s%n",
            hora1,
            composaOperadorComparacio(hora1, hora2),
            hora2);

}
}
    
			

