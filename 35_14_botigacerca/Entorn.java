/*Programa amb el qual crearem la 
/botiga en qüestió i fer més operacions
/amb aquesta (com modificar vins,
/eliminar-los o fegir-los)
*/

public class Entorn {
  
    static String comanda;
    static String entrada;
    private final Botiga botiga = new Botiga();

    public static void main(String[] args) {

        Entorn entorn = new Entorn();
        saludo();
        while (true) {

            prompt();
             comanda = Entrada.readLine().strip();
            if (comanda.isEmpty()) {
                continue;
            }
            if (comanda.equals("surt")) {
                break;
            }

            switch (comanda) {

                case "ajuda":
                    entorn.mostraAjuda();
                    break;
                case "afegeix":
                    entorn.processaAfegeix();
                    break;

                case "cerca":
                    entorn.processaCerca();
                    break;
                case "modifica":
                    entorn.processaModifica();
                    break;
                case "elimina":
                    entorn.processaElimina();
                    break;
                default:
                    entorn.mostraErrorComandaDesconeguda();
            }
            
        }
        mostraComiat();

    }

    public static void saludo() {
        System.out.println("Celler La Bona Estrella. Escriviu ajuda per veure opcions.");
    }

    public static void mostraAjuda() {
        System.out.println("Comandes disponibles:");
        System.out.println(String.format("%s%n%s%n%s%n%s%n%s%n%s", "ajuda", "cerca", "afegeix", "modifica","elimina", "surt"));
    }

    public static void prompt() {
        System.out.print("botiga> ");
    }

    public void processaAfegeix() {
        String nombre = "";
        Integer preu = 0;
        Integer stock = 0;
        System.out.print("nom (enter cancel·la)> ");       
         entrada = Entrada.readLine().strip();
            if (!entrada.isEmpty()) {
                nombre = entrada;
                System.out.print("preu (en cèntims)> ");                
                 entrada = Entrada.readLine().strip();
                        if (!entrada.isEmpty()) {
                            preu = Integer.parseInt(entrada);

                                if (Integer.parseInt(entrada) < 0) {
                                    System.out.println("ERROR: el valor ha de ser un enter positiu");
                                    return;
                                
                                }
                        }
                System.out.print("estoc (enter sense estoc)> ");
                entrada = Entrada.readLine().strip();
                        if (!entrada.isEmpty()) {
                            stock = Integer.parseInt(entrada);

                                if (Integer.parseInt(entrada) < 0) {
                                    System.out.println("ERROR: el valor ha de ser un enter positiu");
                                    return;
                                
                                }
                        }
                Vi miVino = new Vi(nombre, preu, stock);
                miVino = botiga.afegeix(miVino);

                        if (miVino == null) {
                            
                            System.out.println("ERROR: no s'ha pogut afegir");
                        } else {
                            System.out.println("Introduït:");
                            
                            System.out.println(miVino.toString());
                        }
            }
    }

    public void processaCerca() {
        String nombre = "";
        Integer preu = 0;
        Integer stock = 0;
        System.out.print("nom (enter cancel·la)> ");
        entrada = Entrada.readLine().strip(); 
            if (!entrada.isEmpty()) {
                nombre = entrada;

                Vi miVino = new Vi(nombre, preu, stock);
                miVino = botiga.cerca(nombre);
                            if (miVino == null) {
                                System.out.println("No trobat");
                            } else {
                                System.out.println("Trobat:");
                                System.out.println(miVino.toString());
                            }
            }
    }

    public void processaModifica() {

        String nombre = "";
        String preu="";
        String estoc="";
        int precioVino=0;
        int consultaEstoc=0;
        
        System.out.print("nom (enter cancel·la)> ");
       entrada = Entrada.readLine().strip();
        nombre=entrada;
                if(nombre.isEmpty()) {
                nombre = entrada;
                return;
                }else if (botiga.cerca(nombre) == null) {
                    System.out.println("No trobat");
                }else{
            
                            System.out.print("preu (enter " + botiga.cerca(nombre).getPreu() + ")> ");
                            entrada = Entrada.readLine().strip();
                            preu = entrada;
            
                                        if (preu.isEmpty()){
                                        
                                        precioVino = botiga.cerca(nombre).getPreu();
                                        } else {
                                        precioVino = Integer.parseInt(preu);
                                        botiga.cerca(nombre).setPreu(precioVino);               
                                        } if (precioVino < 0) {
                                            System.out.println("ERROR: el valor ha de ser un enter positiu");
                                            return;              
                                        }
                                System.out.print("estoc (enter " + botiga.cerca(nombre).getEstoc() + ")> ");
                                entrada = Entrada.readLine().strip();
                                estoc=entrada;
          
                                        if (estoc.isEmpty()) {
                                                consultaEstoc = botiga.cerca(nombre).getEstoc();
                                        } else {
                                                consultaEstoc = Integer.parseInt(estoc);
                                                botiga.cerca(nombre).setEstoc(consultaEstoc);
                    
                                        }if (consultaEstoc < 0) {
                                        System.out.println("ERROR: el valor ha de ser un enter positiu");
                                        return;
                                        }
           
                        Vi miVino=new Vi(nombre, precioVino, consultaEstoc);
                        System.out.println("Modificat:");
                        System.out.println(miVino.toString());
         
	            }
        
    }


    public void processaElimina() {
  
        String nombre = "";
        boolean confirma=false;
        
        System.out.print("nom (enter cancel·la)> ");
        entrada = Entrada.readLine().strip();
        nombre=entrada;
        if (nombre.isEmpty()) {
            return;
           } else if (botiga.cerca(nombre) == null) {
                System.out.println("No trobat");
            } else {
                System.out.println("A eliminar:");
                System.out.println(botiga.cerca(nombre));
                System.out.print("Segur?> ");
                entrada=Entrada.readLine();
                confirma = UtilitatsConfirmacio.respostaABoolean(entrada);
                    
                   if (confirma) {                          
                            if (botiga.cerca(nombre).getEstoc() > 0) {
                                System.out.println("ERROR: no s'ha pogut eliminar");
                            } 
                            else {                          
                                botiga.elimina(nombre);
                                System.out.println("Eliminat");
                            }
                } else {                 
                        if(entrada.equals("No") || entrada.equals("no")){
                            System.out.println("No eliminat");
                        }
                }

            }

        }

    public void mostraErrorComandaDesconeguda() {
        System.out.println("ERROR: comanda no reconeguda. Escriviu help per ajuda");        
        entrada = Entrada.readLine().strip();
            if (entrada.equals("help")) {
            mostraAjuda();
            }
    }

    public static String mostraComiat() {
        System.out.println("adéu");
        return null;
    }
}


