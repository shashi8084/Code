import java.util.Arrays;
import java.util.Scanner;
public class prac {

    // public static void main(String[] args) {
    //     int[] arr = {1, 2, 2, 3, 3, 3};

    //     // Step 1: Find max value to size the frequency array
    //     int max = 0;
    //     for (int num : arr) {
    //         if (num > max) {
    //             max = num;
    //         }
    //     }

    //     // Step 2: Create frequency array
    //     int[] freq = new int[max + 1]; // index = value, value = count

    //     // Step 3: Count frequencies
    //     for (int num : arr) {
    //         freq[num]++;
    //     }

    //     // Step 4: Print frequencies
    //     for (int i = 0; i < freq.length; i++) {
    //         if (freq[i] > 0) {
    //             System.out.println(i + " occurs " + freq[i] + " times");
    //         }
    //     }
    // }

    // public static void main(String[] args) {
    //     String str = "madam";
    //     String reversed = new StringBuilder(str).reverse().toString();
    //     System.out.println(reversed);

    //     System.out.println(str.equals(reversed));
    // }

    // public static void main(String[] args) {
    //     Scanner sc  = new Scanner(System.in);
    //     System.out.print("Enter a number : ");
    //     int num = sc.nextInt();

    //     int sum = 0;
    //     while (num > 0 || sum > 9) {
    //         if (num == 0){
    //             num = sum;
    //             sum = 0;
    //         }
    //         int digit = num % 10;
    //         sum = sum + digit;
    //         num = num / 10;
    //     }
    //     System.out.println(sum);
    // }

    // public static void main(String[] args) {
    //     String s = "A man, a plan, a canal: Panama";
    //     // s = s.replace(",", "");
    //     // s = s.replace(":", "");
    //     // s = s.replace(" ", "").toLowerCase();
    //     s = s.replaceAll("[^a-zA-Z0-9 ]", "").replace(" ", "").toLowerCase();
    //     // s = s
    //     System.out.println(s);

    //     // String reversed = new StringBuilder(s).reverse().toString();
    //     // System.out.println(s.equals(reversed));
    // }

    // public static void main(String[] args) {
    //     int a = 2;
    //     int b = 3;
    //     System.out.println(a ^ b);
    // }

    public static int[] twoSum(int[] nums, int target) {
        // Arrays.sort(nums);
        int left = 0; 
        int right = nums.length - 1;
        while(left < right){
            int sum = nums[left] + nums[right];

            if(sum == target){
                return new int[]{left, right};
            }
            else if(sum < target){
                left ++;
            }
            else{
                right--;
            }
        }
        return new int[] { -1, -1 };
    }
    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int target = 6;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}