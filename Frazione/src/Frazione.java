public class Frazione {
    private int num;
    private int den;

    public Frazione (){
        this.num = 0;
        this.den = 1;
    }

    public Frazione(int num, int den) {
        this.num = num;
        this.den = den;

        if (den == 0){
            den = 1;
        }

    }

    public Frazione (Frazione f){
        this.num = f.getNum();
        this.den = f.getDen();
    }

    public int getNum() {
        return num;
    }

    public int getDen() {
        return den;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void setDen(int den) {
        if (den != 0){
            this.den = den;
        }
    }

    public double toDouble(){
        return (double)num / den;
    }


}
