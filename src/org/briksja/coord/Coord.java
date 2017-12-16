package org.briksja.coord;

public class Coord {
    public double x;
    public double y;

    public Coord(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Coord() {
        this.x = 0;
        this.y = 0;
    }

    public double sum() {
        return x + y;
    }

    public static void ab(Coord c) {
        c.x = 1.;
        c.y = -1.;
    }

    public double multisum(double multi) {
        double value = sum() * multi;
        return value;
    }

    public double multisum(double multi1, double multi2) {
        double value = sum() * multi1 * multi2;
        return value;
    }

    public String toString() {
        return "Coord " + x + " " + y;

    }

}



