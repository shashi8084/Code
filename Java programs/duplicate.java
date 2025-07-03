import java.util.*;

public class duplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 3, 2, 5};
        Arrays.sort(arr);
        
        System.out.println(Arrays.toString(arr));
        
        for (int i = 0; i < arr.length - 1; i++){
            if(arr[i] == arr[i + 1]){
                
                System.out.print(arr[i] + " ");
                // String.valueOf(long)
                // System.out.println(Arrays.toString(arr[i]));
                
                
            }
            
        }
        
    }
}
