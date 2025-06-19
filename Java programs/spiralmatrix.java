public class spiralmatrix {
    public static void Smatrix(int matrix[][]){

        int rowstart = 0;
        int colmstart = 0;
        int rowend = matrix.length - 1;
        int colmend = matrix[0].length - 1;
        while(rowstart <= rowend && colmstart <= colmend){
            for (int j = colmstart; j <= colmend; j++){
                System.out.print(matrix[rowstart] [j] + " ");
            }
            rowstart++;

            for (int i = rowstart ; i <=rowend; i++){
                System.out.print(matrix[i] [colmend] + " ");
            }
            colmend--;

            for (int j = colmend; j >= colmstart; j--){
                System.out.print(matrix[rowend] [j] + " ");
            }
            rowend--;

            for (int i = rowend; i >=rowstart; i--){
                System.out.print(matrix[i] [colmstart] + " ") ;
            }
            colmstart++;
        }
    }

    public static void main(String args[]){
        int matrix[][] = {{1, 2, 3, 4}, 
                          {5, 6, 7, 8},
                          {9, 10, 11, 12},
                          {13, 14, 15, 16}};

        Smatrix(matrix);
    }
}
