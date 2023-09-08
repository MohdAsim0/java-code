package TwoDArray;

public class Matrix {
    public static void main(String[] args) {
        int matrix[][]={ {1,2,3}, {4,5,6}, {7,8,9},};
        int m=matrix.length;//rows
        //each element in 2D Array is 1D array



        int n=matrix[0].length;
//       System.out.println(n);
        //no. of column =size of row
        //matrix[1].length--->matrix[i].length;


        printMatrix(matrix,m,n);


    }
    static void printMatrix(int arr[][],int m,int n){

        for (int i = 0; i < m; i++) {
            for (int j = 0; j <n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
