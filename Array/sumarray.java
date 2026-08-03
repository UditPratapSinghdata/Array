package array;

import java.util.Scanner;

public class SumArray {

    public static void main(String[] args) {
        System.out.println("Enter the length of array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of array");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
        sc.close();

    }
}
