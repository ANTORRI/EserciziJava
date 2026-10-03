

public class GeneratoreAutoIncrementale {

    private String alfCod;
    private int numCifre = 0;
    private int valore = 0;


    public GeneratoreAutoIncrementale (String alfCod, int numCod){

        this.alfCod = alfCod;
        this.numCifre = numCod;

    }

    private static int contaCifre(int n){

        int conta = 0;

        while (n > 0){
            n /= 10;
            conta++;
        }

        return conta;
    }

    public String genera() {

        String nuovoCodice = alfCod;
        valore++;
        if (contaCifre(valore) > numCifre ){
            return "Codici esauriti";
        }

        for(int i = 0; i < numCifre - contaCifre(valore); i++){
            nuovoCodice += "0";
        }

        nuovoCodice = nuovoCodice + valore;

        return nuovoCodice;

    }

    public String toString(){
        return ("Prefisso: " + alfCod + " ultimo valore generato: " + valore);
    }
}

