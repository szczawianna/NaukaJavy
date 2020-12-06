package kalendarz;

import java.util.Scanner;
import static kalendarz.Patron.patron;

public class KalendarzChinski {

    public static void main(String[] args)  {

        int in;

        Scanner sc = new Scanner(System.in);

        try {
            do {
                System.out.print("Wprowadz rok większy lub równy 1582: ");
                in = sc.nextInt();
            } while (!(in > 1582));


            patron(in);

        }
        catch (Exception e) {
            System.err.println("Wystąpił błąd: " + e.toString());
        }


    }


}
