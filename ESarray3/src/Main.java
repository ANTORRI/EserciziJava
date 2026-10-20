
import java.util.Random;

public static void main(String[] args) {

    Random rand = new Random();

    int [] base = new int [10];
    int [] numeri = new int [10];

    for (int i = 0; i < 10; i++) {
        base[i] = rand.nextInt(100) +1;
    }


    for (int i = 0; i < 10; i++) {
        numeri[i] = i;
    }

    for (int i = 0; i < 10; i++) {
        if (base[i] / 2 != 0) {
            System.out.print(numeri[i] + "  ");
        }
        else{
            System.out.print(numeri[i] + " ");
        }
    }

    System.out.println();
    for (int i = 0; i < 10; i++) {
        System.out.print(base[i] + " ");
    }

}
