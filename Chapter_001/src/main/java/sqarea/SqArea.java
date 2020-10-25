package sqarea;

public class SqArea {
    public int square(int p, int k) {
        int height = p / (2 * k + 2);
        return height * height * k;
    }

}
