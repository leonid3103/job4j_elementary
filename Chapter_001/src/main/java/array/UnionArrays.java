package array;

import java.util.Arrays;

public class UnionArrays {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(merge(new int[]{1, 3}, new int[]{2, 4})));
    }
    public static  int[] merge(int[] left, int[] right) {
        int l = 0;
        int r = 0;
        int[] result = new int[left.length + right.length];
        for (int i = 0; i < (left.length + right.length); i++) {
         if (l < (left.length) && r < (right.length)) {
             if (left[l] <= right[r]) {
                  result[i] = left[l];
                  l++;
             } else {
                 result[i] = right[r];
                 r++;
             }
             } else if (l < left.length) {
                      result[i] = left[l];
                  l++;
             } else {
                 result[i] = right[r];
                 r++;
             }
        }    return result;
    }
    }
