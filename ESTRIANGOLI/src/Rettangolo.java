

public class Rettangolo {

    private Punto a;
    private Punto b;

    public Rettangolo(Punto a, Punto b){
        this.a = a;
        this.b = b;
    }
    public double getAltezza(){
        return Math.abs (this.a.getY() - this.b.getY());
    }

    public double getBase(){
        return Math.abs (this.a.getX() - this.b.getX());
    }

    public double getPerimetro(){
        return (this.getAltezza() + this.getBase())*2;
    }

    public double getArea(){
        return (this.getBase() * this.getAltezza());

    }

    public void sposta(double dX, double dY){
        a = new Punto(a.getX() + dX, a.getY() + dY );
        b = new Punto(b.getX() + dX, b.getY() + dY );

    }

    /*
    Ritorna le coordinate degli spigoli del rettangolo in questa forma
    (xa, ya) , (xb, yb)
     */
    @Override
    public String toString(){
          return "(" + this.a.getX() + " , " + this.a.getY() + "), (" + this.b.getX()  + ", " + this.b.getY() +  ")";
    }
}
