public class goodpair {

    public static int numIdenticalPairs(int[] matrix) {

        int count = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = i + 1; j < matrix.length; j++){
                if(matrix[i] == matrix[j]){
                    count ++;
                }
            }
        }
        return count;
        
    }
    public static void main(String[] args) {
        int matrix[] = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(matrix));
    }
}
