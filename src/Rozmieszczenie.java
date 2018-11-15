import java.applet.Applet;
import java.awt.event.MouseEvent;

/**
 * Created by User on 15.11.2018.
 */
public class Rozmieszczenie  extends Applet {
    Rozmieszczenie() {



    }
    public void rozm(Plansza pl,Statek st,Sprawdzczy sp ,MouseEvent e)
    {
        if(sp.Czypusty(pl,st) && (e.getX()>=pl.szerokosc-2)&& (e.getX()<=(pl.szerokosc+pl.x-2))&& ( e.getY()>=pl.wysokosc-2)&& ( e.getY()<=(pl.wysokosc-2+pl.y))) {
            pl.c = st.c;

        }
    }
    public void bicie(Plansza pl,Statek st,Sprawdzczy sp ,MouseEvent e,Pudlo p,Rzut rz,Plansza pl2) {
        if(sp.Czystatek(pl, st) && (e.getX()>=pl.szerokosc-2)&& (e.getX()<=(pl.szerokosc+pl.x-2))&& ( e.getY()>=pl.wysokosc-2)&& ( e.getY()<=(pl.wysokosc-2+pl.y))) {
            pl2.c = rz.c;}
            else
            pl2.c = p.c;

        }
    }

