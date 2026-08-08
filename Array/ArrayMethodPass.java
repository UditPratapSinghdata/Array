package array;
public class ArrayMethodPass {
    public static void main(String[] args) {
        int []arr={1,2,3};
        System.out.println(arr[0]);
        ChangeValue(arr);
        System.out.println(arr[0]);
    }
        public static void ChangeValue(int [] x){
            x[0]=100;
        }
        
        
    
    
}
