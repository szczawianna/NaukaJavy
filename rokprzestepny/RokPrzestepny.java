package rokprzestepny;

public class RokPrzestepny {

    public static void przestepny(int rok)  {

        if (sprawdzPrzestepnosc(rok)) System.out.println("\tRok " + rok + " jest przestępny.");
        else System.out.println("\tRok " + rok + " jest nieprzestępny.");

    }

    private static boolean sprawdzPrzestepnosc(int r)   {

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

}
