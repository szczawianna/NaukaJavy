package obliczenia;

import java.util.Scanner;

import static obliczenia.Trojkat.oznaczRodzajTrojkata;
import static obliczenia.Trojkat.warunek;

public class Main {

    public static void main(String[] args) {

        double a;
        double b;
        double c;

        Scanner scanner = new Scanner(System.in);


        try {
            System.out.println("Wprowadz trzy liczby wieksze od 0: ");
            System.out.print("a: ");
            a = scanner.nextDouble();

            System.out.print("b: ");
            b = scanner.nextDouble();

            System.out.print("c: ");
            c = scanner.nextDouble();

            boolean flag = warunek(a, b, c);

            if (flag) {
                oznaczRodzajTrojkata(a, b, c);
            } else {
                System.err.println("Długość boków jest nieprawidlowa!");
                if (a <= 0 || b <= 0 || c <= 0) {
                    System.err.println("Co najmniej jedna z liczb jest mniejsza lub równa zero!");
                }
            }

        } catch (IllegalArgumentException e) {
            System.err.println("Wystąpił błąd: " + e.toString());
        }


    }

}