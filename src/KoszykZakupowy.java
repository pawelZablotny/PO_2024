import java.util.ArrayList;
import java.util.List;

public class KoszykZakupowy {
    public List<Produkt> produkty;
    public KoszykZakupowy() {
        produkty = new ArrayList<>();
    }

    public void dodajProdukt(Produkt produkt, int ilosc) {
        if(produkt.iloscNaMagazynie >= ilosc){
            Produkt produktWKoszuku = new Produkt(produkt.nazwa, produkt.cena, ilosc);
            produkty.add(produktWKoszuku);
            produkt.iloscNaMagazynie -= ilosc;
            System.out.println("Dodano do koszyka: " + produkt.nazwa + " (ilosc):" + ilosc + ")");
        }else{
            System.out.println("Nie ma wystarczajacej ilosci" + produkt.nazwa + "na magazynie");
        }

    }

    public void wyswietlZawartoscKoszyka(){
        System.out.println("Zawartosc koszyka");
        if (produkty.isEmpty()){
            System.out.println("Koszyk jest pusty");

        }else{
            for (Produkt produkt : produkty){
                System.out.println("- " + produkt.nazwa + " | Cena: " + produkt.cena + " | Ilosc: " + produkt.iloscNaMagazynie);
            }
        }
    }

    public double obliczCalkowitaWartosc(){
        double suma = 0;
        for (Produkt produkt : produkty){
            suma += produkt.cena * produkt.iloscNaMagazynie;
        }
        return suma;
    }
}
