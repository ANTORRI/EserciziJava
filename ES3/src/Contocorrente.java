public class Contocorrente {
    private String nome;
    private String cognome;
    private String codUni;
    private double saldo;

    public  Contocorrente(String nome, String cognome, String codUni) {
        this.nome = nome;
        this.cognome = cognome;
        this.codUni = codUni;
        saldo = 1000;
    }

    public double preleva(double valore){

        if (valore > 0) {
            if(valore < saldo) {
                saldo -= valore;
            }
        }
        return saldo;
    }

    public double deposita(double valore){

        if (valore > 0) {
            saldo+=valore;
        }
        return saldo;
    }

    public double getSaldo(){
        return saldo;
    }
    public String getCodice(){
        return codUni;
    }
    public String getNominativo(){
        return nome + " " + cognome;
    }

    @Override
    public String toString() {
        return "Nominativo: " + getNominativo() + " Saldo: " + getSaldo() +  " Codice univoco: " + getCodice();
    }
}


