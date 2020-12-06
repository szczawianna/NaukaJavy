package dlugoscmiesiaca;

public class DlugoscMiesiaca {

    public static void dlugMiesiaca(int rok, int miesiac)   {

        int dlugosc = sprawdzMiesiac(rok, miesiac);


        System.out.println(String.format("Długość " + podajNazweMiesiaca(miesiac) + " wynosi " + dlugosc + " dni."));
    }

    private static int sprawdzMiesiac(int r, int m)    {

        final int d1 = 31;
        final int d0 = 30;
        final int lp = 29;
        final int ln = 28;

        int dlugosc = 0;

        switch (m)  {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dlugosc = d1;
                break;
            case 2:
                if (sprawdzPrzestepnosc(r) == true) dlugosc = lp;
                else dlugosc = ln;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dlugosc = d0;
                break;
        }

        return dlugosc;

    }

    // dla lutego
    private static boolean sprawdzPrzestepnosc(int r)    {

        boolean flaga;

        if ((r % 4 == 0) && (r % 100 != 0)) {
            flaga = true;
        }
        else if ((r % 400 == 0))  {
            flaga = true;
        } else  {
            flaga = false;
        }

        return flaga;
    }

    private static String podajNazweMiesiaca(int m) {
        String[] mscArr= {"stycznia", "lutego", "marca", "kwietnia", "maja", "czerwca", "lipca",
                "sierpnia", "września", "października", "listopada", "grudnia"};

        return mscArr[m-1];
    }

}
