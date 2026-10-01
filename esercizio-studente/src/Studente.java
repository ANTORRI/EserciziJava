public class Studente {
    String nome;
    String cognome;
    int eta;
    double altezza;
    double massa;

    public Studente(String nome, String cognome, int eta, double altezza, double massa){
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.altezza = altezza;
        this.massa = massa;
    }

    //costruttore di default
    public Studente(){
        nome = " ";
        cognome = " ";
        eta = 0;
        altezza = 0;
        massa = 0;
    }


    //costruttore di copia
    public Studente( Studente s){
        nome = s.nome;
        cognome = s.cognome;
        eta = 0;
        altezza = 0;
        massa = 0;
    }

}
