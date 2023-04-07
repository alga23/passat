/*Programa amb el qual crearem la 
/botiga en qüestió i fer més operacions
/amb aquesta (com modificar vins,
/eliminar-los o fegir-los)
*/
public class Entorn {
    private final Botiga botiga = new Botiga();
    public static void main(String[] args) {
        Entorn entorn = new Entorn();
        System.out.println("Celler La Bona Estrella. Escriviu ajuda per veure opcions.");
        while(true) {
            System.out.print("botiga> ");
            String entrada = Entrada.readLine().strip();
            if(entrada.isEmpty()){continue;}
            if(entrada.equals("surt")){break;}
            switch(entrada) {
                case "ajuda" : mostraAjuda();
                            break;
                case "afegeix" : entorn.procesaAfegeix();
                            break;
                case "cerca" : entorn.procesaCerca();
                            break;
                case "modifica" : entorn.procesaModifica();
                            break;
                case "elimina" : entorn.procesaElimina();
                            break;
                default: mostraErrorComandaDesconeguda();
            }
        }
        System.out.println("adéu");
    }

    // Mostra ajuda
    public static void mostraAjuda() {
        System.out.println("Comandes disponibles:\najuda\ncerca\nafegeix\nmodifica\nelimina\nsurt");
    }
    // Afegeix vi
    public void procesaAfegeix() {
        String entrada = "";
        System.out.print("nom (enter cancel·la)> ");
        entrada = Entrada.readLine();
        if(entrada.isBlank()) {return;}
        System.out.print("preu (en cèntims)> ");
        String preu = Entrada.readLine();
        if (preu.isBlank()) {
            preu = "0";
        } else if (!UtilString.esEnter(preu)){
            System.out.println("ERROR: el valor ha de ser un enter positiu");
            return;
        } else if (Integer.parseInt(preu)<0) {
            System.out.println("ERROR: el valor ha de ser un enter positiu");
            return;
        } 
        System.out.print("estoc (enter sense estoc)> ");
        String stock = Entrada.readLine();
        if (stock.isBlank()) {
            stock = "0";
        }else if (!UtilString.esEnter(stock)) {
            System.out.println("ERROR: el valor ha de ser un enter positiu");
            return;
        } else if (Integer.parseInt(stock)<0) {
            System.out.println("ERROR: el valor ha de ser un enter positiu");
            return;
        } 
        Vi nouVi = new Vi(entrada,Integer.parseInt(preu),Integer.parseInt(stock));
        if (botiga.afegeix(nouVi)==null) {
            System.out.println("ERROR: no s'ha pogut afegir");
        } else {
            botiga.afegeix(nouVi);
            System.out.println("Introduït:\n"+nouVi);
        }
    }
    // Funcio cerca vi
    public void procesaCerca() {
        String entrada = "";
        System.out.print("nom (enter cancel·la)> ");
        entrada = Entrada.readLine();
        if(!entrada.isBlank()) {
            Vi cercat = botiga.cerca(entrada);
            if (cercat == null) {
                System.out.println("No trobat");
            } else {
                System.out.println("Trobat:\n"+cercat);
            }
        }
    }
    // Permite modificar vinos
    public void procesaModifica() {
        String entrada = "";
        System.out.print("nom (enter cancel·la)> ");
        entrada = Entrada.readLine();
        if(entrada.isBlank()) {return;}
        Vi cercat = botiga.cerca(entrada);
        if(cercat==null) {
            System.out.println("No trobat");
            return;
        }
        System.out.printf("preu (enter %s)> ",cercat.getPreu());
        String preu = Entrada.readLine();
        if (preu.isBlank()) {
            preu = Integer.toString(cercat.getPreu());
        } else if (!UtilString.esEnter(preu)){
            System.out.println("ERROR: el valor ha de ser un enter positiu");
            return;
        } else if (Integer.parseInt(preu)<0) {
            System.out.println("ERROR: el valor ha de ser un enter positiu");
            return;
        } 
        System.out.printf("estoc (enter %s)> ",cercat.getEstoc());
        String stock = Entrada.readLine();
        if (stock.isBlank()) {
            stock = Integer.toString(cercat.getEstoc());
        }else if (!UtilString.esEnter(stock)) {
            System.out.println("ERROR: el valor ha de ser un enter positiu");
            return;
        } else if (Integer.parseInt(stock)<0) {
            System.out.println("ERROR: el valor ha de ser un enter positiu");
            return;
        }
        int precio = Integer.parseInt(preu);
        int estoc = Integer.parseInt(stock);
        Vi modificat = botiga.modificaVi(entrada, precio, estoc);
        System.out.println("Modificat:\n"+botiga.cerca(entrada));
    }
    // ELimina vi
    public void procesaElimina() {
        String entrada ="";
        System.out.print("nom (enter cancel·la)> ");
        entrada = Entrada.readLine();
        if(entrada.isBlank()){return;}
        Vi cercat = botiga.cerca(entrada);
        if (cercat == null) {
            System.out.println("No trobat");
            return;
        }
        System.out.println("A eliminar:\n"+botiga.cerca(entrada));
        System.out.print("Segur?> ");
        if (UtilitatsConfirmacio.respostaABoolean(Entrada.readLine())) {
            cercat = botiga.elimina(entrada);
            if (cercat == null) {
                System.out.println("ERROR: no s'ha pogut eliminar");
            } else {
                System.out.println("Eliminat");
            }
        } else {
            System.out.println("No eliminat");
        }
    }
    public static void mostraErrorComandaDesconeguda() {
        System.out.println("ERROR: comanda no reconeguda. Escriviu help per ajuda");
    }
}
