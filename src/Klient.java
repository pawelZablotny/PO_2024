import java.util.ArrayList;
import java.util.List;

public class Klient extends Osoba {
    private Adres adres;
    private List<Zamowienie> listaZamowien;

    public Klient(String imie, String nazwisko, Adres adres) {
        super(imie, nazwisko); // Wywołanie konstruktora klasy nadrzędnej
        if (adres == null) {
            throw new IllegalArgumentException("Adres nie może być null.");
        }
        this.adres = adres;
        this.listaZamowien = new ArrayList<>();
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        if (adres == null) {
            throw new IllegalArgumentException("Adres nie może być null.");
        }
        this.adres = adres;
    }

    public List<Zamowienie> getListaZamowien() {
        return listaZamowien;
    }

    public void dodajZamowienie(Zamowienie zamowienie) {
        if (zamowienie == null) {
            throw new IllegalArgumentException("Zamówienie nie może być null.");
        }
        listaZamowien.add(zamowienie);
        System.out.println("Dodano zamówienie do klienta: " + getImie() + " " + getNazwisko());
    }

    public void wyswietlHistorieZamowien() {
        System.out.println("=== Historia zamówień klienta: " + getImie() + " " + getNazwisko() + " ===");
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

    @Override
    public String toString() {
        return super.toString() + "\nAdres:\n" + adres + "\nLiczba zamówień: " + listaZamowien.size();
    }
}
