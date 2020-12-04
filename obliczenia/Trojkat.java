package obliczenia;

import static java.lang.Math.pow;

public class Trojkat {

    public static boolean warunek(double x, double y, double z) {
        boolean trojkat;

        if ((x + y > z) && (x + z > y) && (y + z > x))  {
            trojkat = true;
        }
        else {
            trojkat = false;
        }

        return trojkat;
    }

    public static void oznaczRodzajTrojkata(double x, double y, double z)  {

        double x2 = pow(x, 2);
        double y2 = pow(y, 2);
        double z2 = pow(z, 2);

        RodzajTrojkata rodzaj = RodzajTrojkata.RK;

        if (x2 + y2 > z2) {
            //rodzaj = RodzajTrojkata.valueOf("OK");
            rodzaj = RodzajTrojkata.OK;
        } else if (x2 + y2 == z2) {
            rodzaj = RodzajTrojkata.PK;
        } else if (x2 + y2 < z2) {
            rodzaj = RodzajTrojkata.RK;
        } else System.err.println("Nieoczekiwana wartość!");

        rodzaj.pokazOpis();

    }


}
