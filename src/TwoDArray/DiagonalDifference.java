package TwoDArray;
//Question --> Given a square matrix, calculate the absolute difference between the sums of its diagonals.

public class DiagonalDifference {
    public static void main(String[] args) {
        int matrix[][] = {{10, 2, 3}, {4, 5, 6}, {10,8,9},};
        int m = matrix.length;
        int n = matrix[0].length;
        System.out.println(diagonalDiff(matrix,m,n));
        System.out.println(diagonalDifference(matrix,m,n));


    }
    static  int diagonalDifference(int mat[][],int row,int col){

        int dsum = 0;
        int ssum=0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {  //col

                // left diagonal when i==j
                if(i==j) {
                    dsum += mat[i][j];
                }

                //right diagonal when i+j==col-1||row-1
                if (i+j==col-1){
                    ssum+=mat[i][j];
                }
            }
        }
        return  Math.abs(dsum-ssum);

        //TC=O(N*M);
        //SC=O(1);

    }


    //Optimal Solution
    static int diagonalDiff(int arr[][],int m,int n){
        int ldiagonal=0;
        int rdiagonal=0;

        for (int i = 0; i < n; i++) {
            ldiagonal+=arr[i][i];  //i==j
            rdiagonal+=arr[i][n-1-i];//i+j=n-1 -->  j=n-1-i
        }
        return Math.abs(ldiagonal-rdiagonal);

        //TC=O(N);
        //SC=O(1);
    }
}
