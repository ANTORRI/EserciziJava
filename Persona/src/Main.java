

void main() {

    Persona r = new Persona("Angelo", "Fantozzi", 586955126, "marron", "azzurri");
    Persona p = new Persona (r, "giovanna", 454864515);

    System.out.println(p.getNome());
    System.out.println(p.getCapelli());


}
