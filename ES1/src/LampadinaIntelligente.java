public class LampadinaIntelligente {

    private int potenza;
    private int quantitaDiIlluminazione;
    private String colore;
    private String nome;
    private boolean accesa;

    public LampadinaIntelligente(int potenza) {
        this.potenza = potenza;
        this.quantitaDiIlluminazione = 50;
        this.colore = "bianco";
        this.nome = "";
    }

    public LampadinaIntelligente(LampadinaIntelligente d) {
        this.potenza = d.potenza;
        this.quantitaDiIlluminazione = d.quantitaDiIlluminazione;
        this.colore = d.colore;
        this.nome = d.nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getColore(){
        return this.colore;
    }

    public void setColore(String colore){
        this.colore = colore;
    }

    public void accendi() {
        this.quantitaDiIlluminazione = 100;
    }
    public void spegni() {
        this.quantitaDiIlluminazione = 0;
    }

    public void aumentaIlluminazione() {

        if (this.quantitaDiIlluminazione < 100) {
            this.quantitaDiIlluminazione = this.quantitaDiIlluminazione + 10;
        }
    }

    public void diminuisciIlluminazione() {

        if (this.quantitaDiIlluminazione > 0) {
            this.quantitaDiIlluminazione = this.quantitaDiIlluminazione - 10;
        }
    }

    public String toString() {

        String stato = (this.quantitaDiIlluminazione > 0) ? "accesa" : "spenta";

        return "Nome: " + this.nome +
                ", Potenza: " + this.potenza + " watt" +
                ", Stato: " + stato +
                ", qDI: " + this.quantitaDiIlluminazione + "%" +
                ", Colore: " + this.colore;
    }
}