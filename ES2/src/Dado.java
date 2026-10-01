public class Dado {
    private int nFacce;

    public Dado() {
        nFacce = 6;
    }

    public Dado(int nFacce) {
        this.nFacce = nFacce;

        if(nFacce <= 3){
            this.nFacce = 6;
        }

    }

    public Dado (Dado dado){

        this.nFacce = dado.nFacce;


    }

    public int lancia(){
        return (int)(Math.random() * nFacce) + 1;
    }

    @Override
    public String toString() {
        return "Il dado ha " + nFacce + " facce";
    }
}
