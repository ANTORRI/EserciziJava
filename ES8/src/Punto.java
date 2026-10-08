public class Punto {
    private double x = 0;
    private double y = 0;

    public Punto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Punto( Punto punto) {
        this.x = punto.x;
        this.y = punto.y;
    }

    public double distanza(Punto punto) {
        return Math.sqrt(Math.pow(punto.x - this.x, 2) + Math.pow(punto.y - this.y, 2));
    }

    public Punto puntoMedio(Punto punto) {
        double d1 = (punto.x + this.x) / 2;
        double d2 = (punto.y + this.y) / 2;
        return new Punto(d1, d2);
    }

}
//sasa
