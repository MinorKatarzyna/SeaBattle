import java.applet.Applet;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


/**
 * Created by User on 15.11.2018.
 */
public class Rozgrywka extends Applet implements Runnable, MouseListener {
//obiekty
    Sprawdzczy sp= new Sprawdzczy();
   Plansza []p;
   Rozmieszczenie roz;
    Pudlo pu;
    Rzut rz;
    Color c;
    RzutDwa d;
    Plansza []p2;
    //dodatkowe zmienne
    int N=10;
    int N2=N*N;
    int x=50;
    int y=50;
    int x2=600;
    int y2=50;
    boolean start=true;
Statek st;
    @Override
    //do inicjalizacji obiektów
    public void init()
    {

        c=new Color(0.7176471f, 0.39215687f, 1.0f);
        Color c2 = new Color(1.0f,1.0f,1.0f);
        Color c3 = new Color(1.0f,0.0f,0.0f);
        Color c4 = new Color(5.0f,5.0f,5.0f);
        roz = new Rozmieszczenie();
        p = new Plansza[N2];
        p2 = new Plansza[N2];
        st=new Statek(50,50,c,x,y,3);
        pu=new Pudlo(50,50,c3,x,y);
        rz=new Rzut(50,50,c4,x,y);
        d= new RzutDwa(50,50,c,120,50);

        for(int i = 0; i < N2; i++) {
            if (i % N == 0 && i != 0){y=y+50;x=50;
                p[i]=new Plansza(50, 50,c2, 50,  y);}
            p[i]=new Plansza(50, 50,c2, x, y);x=x+50;
        }
        for(int i = 0; i < N2; i++) {
            if (i % N == 0 && i != 0){y2=y2+50;x2=600;
                p2[i]=new Plansza(50, 50,c2, 50,  y2);}
            p2[i]=new Plansza(50, 50,c2, x2, y2);x2=x2+50;
        }

    }

    @Override
   // rysowanie obiektów
    public void paint(Graphics g) { // g - kontekst graficzny
        g.drawString ("Gracz 1:", 10, 15);
        g.translate(50,150);
                for (Plansza k : p) {

            k.rysuj(g);


        }
        for (Plansza k2 : p2) {

            k2.rysuj(g);


        }

        g.translate(150,-450);
        //d.rysuj(g);

    }
    @Override
    public void run() {
        while(true){

            repaint();
        }
    }

    @Override
    //rzeby zrobić rozrywke czyli interakcja z myszką
    public void mouseClicked(MouseEvent e) {
    if(start) {
        if (e.getButton() == e.BUTTON1) {
            for (int i = 0; i < N2; ++i)
                roz.rozm(p[i], st, sp, e);
        }
        repaint();
    }start =false;
        if (e.getButton() == e.BUTTON1) {
            for (int i = 0; i < N2; ++i)
                roz.bicie(p[i],st,sp,e,pu,rz,p2[i]);
        }
        repaint();

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println(e);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println(e);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println(e);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println(e);
    }
}
