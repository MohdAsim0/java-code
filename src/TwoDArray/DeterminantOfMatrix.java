package TwoDArray;

import java.util.Scanner;

public class DeterminantOfMatrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[][] mat=new int[2][2];
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                mat[i][j]=s.nextInt();
            }
        }
        int deter=mat[0][0]*mat[1][1]-mat[1][0]*mat[0][1];
        System.out.println(deter);
    }
}
