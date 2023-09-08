package TwoDArray;

import java.util.Scanner;

public class MatrixInput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No. of rows");
        int m=sc.nextInt();
        System.out.println("Enter No. of columns");
        int n=sc.nextInt();

        int mat[][]=new int[m][n];

        //To TAKE INPUT
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j]=sc.nextInt();
            }
        }

        //TO PRINT MATRIX
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
