public class Main {
    public static void main(String[] args) {
        Punto a = new Punto (2, 6);
        Punto b = new Punto (6, 12);
        Rettangolo s = new Rettangolo(a, b);

        System.out.println(s.getAltezza());
        System.out.println(s.getBase());

        System.out.println(s.getPerimetro());
        System.out.println(s.getArea());
        System.out.println(s);

        s.sposta(3, 18);

        System.out.println(s);
    }
}