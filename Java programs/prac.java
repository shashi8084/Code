public class prac {
    public static boolean Isempty(int []nums) {
        
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] != nums[i+1]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5,6,7,8,9};
        System.out.println(Isempty(nums));
    }
}