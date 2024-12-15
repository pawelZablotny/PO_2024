import sun.reflect.generics.visitor.Reifier;

import java.util.ArrayList;
import java.util.List;

public class Sanie {
    private List<Renifer> renifery;

    @Override
    public String toString()
    {
        return "Sanie ciągną renifery: " + renifery;
    }

    @Override
    public int hashCode()
    {
        return renifery.hashCode();
    }


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
        Sanie sanie = (Sanie) obj;
        return renifery.equals(sanie.renifery);
    }



    public Sanie(){
        this.renifery = new ArrayList<>();
    }

    public List<Renifer> getRenifery(){
        return renifery;
    }

    public void dodajRenifera(Renifer renifer)
    {
        renifery.add(renifer);

    }

    public int sumaPredkosci()
    {
        int sumaP = 0;
        for(Renifer renifer : renifery)
        {
            sumaP += renifer.getPredkosc();
        }
        return sumaP;
    }

    public Renifer najwolniejszyRefnifer()
    {

        Renifer najwolniejszyRefnifer = renifery.get(0);
        for(Renifer renifer : renifery)
        {
            if(renifer.getPredkosc() < najwolniejszyRefnifer.getPredkosc())
            {
                najwolniejszyRefnifer = renifer;
            }
        }
        return najwolniejszyRefnifer;
    }

}
