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


        Adres adres12 = new Adres ("Słoneczna", 21, 2, "Olsztyn", "00-001");
        Adres adres22 = new Adres ("Słoneczna", 21, 2, "Olsztyn", "00-001");
        System.out.println("Czy adresy sa sobie rowne?\n" + adres12.equals(adres22));


        System.out.println("Produkt: " + samochod.getNazwa() + ", Cena: " + samochod.getCena() + ", Ilość: " + samochod.getIloscNaMagazynie());
        samochod.setIloscNaMagazynie(15);
        System.out.println("Zaktualizowana ilość: " + samochod.getIloscNaMagazynie());

        System.out.println();
        System.out.println();

        System.out.println("+++++++++++++ ZESTAW 8 +++++++++++");
        System.out.println();

        Adres adres1 = new Adres("Główna", 15, "Warszawa", "00-001");
        Klient klient1 = new Klient("Jan", "Kowalski", adres1);

        System.out.println(klient1);
        System.out.println();

        Adres adres2 = new Adres("Poboczna", 10, 5, "Kraków", "30-002");
        klient1.setAdres(adres2);

        System.out.println("Zaktualizowany adres klienta:");
        System.out.println(klient1);

        System.out.println();
        System.out.println("+++++++++++++ ZESTAW 8 Zadanie 3 +++++++++++");
        System.out.println();

        Adres adres001 = new Adres("Żołnierska", 15, "Olsztyn", "10-005");
        KlientFirmowy klientFirmowy = new KlientFirmowy("Jan", "Kowalski", adres001, "1234567890", "987654321");



        Adres adres002 = new Adres("Słoneczna", 10, 5, "Olsztyn", "10-000");
        KlientIndywidualny klientIndywidualny = new KlientIndywidualny("Anna", "Nowak", adres002, "44051401359");

        System.out.println(klientFirmowy);
        System.out.println();
        System.out.println(klientIndywidualny);

        System.out.println();

        System.out.println("+++++++++++++ ZESTAW 8 Zadanie 6 +++++++++++");
        System.out.println();

        Owoc mango = new Mango();
        Warzywo awokado = new Awokado();

        System.out.println("Mango:");
        System.out.println("Smak: " + mango.smak());
        mango.umyj();
        mango.zjedz();

        System.out.println("\nAwokado:");
        System.out.println("Smak: " + awokado.smak());
        awokado.umyj();
        awokado.zjedz();

    }
}
