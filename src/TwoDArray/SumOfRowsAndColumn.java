package TwoDArray;

public class SumOfRowsAndColumn {
    public static void main(String[] args) {
        int matrix[][]={ {1,2,3}, {4,5,6}, {7,8,9},};
        int m=matrix.length;
        int n=matrix[0].length;
//        sumOfRows(matrix,m,n);
        sumOfCols(matrix,m,n);

    }

    static void sumOfRows(int [][] arr,int row,int col){
        int row_sum=0;

        for (int i = 0; i < row; i++) {
            row_sum=0;// at start of each row sum will be zero

            for (int j = 0; j < col; j++) {
                row_sum+=arr[i][j];
            }

            System.out.print(row_sum+" ");
        }


    }

    static void sumOfCols(int [][] arr,int row,int col){

        int col_sum=0;

        for (int i = 0; i < col; i++) {

               col_sum=0;// at start of each row sum will be zero
            for (int j = 0; j < row; j++) {
                col_sum+=arr[j][i];
            }
            System.out.print(col_sum+" ");
        }


    }




}
