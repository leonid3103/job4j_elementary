package array;
import java.util.*;

public class ArrayDuplicate {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(remove(new String[]{"Привет", "Мир", "Привет", "Супер", "Мир"})));
    }

    public static String[] remove(String[] array) {
            int n = 0;
            for (int i = 0; i < array.length - n; i++) {
                for (int j = 0; j < array.length - n; j++) {
                    if (array[i].equals(array[j]) && i != j) {
                        String temp = array[array.length - n - 1];
                        array[array.length - 1 - n] = array[j];
                        array[j] = temp;
                        n++;
                        j--;
                    }
                }
            } return Arrays.copyOf(array, array.length - n);
    }
    }

