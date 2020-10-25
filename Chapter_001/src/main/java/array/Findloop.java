package array;

public class Findloop {
    public static void main(String[] args) {

        System.out.println(indexOf(new int[]{10, 5}, 5));
    }
    public static int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }   return rst;
    }
}
