import java.util.ArrayList;
import java.util.List;

public class Klient {

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (imie == null ? 0 : imie.hashCode());
        result = 31 * result + (nazwisko == null ? 0 : nazwisko.hashCode());
        result = 31 * result + (adres == null ? 0: adres.hashCode());
        return result;
    }
    public String imie;
    public String nazwisko;
    public Adres adres;
    public List<Zamowienie> listaZamowien;

    public Klient(String imie, String nazwisko, Adres adres) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;
        this.listaZamowien = new ArrayList<>();
    }

    public void dodajZamowienie(Zamowienie zamowienie) {
        listaZamowien.add(zamowienie);
        System.out.println("Dodano zamówienie do klienta: " + imie + " " + nazwisko);
    }

    public void wyswietlHistorieZamowien() {
        System.out.println("=== Historia zamówień klienta: " + imie + " " + nazwisko + " ===");
        if (listaZamowien.isEmpty()) {
            System.out.println("Brak zamówień.");
        } else {
            for (int i = 0; i < listaZamowien.size(); i++) {
                System.out.println("Zamówienie " + (i + 1) + ":");
                listaZamowien.get(i).wyswietlZamowienie();
                System.out.println();
            }
        }
    }

    public double obliczLacznyKosztZamowien() {
        double suma = 0;
        for (Zamowienie zamowienie : listaZamowien) {
            suma += zamowienie.koszykZakupowy.obliczCalkowitaWartosc();
        }
        return suma;
    }
}
