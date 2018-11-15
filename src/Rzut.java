/**
 * Created by User on 15.11.2018.
 */
import java.applet.Applet;
import java.awt.*;
public class Rzut extends Applet {
    int wysokosc;
    int szerokosc;
    int x;
    int y;
    static Color c;
    Rzut(){}
    Rzut(int wysokosc,int szerokosc,Color c,int x,int y)
    {
        this.wysokosc=wysokosc;
        this.szerokosc=szerokosc;
        this.c=c;
        this.x=x;
        this.y=y;
    }
    public void rysuj(Graphics g)
    {
        g.setColor( c );
        g.fillRect(x, y, szerokosc, wysokosc);
    }
}
