package TwoDArray;

public class Revision1 {
    public static void main(String[] args) {
        int [][] mat={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                        };

        int m=mat.length;//row
        int n=mat[0].length;//column no. only for square matrix

        //without using extra Matrix
//        System.out.println("Transpose Matrix is: ");
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                System.out.print(mat[j][i]+" ");
//            }
//            System.out.println();
//        }


        // Using Extra Matrix
        int [][] transpose=new int[n][m];
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < m; j++) {
                transpose[i][j]=mat[j][i];
            }
        }

        //To print Transpose Matrix
        System.out.println("Array after transpose");
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j <transpose[i].length; j++) {
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }


    }
}
