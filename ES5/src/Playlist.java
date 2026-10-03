public class Playlist {
    private String nome;
    private int QuantiBrani;
    private String stato = "STOP";
    int branoCorrente = 1;

    public Playlist(String nome, int QuantiBrani, String stato) {
        this.nome = nome;
        this.QuantiBrani = QuantiBrani;
        this.stato = stato;
    }

    public Playlist ( Playlist playlist) {
        this.nome = playlist.nome;
        this.QuantiBrani = playlist.QuantiBrani;
        this.stato = playlist.stato;
    }

    public String getnome(){
        return nome;
    }

    public int getQuantiBrani(){
        return QuantiBrani;
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

        if (stato.equals("STOP")){
            this.stato = "STOP";
            branoCorrente = 1;
        }
        else {
            this.stato = "STOP";
        }
        return this.stato;
    }

    public int branoSuccessivo() {
        if (!stato.equals("STOP")) {
            if (branoCorrente == QuantiBrani) {
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
                branoCorrente = QuantiBrani;
            } else {
                branoCorrente--;
            }
        }
        return branoCorrente;
    }

    public String toString(){
        return ("Playlist: " + nome + "," + QuantiBrani + " brani in " + stato + " sul brano " + branoCorrente);
    }

}

