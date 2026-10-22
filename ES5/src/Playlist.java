

public class Playlist {

    private String nome;
    private int quantiBrani;
    private String stato ;
    private int branoCorrente = 1;
    private Canzone [] brani;


    public Playlist (String nome, int QuantiBrani) {
        this.nome = nome;
        this.quantiBrani = QuantiBrani;
        this.stato = "STOP";
    }

    public Playlist ( Playlist playlist) {
        this.nome = playlist.nome;
        this.quantiBrani = playlist.quantiBrani;
        this.stato = playlist.stato;
    }

    public String getnome(){
        return nome;
    }

    public int getQuantiBrani(){
        return quantiBrani;
    }

    public int getbranoCorrente(){
        return branoCorrente;
    }

    public String play(String stato){

        if(!stato.equals("PLAY")){
            this.stato = "PLAY";
        }

        return this.stato;
    }

    public String pause(String stato){

        if(!stato.equals("STOP")){
            this.stato = "PAUSE";
        }
        return this.stato;
    }

    public String stop(String stato){

        if (this.stato.equals("STOP")){
            branoCorrente = 1;
        }
        else {
            this.stato = "STOP";
        }
        return this.stato;
    }

    public int branoSuccessivo() {
        if (!stato.equals("STOP")) {
            if (branoCorrente == quantiBrani) {
                branoCorrente = 1;
            } else {
                branoCorrente++;
            }
        }
        return branoCorrente;
    }

    public int branoPrecedente() {
        if (!stato.equals("STOP")) {
            if (branoCorrente == 1) {
                branoCorrente = quantiBrani;
            } else {
                branoCorrente--;
            }
        }
        return branoCorrente;
    }

    /*public String toString(){
        return ("Playlist: " + nome + "," + quantiBrani + " brani in " + stato + " sul brano " + branoCorrente);
    }*/



    public Playlist(String nome, Canzone [] brani) {
        this.nome = nome;
        this.brani = brani;
        this.stato = "STOP";

    }

    public Canzone getCanzone( int indice){
        if (indice < 1 || indice > quantiBrani) {
            return null;
        }
        return brani[indice];
    }

    public boolean add(Canzone canzone) {
        if(quantiBrani >= 100){
            return false;
        }

        brani[quantiBrani] = canzone;
        quantiBrani++;
        return true;
    }

    public Duration durataTotale(){
        int totTempo = 0;

        for(int i = 0; i < quantiBrani; i++){
            totTempo += brani[i].getDurata().inSecondi();
        }

        int min = totTempo / 60;
        int sec = totTempo % 60;

        return new Duration (min, sec);
    }

    @Override
    public String toString() {
        String s = nome + ", " + quantiBrani + " brani, in " + stato;

        if (quantiBrani == 0) {
            return s + ".";
        }

        Canzone corrente = brani[branoCorrente - 1];
        return s + " sul brano " + corrente.getNome_brano() + " di " + corrente.getArtista() + ".";

    }
}

