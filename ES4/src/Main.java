import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Playlist c = new Playlist("abubu", 10, "PLAY");

        System.out.println();
        System.out.println("1 Nome Playlist");
        System.out.println("2 Quantità brani");
        System.out.println("3 Attiva");
        System.out.println("4 In pausa");
        System.out.println("5 Spegni");
        System.out.println("6 Avanti");
        System.out.println("7 Indietro");

        System.out.println("Scegli: ");
        int scelta = input.nextInt();
        if (scelta == 1){
            System.out.println("Nome: " + c.getnome());

        }
        if(scelta == 2){
            System.out.println("Quantità brani: " + c.getQuantiBrani());
        }

        if(scelta == 3){
             System.out.println("Stato: " + c.play(""));
         }

        if(scelta == 4){
            System.out.println("Stato: " + c.pause(""));
        }

        if(scelta == 5){
            System.out.println("Stato: " + c.stop(""));
        }

        if(scelta == 6){
            System.out.println("Brano: " + c.branoSuccessivo());
        }

        if(scelta == 7){
            System.out.println("Brano: " + c.branoPrecedente());
        }

        System.out.println(c);

    }
}
//NON RIUSCIVO A FARE COMMIT