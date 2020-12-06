package kalendarz;

public enum Znaki {

    MALPA("małpa"),
    KOGUT("kogut"),
    PIES("pies"),
    SWINIA("świnia"),
    SZCZUR("szczur"),
    BAWOL("bawół"),
    TYGRYS("tygrys"),
    KROLIK("królik"),
    SMOK("smok"),
    WAZ("wąż"),
    KON("koń"),
    BARAN("baran");

    private final String opis;

    Znaki(String opis)  {
        this.opis = opis;
    }

    public void pokazOpis() {
        System.out.println("Znak zodiaku: " + this.opis);
    }

}
