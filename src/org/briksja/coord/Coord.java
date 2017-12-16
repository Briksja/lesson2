package org.briksja.coord;

public class Coord {
    public double x;
    public double y;

    public Coord(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double sum() {
        return x + y;
    }
}
