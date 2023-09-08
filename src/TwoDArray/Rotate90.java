package TwoDArray;

public class Rotate90 {
    public static void main(String[] args) {
        int mat[][] = { {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };



        transpose(mat);
        revRow(mat);
        printMatrix(mat);

        //TC==O(N^2) + O(N^2)
        //SC=O(1)

    }



    static void transpose (int arr[][])
    {
        for (int i = 0; i < arr.length; i++){
            for (int j = i; j < arr[0].length ; j++){
                int temp = arr[j][i];
                arr[j][i] = arr[i][j];
                arr[i][j] = temp;
            }
        }


    }

    static void revRow(int mat[][]){

            int n = mat.length;
            for (int i = 0; i < mat.length; i++){// for every row selection
                for (int j = 0; j <  mat.length/ 2; j++){ //reversing row loop n/2
                    int temp = mat[i][j];
                    mat[i][j] = mat[i][n - j - 1];
                    mat[i][n - j - 1] = temp;
                }
            }

    }

    static void printMatrix (int arr[][]){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[0].length; j++)
                System.out.print (arr[i][j] + " ");
            System.out.println ("");
        }
    }
}
