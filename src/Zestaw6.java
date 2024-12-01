public class Zestaw6 {
    public static void main(String[] args) {
        Produkt samochod = new Produkt("BMW", 40000, 20);
        Produkt opony = new Produkt("Pirelli", 2000, 1000);

        System.out.println("Informacje o produkcie");
        samochod.wyswietlInformacje();

        samochod.dodajDoMagazynu(5);
        samochod.wyswietlInformacje();

        samochod.usunZMagazynu(2);
        samochod.wyswietlInformacje();

        samochod.iloscNaMagazynie = 100;
        samochod.wyswietlInformacje();

        KoszykZakupowy koszyk = new KoszykZakupowy();

        koszyk.dodajProdukt(samochod, 1);
        koszyk.dodajProdukt(opony, 4);

        koszyk.wyswietlZawartoscKoszyka();

        System.out.println("Wartosc koszyka" + koszyk.obliczCalkowitaWartosc() + "PLN");

        samochod.wyswietlInformacje();
        opony.wyswietlInformacje();




    }
}