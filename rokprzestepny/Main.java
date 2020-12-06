package rokprzestepny;

import java.util.Scanner;
import static rokprzestepny.RokPrzestepny.przestepny;

public class Main {

    public static void main(String[] args)  {

        int rok;

        Scanner sc = new Scanner(System.in);

        try {
            do {
                System.out.print("Wprowadź liczbę większą niż 1582: ");
                rok = sc.nextInt();

                if (rok <= 1582)    {
                    System.out.println("\nNieprawidłowa wartość! Spróbuj jeszcze raz.");
                }
                else {
                    przestepny(rok);
                    break;
                }
            } while ( (!(rok > 1582)) );
        } catch (Exception e) {
            System.err.println("Wystąpił błąd: " + e.toString());
        }

    }

}
