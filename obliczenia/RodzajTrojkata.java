package obliczenia;

public enum RodzajTrojkata {

    PK("prostokątny"),
    OK("ostrokątny"),
    RK("rozwartokątny");

    private String opis = "";

    private RodzajTrojkata(String opis) {
        this.opis = opis;
    }

    public void pokazOpis() {
        System.out.println("Trójkąt " + this.opis);
    }

}
