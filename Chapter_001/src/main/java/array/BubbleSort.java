package array;
import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sort(new int[]{4, 1, 5, 6, 7, 9, 8, 2, 3, 10})));
    }
    public static int[] sort(int[] array) {
        for (int j = array.length - 1; j >= 0; j--) {
        for (int index = 0; index < j; index++) {
            if (array[index] > array[index + 1]) {
                int tmp = array[index];
                array[index] = array[index + 1];
                array[index + 1] = tmp;
            }
            }
        }     return array;
}
}
