import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Fabryka {
    private List<Elf> elfy;
    private double dlGeo;
    private double szGeo;


    @Override
    public boolean equals(Object obj)
    {
        if( this == obj) return true;
        if( obj == null || getClass() != obj.getClass())
        {
            return false;
        }
        Fabryka fabryka = (Fabryka) obj;
        if(Double.compare(fabryka.dlGeo, dlGeo) != 0)
        {
            return false;
        }
        if(Double.compare(fabryka.szGeo, szGeo !=0))
        {
            return false;
        }
        return elfy.equals(fabryka.elfy);
    }

    @Override
    public String toString()
    {
        return "Fabryka " + elfy + " znajduje sie na dlugości: " + dlGeo + " i szerokości: " + szGeo;
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(elfy, dlGeo, szGeo);
    }


    public Fabryka(double dlGeo, double szGeo){
        this.dlGeo = dlGeo;
        this.szGeo = szGeo;
        this.elfy = new ArrayList<>();
    }

    public double getDlGeo(){
        return dlGeo;
    }
    public void setDlGeo(double dlGeo)
    {
        this.dlGeo = dlGeo;
    }

    public double getSzGeo()
    {
        return szGeo;
    }

    public void setSzGeo(double szGeo)
    {
        this.szGeo = szGeo;
    }

    public List<Elf> getElfy(){
        return elfy;
    }

    public void dodajPracownika(Elf elf)
    {
        elfy.add(elf);
    }

    public void usunPracownika(Elf elf)
    {
        elfy.remove(elf);
    }

    public Elf najstarszyPracownik() {
        Elf najstarszyPracownik = elfy.get(0);
        for (Elf elf : elfy)
        {
            if(elf.getWiek() > najstarszyPracownik.getWiek())
            {
                najstarszyPracownik = elf;
            }
        }
        return najstarszyPracownik;
    }



}
