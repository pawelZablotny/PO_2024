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

        Adres adres = new Adres ("Słoneczna", 21, "Olsztyn", "00-001");

        System.out.println("\n=== Realizacja płatności ===");
        zamowienie.platnosc.zaplac();

        System.out.println("\n=== Finalizacja zamówienia ===");
        zamowienie.finalizujZamowienie();

        System.out.println("\n=== Zwrot produktów ===");
        zamowienie.zwrocProdukt("Pirelli", 10);

        System.out.println("\n=== Szczegóły zamówienia po zwrocie ===");
        zamowienie.wyswietlZamowienie();

        Klient klient = new Klient("Jan", "Kowalski", adres);

        klient.dodajZamowienie(zamowienie);

        System.out.println("\n=== Historia zamówień klienta ===");
        klient.wyswietlHistorieZamowien();

        System.out.println("\n=== Łączny koszt zamówień klienta ===");
        System.out.println("Łączny koszt: " + klient.obliczLacznyKosztZamowien() + " PLN");

        System.out.println("\n=== Metoda tu string 7.3 ===");
        System.out.println();

        System.out.println(samochod.toString());
        System.out.println(zamowienie.toString());
        System.out.println(adres.toString());

        System.out.println("Zadanie 10");
        Produkt samochod1 = new Produkt("BMW", 40000, 20);
        Produkt samochod2 = new Produkt("Audi", 50000, 10);
        System.out.println("Czy BMW jest rowny Audi?\n" + samochod.equals(samochod2));
        System.out.println();


        Adres adres1 = new Adres ("Słoneczna", 21, 2, "Olsztyn", "00-001");
        Adres adres2 = new Adres ("Słoneczna", 21, 2, "Olsztyn", "00-001");
        System.out.println("Czy adresy sa sobie rowne?\n" + adres1.equals(adres2));


        System.out.println("Produkt: " + samochod.getNazwa() + ", Cena: " + samochod.getCena() + ", Ilość: " + samochod.getIloscNaMagazynie());
        samochod.setIloscNaMagazynie(15);
        System.out.println("Zaktualizowana ilość: " + samochod.getIloscNaMagazynie());


    }
}
