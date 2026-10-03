

public class Playlist {
    private String nome;
    private int getQuantiBrani;
    private String stato = "STOP";

    public Playlist(String nome, int getQuantiBrani, String stato) {
        this.nome = nome;
        this.getQuantiBrani = getQuantiBrani;
        this.stato = stato;
    }

    public String getnome(){
        return nome;
    }

    public int getQuantiBrani(){
        return getQuantiBrani;
    }

    public String play(String stato){

        if(!stato.equals("PLAY")){
            stato = "PLAY";
        }

        return stato;
    }

    public String pause(String stato){

        if(!stato.equals("STOP")){
            stato = "STOP";
        }
        else{
            stato= "PAUSA";
        }

        return stato;
    }

    public String stop(String stato){
            stato = "STOP";
        return stato;
    }


}


