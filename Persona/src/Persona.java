public class Persona {
    private String nome;
    private String cognome;
    private int numTel;
    private double km;
    private String occhi;
    private String capelli;

    public Persona(String nome, String cognome, int numTel, String occhi, String capelli) {
        this.nome = nome;
        this.cognome = cognome;
        this.numTel = numTel;
        this.km = 0;
        this.occhi = occhi;
        this.capelli = capelli;
    }

    public void corre(){
        this.km = 45;
    }

    public Persona (Persona Gemello, String nome, int numTel){
        this.nome = nome;
        this.cognome = Gemello.cognome;
        this.numTel = numTel;
        this.occhi = Gemello.occhi;
        this.capelli = Gemello.capelli;
        this.km = 0;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getNumTel() {
        return numTel;
    }

    public void setNumTel(int numTel) {
        this.numTel = numTel;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;

    }
    public String getOcchi() {
        return occhi;
    }

    public String getCapelli() {
        return capelli;
    }


}
