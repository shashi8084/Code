import java.util.*;
public class dxo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2,1};
        System.out.print("Original Array: ");
        System.out.println(Arrays.toString(arr));
        int[] reversedarr = new int[arr.length];
        int left = 0;
        int j = 0;
        int right = arr.length - 1;
        
        for(int nums : arr){
            reversedarr[j] = nums;
            j++;
        }

        while(left < right){
            int temp = reversedarr[left];
            reversedarr[left] = reversedarr[right];
            reversedarr[right] = temp;
            
            left++;
            right--;
        }
        System.out.print("Reversed Array: ");
        System.out.println(Arrays.toString(reversedarr));
        
        boolean isSame = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != reversedarr[i]) {
                isSame = false;
                break;
            }
        }
        
        System.out.println("Ispalindrome : " + isSame);
    }
}