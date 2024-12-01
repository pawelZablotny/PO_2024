public class Produkt {

    public String nazwa;
    public double  cena;
    public int iloscNaMagazynie;

    public Produkt(String nazwa, double cena, int iloscNaMagazynie){
        this.nazwa = nazwa;
        this.cena = cena;
        this.iloscNaMagazynie = iloscNaMagazynie;
    }

    public void wyswietlInformacje(){
        System.out.println("Nazwa: " + nazwa);
        System.out.println("Cena: " + cena);
        System.out.println("Ilosc na Magazynie: " + iloscNaMagazynie);
    }
    public void dodajDoMagazynu(int ilosc){
        if (ilosc > 0){
            iloscNaMagazynie += ilosc;
            System.out.println("Dodano do magazynu: " + ilosc);
        }else {
            System.out.println("Nie mozna dodac ilosc mniejszej niz 1.");
        }
    }
    public void usunZMagazynu(int ilosc){
        if(ilosc < 0 && ilosc <= iloscNaMagazynie){
            iloscNaMagazynie -= ilosc;
            System.out.println("Usunieto z magazynu: " + ilosc);

        }else {
            System.out.println("Brak wystarczajacej ilosci towaru");
        }

    }
}
