package dlugoscmiesiaca;

import java.util.Scanner;
import static dlugoscmiesiaca.DlugoscMiesiaca.dlugMiesiaca;

public class DlugoscMiesiacaMain {

    public static void main(String[] args)  {


        int rok;
        int miesiac;

        Scanner scanner = new Scanner(System.in);


        try {

            do {
                System.out.print("Wprowadź rok (powyżej 1582): ");
                rok = scanner.nextInt();
                System.out.print("Wprowadź miesiąc: ");
                miesiac = scanner.nextInt();

                    if ((rok <= 1582) || (miesiac < 1) || (miesiac > 12))    {
                        System.out.println("\nNieprawidłowa wartość roku lub miesiąca! Spróbuj jeszcze raz.");
                    }
                    else {
                        dlugMiesiaca(rok, miesiac);
                        break;
                    }

            } while ((rok <= 1582) || (miesiac < 1) || (miesiac > 12));
        }
        catch (Exception e) {
            System.out.println("Wystąpił błąd: " + e.toString());
        }

    }

}
