package Array1;

import java.util.*;
public class TargetSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int [] A=new int[n];
        for(int i=0;i<n;i++){
            A[i]=sc.nextInt();
        }

        int target=sc.nextInt();

        Arrays.sort(A);
        int i=0;
        int j=n-1;

        while(i<j){
            int sum=A[i]+A[j];
            if(sum==target){
                if( A[i]==A[i+1]){
                    i++;
                }
                if( A[j]==A[j-1]){
                    j--;
                }

                System.out.println(A[i]+" "+A[j]);
                i++;
                j--;
            }
            else if(sum>target){
                j--;
            }
            else{
                i++;
            }
        }
    }
}

