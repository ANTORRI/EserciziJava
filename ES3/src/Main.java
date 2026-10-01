public static void main(String[] args) {

    Contocorrente conto = new Contocorrente("Mario", "Rossi", "HJSAD562NJKAS");
    conto.preleva(300);
    conto.deposita(800);

    System.out.println( conto.toString());
}
