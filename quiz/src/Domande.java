public class Domande {
    private String domande;
    private int valore;
    private Risposta[] risposte;
    private Integer rispostaUtente;

    public Domande (String domande, Risposta[] risposte) {
        this.domande = domande;
        this.risposte = new Risposta[4];

        for (int i = 0; i < 4; i++) {
            this.risposte[i] = risposte[i];
        }

        this.valore = 1;
        this.rispostaUtente = 0;
    }

    public Domande (Domande a) {
        this.domande = a.domande;
        this.valore = a.valore;
        this.risposte = new Risposta[4];

        for (int i = 0; i < 4; i++) {
            this.risposte[i] = a.risposte[i];
        }

        this.rispostaUtente = 0;
    }

    public boolean rispondi (int scelta) {
        if (scelta < 1 || scelta > 4) {
            throw new IllegalArgumentException("scelta compresa tra 1 e 4");
        }
        this.rispostaUtente = scelta;
        //non so come contitnuare e come salvare il valore
    }

}
