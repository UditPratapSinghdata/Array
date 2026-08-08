package array;

import java.util.Arrays;

public class DeepCopy {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] y = Arrays.copyOf(arr, arr.length);
        y[0] = 1000;
        System.out.println(y[0]);
        System.out.println(arr[0]);

    }
}
