package array;
import java.util.Arrays;

public class MatrixCheck {
    public static void main(String[] args) {
        mono(new boolean[][]{{true, true},
                {true, true}});
    }

    public static boolean mono(boolean[][] data) {
        boolean result = true;
        int n = data.length - 1;
        for (int i = 0; i < n; i++) {
            if (data[i][i] != data[i + 1][i + 1]) {
                result = false;
                break;
            }
            if (data[i][data.length - 1 - i] != data[data.length - 1 - i][i]) {
                result = false;
                break;
            }
            System.out.println(result);

        }
        return result;
        }
        }
