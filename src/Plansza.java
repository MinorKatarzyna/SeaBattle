import java.applet.Applet;
import java.awt.*;
/**
 * Created by User on 15.11.2018.
 */
//import java.applet.Applet;

public class Plansza  extends Applet {
    int wysokosc;
    int szerokosc;
    int x;
    int y;
    Color c;

    Plansza(int  wysokosc,int szerokosc,Color c,int x,int y)
    {
        this. wysokosc= wysokosc;
        this.szerokosc=szerokosc;
        this.c=c;
        this.x=x;
        this.y=y;
    }
    Plansza(){}
    Plansza(int  wysokosc)
    {
        this. wysokosc= wysokosc;
        this.szerokosc=wysokosc;
        this.c=new Color(1.0f,1.0f,1.0f);
        this.x=50;
        this.y=100;
    }
    public void rysuj(Graphics g)

    {
        g.setColor(Color.black);
        g.fillRect(x, y, szerokosc, wysokosc);
        g.setColor(c);
        g.fillRect( x+1,y+1 ,szerokosc-2, wysokosc-2);


    }
}
