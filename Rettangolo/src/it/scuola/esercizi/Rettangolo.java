package it.scuola.esercizi;

public class Rettangolo {
    private double x1;
    private double y1;
    private double x2;
    private double y2;

    public Rettangolo(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public double getBase(){
        double base;
        if(x2>x1){
            base = (x2 - x1);
            return base;
        }

        base = (x1 - x2);

        return base;
    }

    public double getAltezza(){
        double altezza;
        if(y2>y1){
            altezza = (y2 - y1);
            return altezza;
        }

        altezza = (y1 - y2);

        return altezza;
    }

    public double getArea(){
        double area;
        area = getBase() * getAltezza();

        return area;
    }


    public double getPerimetro(){
        double perimetro;
        perimetro = 2*(getBase()+getAltezza());

        return perimetro;
    }
}
