public class Incrocio {

    private Semaforo nord;
    private Semaforo sud;
    private Semaforo ovest;
    private Semaforo est;
    private boolean isAcceso;

    public Incrocio() {
        this.nord = new Semaforo();
        this.sud = new Semaforo();
        this.ovest = new Semaforo();
        this.est = new Semaforo();
        this.isAcceso = false;
    }

    public void accendi(){
        this.nord.accendi();
        this.sud.accendi();
        this.ovest.accendi();
        this.est.accendi();

        this.nord.avanza();
        this.nord.avanza();
        this.sud.avanza();
        this.sud.avanza();
        this.isAcceso = true;
    }

    public void spegni(){
        this.nord.spegni();
        this.sud.spegni();
        this.ovest.spegni();
        this.est.spegni();
        this.isAcceso = false;
    }

    public void avanza (char c){

        if(c == 'n'){
            if(!this.est.isAcceso() || !this.ovest.isAcceso()){
                this.nord.accendi();
            }
        }

        if(c == 's'){
            if(!this.est.isAcceso() || !this.ovest.isAcceso()){
                this.sud.accendi();
            }
        }

        if(c == 'o'){
            if(!this.nord.isAcceso() || !this.sud.isAcceso()){
                this.ovest.accendi();
            }
        }

        if(c == 'e') {
            if (!this.nord.isAcceso() || !this.sud.isAcceso()) {
                this.est.accendi();
            }
        }
    }

    public boolean isAcceso(){
        return this.isAcceso;
    }

    public String getColore(char c) {

        if (c == 'n') {
            return this.nord.getColore();
        }

        else if (c == 's') {
            return this.sud.getColore();
        }

        else if (c == 'o') {
            return this.ovest.getColore();
        }

        else if (c == 'e') {
            return this.est.getColore();
        }

        else return ("");
    }

    public String toString(){
        String s = "";

        s += ("      |  N  | \n");
        s += ("      |     |\n");
        s += ("      | " + this.nord.getColore() + " |\n");
        s +=("-------      ------- \n");
        s +=("             " + this.ovest.getColore() + "\n" );
        s +=("E                   O \n");
        s +=("     " + this.est.getColore() + "\n");
        s +=("-------      ------- \n");
        s +=("      | " + this.sud.getColore() + " | \n");
        s +=("      |     | \n");
        s +=("      |  S  | \n");

        return s;
    }


}


