package array;
import java.util.Arrays;

public class Matrix {
    public static void main(String[] args) {
        multiple(2);
    }

    public static int[][] multiple(int size) {
        int[][] table = new int[size][size];
        for (int out = 0; out < table.length; out++) {
            for (int inner = 0; inner < table.length; inner++) {
                table[out][inner] = (out + 1) * (inner + 1);
                System.out.printf("%2d", (out + 1) * (inner + 1));
            }
            System.out.println();

        }    return table;
    }

}

