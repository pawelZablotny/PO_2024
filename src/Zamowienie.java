public class Zamowienie {


    @Override
    public String toString() {
        return "Zamowienie: \n" + "Status: " + statusZamowienia + "\n" + "Koszyk: \n"  + "\n" + "Platność: " + platnosc.toString();
    }

    public KoszykZakupowy koszykZakupowy;
    public String statusZamowienia;
    public Platnosc platnosc;

    public Zamowienie(KoszykZakupowy koszykZakupowy, String statusZamowienia) {
        this.koszykZakupowy = koszykZakupowy;
        this.statusZamowienia = statusZamowienia;
        this.platnosc = new Platnosc(koszykZakupowy.obliczCalkowitaWartosc());
    }

    public void ustawStatusZamowienia(String nowyStatus) {
        this.statusZamowienia = nowyStatus;
        System.out.println("Status zamówienia został zmieniony na: " + nowyStatus);
    }

    public void wyswietlZamowienie() {
        System.out.println("=== Zamówienie ===");
        System.out.println("Status zamówienia: " + statusZamowienia);
        System.out.println("Status płatności: " + platnosc.statusPlatnosci);
        koszykZakupowy.wyswietlZawartoscKoszyka();
    }

    public void finalizujZamowienie() {
        if (platnosc.statusPlatnosci.equals("Opłacone")) {
            ustawStatusZamowienia("Gotowe do wysyłki");
            System.out.println("Zamówienie zostało zrealizowane i jest gotowe do wysyłki.");
        } else {
            System.out.println("Zamówienie nie może zostać zrealizowane. Płatność nie została zrealizowana.");
        }
    }

    public void zwrocProdukt(String nazwaProduktu, int ilosc) {
        for (Produkt produkt : koszykZakupowy.produkty) {
            if (produkt.nazwa.equalsIgnoreCase(nazwaProduktu) && ilosc <= produkt.iloscNaMagazynie) {
                produkt.iloscNaMagazynie -= ilosc;
                koszykZakupowy.produkty.remove(produkt);
                platnosc.kwota -= produkt.cena * ilosc;
                System.out.println("Zwrócono produkt: " + nazwaProduktu + " (ilość: " + ilosc + ")");
                return;
            }
        }
        System.out.println("Nie można zwrócić produktu: " + nazwaProduktu);
    }
}
