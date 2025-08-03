package TwoDArray;
/*Given a square matrix mat, return the sum of the matrix diagonals.
   Only include the sum of all the elements on the primary diagonal
  and all the elements on the secondary diagonal that are not part of the primary diagonal.*/

import java.util.Scanner;

public class MatrixDiagonalSum {
    public static void main(String[] args) {
//        int matrix[][] = {
//                {10, 2, 3},
//                {4, 5, 6},
//                {10, 8, 9},
//            };

        Scanner sc =new Scanner(System.in);
        System.out.println("Please Enter Row And Column for square Matrix respectively");
        int m=sc.nextInt();
        int n=sc.nextInt();
        System.out.println("Enter the elements");
        int [][] mat= new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j]=sc.nextInt();
            }
        }




        System.out.println(diagonalSum(mat));
//        System.out.println(diagonalSum1(matrix));
    }

    static int diagonalSum(int mat[][]) {
        int diagonalSum = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {

                //Primary Diagonal Sum
                if (i == j) {
                    diagonalSum += mat[i][j];
                }
                //Secondary diagonal sum
                else if (i + j == mat[i].length - 1) {
                    diagonalSum += mat[i][j];
                }

            }
        }

        return diagonalSum;
    }

    static int diagonalSum1(int mat[][]) {
        int diagonalSum = 0;

        for (int i = 0; i < mat[0].length; i++) {
            //PRIMARY DIAGONAL
            diagonalSum += mat[i][i];

            // neglect the central element
            if (i != (mat[i].length - i - 1)) {
                //SECONDARY DIAGONAL
                diagonalSum += mat[i][mat[i].length - 1 - i];
            }
        }

        return diagonalSum;
    }

}
