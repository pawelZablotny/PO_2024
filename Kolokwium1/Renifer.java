public class Renifer
{
    private String imie;
    private int predkosc;

    //    public boolean equals(Object obj) {
//        if (this == obj) return true;
//        if (obj == null || getClass() != obj.getClass()) return false;
//        Produkt produkt = (Produkt) obj;
//        return Double.compare(produkt.cena, cena) == 0 && nazwa.equals(produkt.nazwa);

    @Override
    public boolean equals(Object obj)
    {
        if(this==obj)
        {
            return true;
        }
        if(obj == null || getClass() != obj.getClass())
        {
            return false;
        }

        Renifer renifer = (Renifer) obj;
        if(predkosc != renifer.predkosc)
        {
            return false;
        }

        return imie.equals(renifer.imie);
    }
    @Override
    public String toString()
    {
        return "Renifer o imieniu: " + imie + "ma predkosc: " + predkosc;
    }

    @Override
    public int hashCode()
    {
        int result = imie.hashCode();
        result = 31 * result + predkosc;
        return result;
    }

    public Renifer(String imie, int predkosc)
    {
        this.imie = imie;
        this.predkosc = predkosc;
    }

    public String getImie()
    {
        return imie;
    }
    public int getPredkosc()
    {
        return predkosc;
    }

    public void setImie(String imie)
    {
        this.imie = imie;
    }

    public void setPredkosc(int predkosc)
    {
        if(predkosc >= 0)
        {
            this.predkosc = predkosc;
        }
        else
        {
            System.out.println("Predkosc nie moze byc mniejsza niz 0.");
        }
    }

    public void nakarmRenifera()
    {
        this.predkosc += 5;
    }
}
