import java.util.Arrays;

public class dmo {
    public static boolean isvalid(String str){
        int vowel = 0;
        int consonent = 0;
        // str = str.toLowerCase();
        for (char ch : str.toCharArray()) {
            if(Character.isLetter(ch)){
                if ("aeiouAEIOU".indexOf(ch) == -1) {
                    vowel++;
                }else{
                    consonent++;
                }
            }else if(!Character.isDigit(ch)){
                return false;
            }
        }
       return vowel >= 1 && consonent >= 1;
    }
    public static void threesum(int[] nums, int target){
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void main(String[] args) {
        // String str = "234Adas";
        // System.out.println(isvalid(str));
        // int[] nums = {-1,2,1,-4};
        // int target = 1;
        // output = 2
        // threesum(nums, target);
        // System.out.println(threesum(nums, target););


        int[] arr = {10, 20, 30, 20, 50};
        int val = 20;
        int i = 0;
        // Replace element at index 2 (30) with 99
        while(i < arr.length){
            if(arr[i] == val){
                // arr[i] = '_';
                System.out.print("_");
                
            }
            i++;
        }
        // for(String nums : arr){
        //     System.out.println(nums +" ");
        // }
        System.out.println(Arrays.toString(arr));

        // Print the array
        // for (int num : arr) {
        //     System.out.print(num + " ");
        // }
    }
}