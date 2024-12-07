import java.util.ArrayList;
import java.util.List;

public class Sklep {
    public List<Produkt> produkty;

    public Sklep() {
        produkty = new ArrayList<>();
    }

    public void dodajProdukt(Produkt produkt) {
        produkty.add(produkt);
        System.out.println("Dodano produkt do oferty sklepu: " + produkt.nazwa);
    }

    public void wyswietlOferty() {
        System.out.println("=== Oferta sklepu ===");
        if (produkty.isEmpty()) {
            System.out.println("Brak produktów w ofercie.");
        } else {
            for (Produkt produkt : produkty) {
                System.out.println("- " + produkt.nazwa + " | Cena: " + produkt.cena + " PLN | Ilość: " + produkt.iloscNaMagazynie);
            }
        }
    }

    public Produkt wyszukajProdukt(String nazwa) {
        for (Produkt produkt : produkty) {
            if (produkt.nazwa.equalsIgnoreCase(nazwa)) {
                return produkt;
            }
        }
        System.out.println("Nie znaleziono produktu o nazwie: " + nazwa);
        return null;
    }

    public void zakupy(KoszykZakupowy koszyk, String nazwaProduktu, int ilosc) {
        Produkt produkt = wyszukajProdukt(nazwaProduktu);
        if (produkt != null && produkt.iloscNaMagazynie >= ilosc) {
            koszyk.dodajProdukt(produkt, ilosc);
        } else {
            System.out.println("Nie można dodać do koszyka: " + nazwaProduktu + " (niewystarczająca ilość lub brak produktu w ofercie).");
        }
    }
}
