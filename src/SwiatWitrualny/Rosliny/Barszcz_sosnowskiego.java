package SwiatWitrualny.Rosliny;

import SwiatWitrualny.Gatunki;
import SwiatWitrualny.Organizm;
import SwiatWitrualny.Roslina;
import SwiatWitrualny.Swiat;

import java.awt.*;

public class Barszcz_sosnowskiego extends Roslina {

    public Barszcz_sosnowskiego(Swiat s, Point p)
    {
        super(s, Gatunki.BARSZCZ_SOSNOWSKIEGO, p);
        szansarozmn = 0.1;

    }

    @Override
    public boolean akcja()
    {
        super.akcja();
        zabijWszystkichWokol();
        return true;
    }
    @Override
    public boolean kolizja(Organizm o)
    {
        umrzyj();
        return false;
    }

    @Override
    public String plec()
    {
        return "";
    }


}
