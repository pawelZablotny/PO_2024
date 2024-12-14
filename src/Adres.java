public class Adres {

    @Override
    public String toString() {
        return kodPocztowy + " " + miasto + "\n" + ulica + " " + numerDomu + (numerMieszkania != null ? "/" + numerMieszkania : "");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Adres adres = (Adres) obj;
        return numerDomu == adres.numerDomu && (numerMieszkania == null ? adres.numerMieszkania == null :
        numerMieszkania.equals(adres.numerMieszkania)) && ulica.equals(adres.ulica) && miasto.equals(adres.miasto) && kodPocztowy.equals(adres.kodPocztowy);
    }



    public String ulica;
    public int numerDomu;
    public Integer numerMieszkania; // Opcjonalne
    public String miasto;
    public String kodPocztowy;

    public Adres(String ulica, int numerDomu, String miasto, String kodPocztowy) {
        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.numerMieszkania = null;
        this.miasto = miasto;
        this.kodPocztowy = kodPocztowy;
    }

    public Adres(String ulica, int numerDomu, int numerMieszkania, String miasto, String kodPocztowy) {
        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.numerMieszkania = numerMieszkania;
        this.miasto = miasto;
        this.kodPocztowy = kodPocztowy;
    }

    public void pokaz() {
        System.out.println(kodPocztowy + " " + miasto);
        System.out.println(ulica + " " + numerDomu + (numerMieszkania != null ? "/" + numerMieszkania : ""));
    }

    public boolean przed(Adres innyAdres) {
        return this.kodPocztowy.compareTo(innyAdres.kodPocztowy) < 0;
    }
}
