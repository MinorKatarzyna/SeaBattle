import java.awt.*;
/**
 * Created by User on 15.11.2018.
 */
public class Statek extends Rzut{
    int iloscOczek;
    Statek(){}
    Statek(int wysokosc,int szerokosc,Color c,int x,int y,int iloscOczek)
    {
        this.wysokosc=wysokosc;
        this.szerokosc=szerokosc;
        this.c=c;
        this.x=x;
        this.y=y;
        this.iloscOczek=iloscOczek;

    }
}
