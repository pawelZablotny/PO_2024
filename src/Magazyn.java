import java.util.HashMap;
import java.util.Map;

public class Magazyn {
    public Map<Produkt, Integer> produkty;

    public Magazyn() {
        this.produkty = new HashMap<>();
    }

    public void dodajProdukt(Produkt produkt, int ilosc) {
        if (ilosc > 0) {
            produkty.put(produkt, produkty.getOrDefault(produkt, 0) + ilosc);
            System.out.println("Dodano do magazynu: " + produkt.nazwa + " (ilość: " + ilosc + ")");
        } else {
            System.out.println("Ilość musi być większa niż zero.");
        }
    }

    public void usunProdukt(Produkt produkt, int ilosc) {
        if (produkty.containsKey(produkt) && produkty.get(produkt) >= ilosc) {
            produkty.put(produkt, produkty.get(produkt) - ilosc);
            if (produkty.get(produkt) == 0) {
                produkty.remove(produkt);
            }
            System.out.println("Usunięto z magazynu: " + produkt.nazwa + " (ilość: " + ilosc + ")");
        } else {
            System.out.println("Nie można usunąć podanej ilości produktu: " + produkt.nazwa);
        }
    }

    public void wyswietlAsortyment() {
        System.out.println("=== Asortyment magazynu ===");
        if (produkty.isEmpty()) {
            System.out.println("Magazyn jest pusty.");
        } else {
            for (Map.Entry<Produkt, Integer> entry : produkty.entrySet()) {
                System.out.println(entry.getKey().nazwa + " | Ilość: " + entry.getValue());
            }
        }
    }

    public Map<Produkt, Integer> getProdukty() {
        return produkty;
    }
}
