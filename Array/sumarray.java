package array;
import java.util.*;
public class SumArray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter the Size of array:");
        int n=sc.nextInt();
        int [] arr = new int [n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];}
        System.out.println( "The sum of this array is "+sum);
        sc.close();
         
    
}
}