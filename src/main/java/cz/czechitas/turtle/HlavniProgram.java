package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {
    private Turtle zofka;

    public void start() {
        zofka = new Turtle();

        nakresliRovnoramennyTrojuhelnik (200,200, 100,Color.MAGENTA);

    }
    private void nakresliRovnoramennyTrojuhelnik(double x, double y, double delkaStrany, Color barva) {
        zofka.setLocation(x, y);
        zofka.setPenColor(barva);
        for (int i = 0; i < 3; i++) {
            zofka.move (delkaStrany);
            zofka.turnLeft(120);
        }
    }





    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}
