package array;
import java.util.Arrays;

public class ArrayChar {
    public static void main(String[] args) {

        System.out.println(startsWith("Привет", "При"));
    }

    public static boolean startsWith(String word, String prefix) {
        boolean result = true;
        char[] pref = prefix.toCharArray();
        char[] wrd = word.toCharArray();
        for (int index = 0; index < pref.length; index++) {
            if (pref[index] != wrd[index]) {
                return false;
            }
            }
             return result;
            }
            }