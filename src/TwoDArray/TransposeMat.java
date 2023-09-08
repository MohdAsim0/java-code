package TwoDArray;

public class TransposeMat {
    public static void main(String[] args) {

        int matrix[][]={ {1,2,3}, {4,5,6}, {7,8,9},};

        int m=matrix.length; //row
        int n=matrix[0].length;//column

        //New matrix
        int transpose[][]=new int[n][m];

        //transpose operation
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transpose[i][j]=matrix[j][i];
            }
        }

        //to print transpose matrix
        System.out.println("Array after transpose");
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j <transpose[i].length; j++) {
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
        //TC=O(m*n)
        //SC=O(n*m)

    }



}
