package condition;
import point.Point;
class Triangle {
    private Point first;
    private Point second;
    private Point third;

    Triangle(Point ap, Point bp, Point cp) {
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }
    private double period(double a, double b, double c) {
        return (a + b + c) / 2;
    }
    private boolean exist(double a, double c, double b) {
        return !(a >= c + b) || !(c >= a + b) || !(b >= a + c);
    }
    double area() {
        double a = first.distance(second);
        double b = first.distance(third);
        double c = second.distance(third);
        double p = period(a, b, c);
        double rsl = -1;
        double s = p * (p - a) * (p - b) * (p - c);
        if (this.exist(a, b, c)) {
            return Math.sqrt(s);
        }
        return rsl;
        }
        }

