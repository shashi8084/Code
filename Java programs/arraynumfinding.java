public class arraynumfinding {
    public static boolean numfinding(int matrix[][], int key){
        int count = 0;


        for(int row = 0; row < matrix.length; row++){
            for(int colm = 0; colm < matrix[row].length; colm++){
            
                if(matrix[row][colm] == key){
                    count++;
                }
            
            }
        }

        System.out.println("Number of 7s :" + count);
        return true;
    }

    public static void main(String[] args) {
        int matrix[][] = {{4, 7, 8},
                           {8, 8, 7}};
        int key = 7;
        numfinding(matrix, key);
    }
}
