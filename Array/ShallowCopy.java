package array;

public class ShallowCopy {
    public static void main(String[] args) {
        
    
    int [] arr={1,2,3};
    int [] x=arr;
    x[0]=100;
    System.out.println(arr[0]);

    }
}
