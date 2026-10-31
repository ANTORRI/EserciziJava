void main() {

    Frazione f = new Frazione();
    f.setDen(4);
    f.setNum(5);

    Frazione f1 = new Frazione(f);

    System.out.println(f1.getNum() + "/" + f1.getDen());
    System.out.println(f1);
    System.out.println(f);

    f1 = f;

    System.out.println(f1);
    System.out.println(f);

}
