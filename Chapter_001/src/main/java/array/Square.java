package array;

import java.util.Arrays;

public class Square {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(calculate(4)));
    }
    public static int[] calculate(int bound) {
    int[] rst = new int[bound];
    for (int index = 0; index < bound; index++) {
        rst[index] = (int) Math.pow(index + 1, 2);
        }
        return rst;
    }
}

