package array;
import java.util.Arrays;
public class Turn {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(back(new int[]{4, 1, 5, 6, 7})));
}
    public static int[] back(int[] array) {
        for (int index = 0; index < array.length / 2; index++) {
            int tmp = array[array.length - index - 1];
            array[array.length - index - 1] = array[index];
            array[index] = tmp;
        }
        return array;
    }
}
