package array;
import java.util.Arrays;
public class Check {
    public static void main(String[] args) {

        System.out.println(mono(new boolean[]{true, true, true, false}));
    }
    public static boolean mono(boolean[] data) {
        for (int index = 0; index < data.length - 1; index++) {
            if (data [index] != data[index + 1]) {
                return false;
            }
        }
        return true;
    }
}