package kalendarz;

public class Patron {


    public static void patron(int rok)   {

        int r = rok;

        wybierzPatrona(r);

    }

    private static void wybierzPatrona(int r) {

        final int m = 12;
        int out = r % m;

        Znaki znak = Znaki.MALPA;

        switch (out) {
            case 0:
                znak = Znaki.MALPA;
                break;
            case 1:
                znak = Znaki.KOGUT;
                break;
            case 2:
                znak = Znaki.PIES;
                break;
            case 3:
                znak = Znaki.SWINIA;
                break;
            case 4:
                znak = Znaki.SZCZUR;
                break;
            case 5:
                znak = Znaki.BAWOL;
                break;
            case 6:
                znak = Znaki.TYGRYS;
                break;
            case 7:
                znak = Znaki.KROLIK;
                break;
            case 8:
                znak = Znaki.SMOK;
                break;
            case 9:
                znak = Znaki.WAZ;
                break;
            case 10:
                znak = Znaki.KON;
                break;
            case 11:
                znak = Znaki.BARAN;
                break;
            default:
                System.err.println("Nie udało się znaleźć wartości");

        }

        znak.pokazOpis();

    }

}
