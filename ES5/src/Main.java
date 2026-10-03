import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Playlist c = new Playlist("abubu", 10, "PLAY");
        boolean continua = true;

        System.out.println();
        System.out.println("1 Nome Playlist");
        System.out.println("2 Quantità brani");
        System.out.println("3 Brano attuale");
        System.out.println("4 Attiva");
        System.out.println("5 In pausa");
        System.out.println("6 Spegni");
        System.out.println("7 Avanti");
        System.out.println("8 Indietro");

        while (continua) {


            System.out.println("Scegli: ");
            int scelta = input.nextInt();

            if (scelta == 1) {
                System.out.println("Nome: " + c.getnome());
                System.out.println(c);
            }

            else if (scelta == 2) {
                System.out.println("Quantità brani: " + c.getQuantiBrani());
                System.out.println(c);
            }

            else if (scelta == 3) {
                System.out.println("Brano attuale: " + c.getbranoCorrente());
                System.out.println(c);
            }

            else if (scelta == 4) {
                System.out.println("Stato: " + c.play(""));
                System.out.println(c);
            }

            else if (scelta == 5) {
                System.out.println("Stato: " + c.pause(""));
                System.out.println(c);
            }

            else if (scelta == 6) {
                System.out.println("Stato: " + c.stop(""));
                System.out.println(c);
            }

            else if (scelta == 7) {
                System.out.println("Brano: " + c.branoSuccessivo());
                System.out.println(c);
            }

            else if (scelta == 8) {
                System.out.println("Brano: " + c.branoPrecedente());
                System.out.println(c);
            }

            else if (scelta == 0) {
                continua = false;
                System.out.println("Arrivederci!");

            }

            else {
                System.out.println("Scelta non valida, riprova.");
            }
        }

        System.out.println(c);

    }
}
//NON RIUSCIVO A FARE COMMIT