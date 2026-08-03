package array;

import java.util.Scanner;

public class ProdArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = sc.nextInt();
        if (n > 0) {
            int[] arr = new int[n];
            System.out.println("Enter the elements of array");

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int prod = 1;

            for (int i = 0; i < n; i++) {
                prod *= arr[i];
            }
            System.out.println("The product is:" + prod);
        } else {
            System.out.println("Enter the appropriate length");
        }
        sc.close();

    }
}
