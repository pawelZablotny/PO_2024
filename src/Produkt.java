public class Produkt {

    @Override
    public String toString() {
        return "Produkt: " + nazwa + ", Cena: " + cena + ", Ilość na magazynie: " + iloscNaMagazynie;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Produkt produkt = (Produkt) obj;
        return Double.compare(produkt.cena, cena) == 0 && nazwa.equals(produkt.nazwa);
    }

    public String getNazwa() {
        return nazwa;
    }

    public double getCena() {
        return cena;
    }

    public int getIloscNaMagazynie() {
        return iloscNaMagazynie;
    }

    public void setIloscNaMagazynie(int iloscNaMagazynie) {
        this.iloscNaMagazynie = iloscNaMagazynie;
    }

    public int hashCode(){
        int result = 17;
        result = 31 * result + (nazwa == null ? 0 : nazwa.hashCode());
        long cenaBits = Double.doubleToLongBits(cena);
        result = 31 * result + (int) (cenaBits ^ (cenaBits >>> 32));
        return result;
    }

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
