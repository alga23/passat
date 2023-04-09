/*Programa amb el qual crearem la 
/botiga en qüestió i fer més operacions
/amb aquesta (com modificar vins,
/eliminar-los o fegir-los)
*/

                
      ("No trobat");
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
    // Funcion que devuelve un int con le numero de lineas que tiene un archivo
    public static int contaVins() throws IOException {
        String file = "botiga.csv";
        BufferedReader input = new BufferedReader(new FileReader(file));
        int contador = 0;
        String linia ="";
        while (true) {
            linia = input.readLine();
            if (linia == null) {break;}
            else {
                String[] viArray = linia.split(";");
                if(Vi.deArrayString(viArray)==null){continue;}
                else {contador++;}
            }
        }
        input.close();
        return contador;
    }

    //Funcion que guarda vinos
    private void guardaVins() throws IOException {
        BufferedWriter output = new BufferedWriter(new FileWriter("botiga.csv"));
        while(true) {
            Vi vi = botiga.getSeguent();
            if (vi==null){
                break;
            } else {
                String[] guardar = vi.aArrayString();
                String vicsv="";
                for(int i=0;i<guardar.length;i++){
                    if(i==0){
                        vicsv = guardar[i];
                    } else {
                        vicsv=vicsv+";"+guardar[i];
                    }
                }
                output.write(vicsv);
                output.newLine();
            }
        }
        output.close();
    }
}

