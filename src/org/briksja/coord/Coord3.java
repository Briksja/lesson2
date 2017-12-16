package org.briksja.coord;

public class Coord3 extends Coord {
    public double z;

    public Coord3(double x, double y) {
        super(x, y);
    }

    public Coord3(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }


    public double sum() {
        return x + y + z;
    }
}
