package array;
import java.util.Scanner;

public class MinArray {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        if(n>0){
            int [] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int min=arr[0];
        for(int i=1;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("The Min element of this array is "+min);
    }
         else{
        System.out.println("Please enter the valid size of the array");
    }

        sc.close();
    }

}