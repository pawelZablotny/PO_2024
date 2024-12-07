public class Platnosc {
    public double kwota;
    public String statusPlatnosci;

    public Platnosc(double kwota) {
        this.kwota = kwota;
        this.statusPlatnosci = "Nieopłacone";
    }

    public void zaplac() {
        this.statusPlatnosci = "Opłacone";
        System.out.println("Płatność została zrealizowana. Kwota: " + kwota + " PLN");
    }
}
