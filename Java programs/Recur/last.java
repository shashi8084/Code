public class last {
    public static int lastOccurance(int[] arr, int key, int i){
        if(i == arr.length){
            return -1;
        }
        
        int k = lastOccurance(arr, key, i + 1);
        if(k == -1 && arr[i] == key){
            return i;
        }
        return k;
    }
    public static void main(String[] args) {
        int[] arr = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        System.out.println(lastOccurance(arr, 5, 0));
    }
}
