public class Vettore {
    private Punto origine;
    private Punto vertice;

    public Vettore (Punto origine, Punto vertice){
        this.origine = origine;
        this.vertice = vertice;
    }

    public Punto getOrigine() {
        return origine;
    }

    public Punto getVertice() {
        return vertice;
    }


    public double calcolaLunghezza(){
        double dx = vertice.getX() - origine.getX();
        double dy = vertice.getY() - origine.getY();

        return Math.sqrt( Math.pow(dx, 2) + Math.pow(dy, 2));
    }

    public Vettore spostaOrigine(Punto p){
        double dy = this.vertice.getX() - this.origine.getY();
        double dx = this.vertice.getY() - this.origine.getX();

        Punto vertNuovo = new Punto(p.getX() + dx, p.getY() + dy);

        return new Vettore(p, vertNuovo);
    }

    public boolean verificaOrigine(Punto p){
        return this.origine.equals(p);
    }

    @Override
    public String toString(){
        return ("Origine:" + origine + "\n Vertice:" + vertice);
    }

}
