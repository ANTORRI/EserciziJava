public class Canzone {

    private String artista;
    private String nome_brano;
    private Duration durata;

    public Canzone(String nome_brano, Duration durata,  String artista) {
        this.nome_brano = nome_brano;
        this.durata = durata;
        this.artista = artista;
    }

    public String getNome_brano() {
        return nome_brano;
    }

    public Duration getDurata() {
        return durata;
    }

    public String getArtista() {
        return artista;
    }

    @Override
    public String toString() {
        return "Titolo: " + nome_brano + "\n Durata " + durata.toString() + "\n Artista: " + artista;
    }

}
