package Array;
//https://leetcode.com/problems/move-zeroes/

import java.util.Arrays;

public class LastInsert {

    public static void main(String[] args) {
        int arr[]={0,1,-2,1,0,7,0,5,0,0,7,-2};
        int n=arr.length;
        shiftZeroEndOftheArray(arr,n);
//      shiftZeroStartOftheArray(arr,n);




    }

    public static void shiftZeroEndOftheArray(int[] ar, int n){

        int cnt = 0;

        for (int i=0;i<n;i++){
            if (ar[i]!=0) ar[cnt++]=ar[i];
        }

        while (cnt<n){
            ar[cnt++]=0;
        }

        System.out.println(Arrays.toString(ar));


    }

    public static void shiftZeroStartOftheArray(int[] ar, int n){
        int cnt = 0;
        //make new array and fill it with 0
        int[] temp = new int[n];
        Arrays.fill(temp,0);

        for (int i=0;i<n;i++){
            if (ar[i]==0) cnt++;
        }

        for (int i = 0; i < n; i++) {
            if (ar[i]!=0 && cnt<n){
                temp[cnt++] =ar[i];
            }
        }
        for (int j=0;j<n;j++){
            System.out.print(temp[j]+" ");
        }
    }
}
