public class max {

    public static int Max(int[] arr){
        int maxVal = arr[0];
        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] > arr[i+1]){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 23, 9, 18};
        System.out.println(Max(arr));
    }
}
