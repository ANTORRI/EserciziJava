import java.util.Scanner;
import java.util.Random;

public static void main(String[] args) {
    int a = 0;
    int b = 0;


    Scanner scanner = new Scanner(System.in);
    Random rand = new Random();

    System.out.println("decidi due numeri (abbi del buonsenso): ");
    a = scanner.nextInt();
    b = scanner.nextInt();

    int m = (a+b)/2;

    int [] base = new int [10];

    for (int i = 0; i < 10; i++) {

        base[i] = rand.nextInt(b - a + 1) + a;
    }

    for (int i = 0; i < 10; i++) {
        System.out.println(base[i]);
    }

    System.out.println("compreso tra a e m: ");
    for (int i = 0; i < 10; i++) {

        if (base[i] >= a && base[i] <= m) {
            System.out.println(base[i]);
        }

    }


    System.out.println("compreso tra m+1 e b: ");
    for (int i = 0; i < 10; i++) {

        if (base[i] >= m+1 && base[i] <= b) {
            System.out.println(base[i]);
        }

    }



    scanner.close();

}
