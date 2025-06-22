public class arraynumfinding {
    public static boolean numfinding(int matrix[][], int key){
        int count = 0;

        for(int i = 0; i < matrix.length; i ++){
            for(int j = 0; j < matrix[0].length; j++){
                if(key == matrix[i][j]){
                    count ++;
                }
            }
        }
        System.out.println("No. of 7s :" + count);
        return true;
    }

    public static void main(String[] args) {
        int matrix[][] = {{4, 7, 8},
                           {8, 8, 7}};
        int key = 7;
        numfinding(matrix, key);
    }
}
