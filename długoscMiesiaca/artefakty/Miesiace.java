package artefakty;

public enum Miesiace {

    STYCZEN("stycznia", 1),
    LUTY("lutego", 2),
    MARZEC("marca", 3),
    KWIECIEN("kwietnia", 4),
    MAJ("maja", 5),
    CZERWIEC("czerwca", 6),
    LIPIEC("lipca", 7),
    SIERPIEN("sierpnia", 8),
    WRZESIEN("września", 9),
    PAZDZIERNIK("października", 10),
    LISTOPAD("listopada", 11),
    GRUDZIEN("grudnia",12);

    private String opis = "";
    private int nr = 0;

    Miesiace(String opis, int nr)   {
        this.opis = opis;
        this.nr = nr;
    }

    public String getOpis() {
        return opis;
    }

    public int getNr(int miesiac) {
        return nr = miesiac;
    }

    public void podajMiesiac()  {
        System.out.print("\tDługość " + opis);
    }

}
