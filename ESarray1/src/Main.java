
import java.util.Scanner;

public static void main(String[] args) {
    int n = 0;
    int contaPari=0;
    int contaDispari=0;
    int a = 0;

    Scanner scanner = new Scanner(System.in);
    System.out.println("quanti elementi vuoi inserire?");
    int dimensione = scanner.nextInt();

    if (dimensione < 1 || dimensione > 10) {
        dimensione = 10;
    }

    int [] base = new int [dimensione];

    for (int i = 0; i < dimensione; i++) {

        base[i] = scanner.nextInt();

        if (base[i] % 2 == 0) {
            contaPari++;
        }

        else {
            contaDispari++;
        }

    }

    int [] pari = new int [contaPari];
    int [] dispari = new int [contaDispari];


    for(int i = 0; i < dimensione; i++){
        if (base[i] % 2 == 0) {
            pari[a] = base[i];
            a++;
        }
    }

    a = 0;

    for(int i = 0; i < dimensione; i++){
        if (base[i] % 2 != 0) {
            dispari[a] = base[i];
            a++;
        }
    }


    for (int i = 0; i < dimensione; i++) {
        System.out.println(base[i]);
    }

    System.out.println("il numero degli elementi pari presenti e':" + pari.length + ", elenco: ");
    for (int i = 0; i < contaPari; i++) {
        System.out.println(pari[i]);
    }


    System.out.println("il numero degli elementi dispari presenti e':" + dispari.length + ", elenco: ");
    for (int i = 0; i < contaDispari; i++) {
        System.out.println(dispari[i]);
    }

    scanner.close();

}
