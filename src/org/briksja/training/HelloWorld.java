package org.briksja.training;

import org.briksja.coord.Coord;
import org.briksja.coord.Coord3;
import org.briksja.coord.Cos;

public class HelloWorld {
    public static void main(String[] args) {
        Coord place = new Coord(7, 9);
        System.out.println(place.sum());

        Coord3 place3 = new Coord3(7, 9, 20);
        System.out.println(place3.sum());

        Cos cokolwiek = new Cos();
        cokolwiek.show();

    }

}


