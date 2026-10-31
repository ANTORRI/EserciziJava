import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Punto prova = new Punto();

        int scelta;
        System.out.println("inserisci i punti:");
        prova = in.nextInt();

        Vettore v1 = new Vettore();
        Vettore v2 = new Vettore();

        do {
            System.out.println("definire i vettori v1, v2" +
                    "\n2. coordinate punti cartesiani" +
                    "\n3. calcolarne le lunghezze " +
                    "\n4. spostare l’origine di un vettore " +
                    "\n5. verificare se i 2 vettori ");
            scelta = in.nextInt();
            switch (scelta){
                case 1:
                    v1=creaVettore();
                    v2=creaVettore();
                    break;

                case 2:
                    System.out.println(prova.toString());
                    break;

                case 3:
                    System.out.println();
                    break;

                case 4:
                    break;

                case 5:
                    break;
            }

        }while (scelta != 0);

    }
}

    }
}