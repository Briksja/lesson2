public class HelloWorld {
    public static void main(String[] args) {
        Coord place = new Coord(7, 9);
        System.out.println(place.sum());

        Coord3 place3 = new Coord3(7, 9, 20);
        System.out.println(place3.sum());
    }

    public static class Coord {
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

    public static class Coord3 extends Coord {
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
}


