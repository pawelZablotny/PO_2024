public class Platnosc {

//    @Override
//    public String toString() {
//        return "Platnosc: " + kwota + ", Status: " + statusPlatnosci;
//    }

    public double kwota;
    public String statusPlatnosci;

    @Override
    public int hashCode() {
        int result = 17;
        long kwotaBits = Double.doubleToLongBits(kwota);
        result = 31 * result + (int) (kwotaBits ^ (kwotaBits >>> 32));
        result = 31 * result + (statusPlatnosci == null ? 0 : statusPlatnosci.hashCode());
        return result;

    }

    public Platnosc(double kwota) {
        this.kwota = kwota;
        this.statusPlatnosci = "Nieopłacone";
    }

    public void zaplac() {
        this.statusPlatnosci = "Opłacone";
        System.out.println("Płatność została zrealizowana. Kwota: " + kwota + " PLN");
    }
}
