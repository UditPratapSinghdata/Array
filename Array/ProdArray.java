package array;
import java.util.*;
public class ProdArray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int mul=1;
        System.out.println("Enter the Size of array:");
        int n=sc.nextInt();
        int [] arr = new int [n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            mul*=arr[i];}
        System.out.println( "The mul of this array is "+mul);
        sc.close();
         
    
}
}