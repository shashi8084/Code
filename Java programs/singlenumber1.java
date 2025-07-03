public class singlenumber1
 {
    public static int singleNumber(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] != nums[j]){
                    count++;
                    return nums[i];
                    
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int [] nums = {2, 1, 1,2,1};
        System.out.println(singleNumber(nums));
    }
}

