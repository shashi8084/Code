public class plus1 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,5};
        arr[arr.length - 1] += 1;

        for(int value : arr){
            System.out.print(value + " ");
        }

        // int sum = 0;
        // int plus = (arr.length) + 1;
        // System.out.println(plus);
        for(int i = 0; i < arr.length; i++ ){
            // System.out.print(arr[i] + " ");

            // arr[arr.length - 1] += 1;
            // System.out.println(arr[arr.length - 1]);
            // sum = arr[i] + sum;
            // System.out.println(sum);
        }
    }
}
