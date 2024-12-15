public class Elf {
    private String imie;
    private int wiek;
    private String stanowisko;



    @Override
    public boolean equals(Object obj)
    {
        if( this == obj)
        {
            return true;
        }
        if(obj == null || getClass() != obj.getClass())
        {
            return false;
        }
        Elf elf  = (Elf) obj;
        if(wiek != elf.wiek)
        {
            return false;
        }
        if(!imie.equals(elf.imie))
        {
            return false;
        }
        return stanowisko.equals(elf.stanowisko);

    }


    @Override
    public int hashCode()
    {
        int result = imie.hashCode();
        result = 31 * result * wiek;
        result = 31 * result * stanowisko.hashCode();
        return result;
    }


    public String tostring(){
        return "imie: " + imie + ", wiek: " + wiek + " stanowisko: " + stanowisko;
    }

    public Elf(String imie, int wiek, String stanowisko)
    {
        this.imie = imie;
        this.wiek = wiek;
        this.stanowisko = stanowisko;
    }

    public String getImie()
    {
        return imie;
    }
    public void setImie(String imie){
        this.imie = imie;
    }
    public int getWiek()
    {
        return wiek;
    }
    public void setWiek(int wiek)
    {
        if (wiek >= 0)
        {
            this.wiek = wiek;
        }
        else
        {
            throw new IllegalArgumentException("Nie moze byc ujemny");
        }
    }

    public String getStanowisko()
    {
        return stanowisko;
    }

    public void setStanowisko(String stanowisko)
    {
        this.stanowisko = stanowisko;
    }

    public void przedstawSie()
    {
        System.out.println("Moje imie to: " + imie + " mam " + wiek + "lat, na stanowisku: " + stanowisko);
    }




}
