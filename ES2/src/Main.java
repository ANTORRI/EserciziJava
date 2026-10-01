public static void main(String[] args) {

    Dado dado1 = new Dado();

    Dado dado2 = new Dado(3);

    Dado dado3 = new Dado(dado1);

    System.out.println( "valore del lancio del dado " + dado2.lancia());

    System.out.println (dado1.toString());
}
