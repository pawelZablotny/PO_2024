import java.util.ArrayList;
import java.util.List;

public class Klient {
    public String imie;
    public String nazwisko;
    public List<Zamowienie> listaZamowien;

    public Klient(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
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
