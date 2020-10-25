package point;

public class Point {
        private final int x;
        private final int y;
        private int z;

        public Point(int first, int second) {
                this.x = first;
                this.y = second;
        }
        Point(int x, int y, int z) {
                this.x = x;
                this.y = y;
                this.z = z;
        }
        public double distance(Point that) {
                double first = Math.pow(this.x - that.x, 2);
                double second = Math.pow(this.y - that.y, 2);
                double a = first + second;
                return Math.sqrt(a);
        }
        double distance3d(Point that) {
                double first = Math.pow(this.x - that.x, 2);
                double second = Math.pow(this.y - that.y, 2);
                double third = Math.pow(this.z - that.z, 2);
                double a = first + second + third;
                return Math.sqrt(a);
        }
        void info() {
                System.out.println("Point[" + this.x + ", " + this.y + "]");
        }
        }