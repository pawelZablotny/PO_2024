public class Zestaw6 {
    public static void main(String[] args) {
        Produkt samochod = new Produkt("BMW", 40000, 20);
        Produkt opony = new Produkt("Pirelli", 2000, 1000);

        System.out.println("=== Informacje o produktach ===");
        samochod.wyswietlInformacje();
        opony.wyswietlInformacje();

        System.out.println("\n=== Dodawanie do magazynu ===");
        samochod.dodajDoMagazynu(10);
        opony.dodajDoMagazynu(500);

        System.out.println("\n=== Usuwanie z magazynu ===");
        samochod.usunZMagazynu(5);
        opony.usunZMagazynu(300);

        Sklep sklep = new Sklep();
        sklep.dodajProdukt(samochod);
        sklep.dodajProdukt(opony);

        System.out.println("\n=== Oferta sklepu ===");
        sklep.wyswietlOferty();

        KoszykZakupowy koszyk = new KoszykZakupowy();

        System.out.println("\n=== Zakupy w sklepie ===");
        sklep.zakupy(koszyk, "BMW", 2);
        sklep.zakupy(koszyk, "Pirelli", 50);

        System.out.println("\n=== Zawartość koszyka ===");
        koszyk.wyswietlZawartoscKoszyka();

        Zamowienie zamowienie = new Zamowienie(koszyk, "W trakcie realizacji");
        System.out.println("\n=== Szczegóły zamówienia ===");
        zamowienie.wyswietlZamowienie();

        System.out.println("\n=== Realizacja płatności ===");
        zamowienie.platnosc.zaplac();

        System.out.println("\n=== Finalizacja zamówienia ===");
        zamowienie.finalizujZamowienie();

        System.out.println("\n=== Zwrot produktów ===");
        zamowienie.zwrocProdukt("Pirelli", 10);

        System.out.println("\n=== Szczegóły zamówienia po zwrocie ===");
        zamowienie.wyswietlZamowienie();

        Klient klient = new Klient("Jan", "Kowalski");
        klient.dodajZamowienie(zamowienie);

        System.out.println("\n=== Historia zamówień klienta ===");
        klient.wyswietlHistorieZamowien();

        System.out.println("\n=== Łączny koszt zamówień klienta ===");
        System.out.println("Łączny koszt: " + klient.obliczLacznyKosztZamowien() + " PLN");
    }
}
