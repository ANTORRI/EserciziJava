import java.util.Scanner;

public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int [] base = new int [10];
    int conta = 0;

    for (int i = 0; i < 10; i++) {

        base[i] = scanner.nextInt();

        if(base[i] < 0){
            break;
        }

        conta++;
    }

    int [] baseInc = new int [conta];

    for (int i = 0; i < conta; i++) {
        baseInc[i] = base[conta-1-i];
    }

    for (int i = 0; i < conta; i++) {
        System.out.println(baseInc[i]);
    }

}
