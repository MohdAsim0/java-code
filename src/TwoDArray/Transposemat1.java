package TwoDArray;

public class Transposemat1 {
    public static void main(String[] args) {

        int matrix[][] = {{1, 2, 3, 4}, {4, 5, 6, 9}, {7, 8, 9, 55},};
        int m = matrix.length;

        int n = matrix[0].length;


//        int transpose[][]=new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }

        //TC=O(m*n)
        //SC=O(1)
    }
}
