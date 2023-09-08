package Array;

import java.util.*;


public class Que {
    public static void main(String[] args) {
//        perfectSquare(9);
        perfectSquareofEachNum(7);

//        int arr[] = {10, 20, 20, 10, 10, 20, 5, 20};
//        int n = arr.length;
//        countingFrequencies(arr,n);

    }

//    Q.1- count the frequency of each element in array
    static void countingFrequencies(int arr[], int n) {

        HashMap<Integer, Integer> mp = new HashMap<>();

        for (int i = 0; i < n; i++) {
            if (mp.containsKey(arr[i])) {
                mp.put(arr[i], mp.get(arr[i]) + 1);
            }
            else {
                mp.put(arr[i], 1);
            }
        }
        System.out.println(mp);
    }

    static void perfectSquare(int n){
        double sq = Math.sqrt(n);
        int num = (int)Math.pow(sq,2);
        if (num==n){
            System.out.println("Perfect Square");
        }
        else {
            System.out.println("Not a perfect Square");
        }
    }


    //Problem-- n=12
    //         output--3
    //     12=4+4+4;
    // 2^2+2^2+2^2
    public static void perfectSquareofEachNum(int n){

        int[]ar = new int[n+1];
        Arrays.fill(ar,Integer.MAX_VALUE);//fill array with 0
        ar[0] = 0;
        for (int i=1;i<=n;i++){
            for(int j=1;j*j<=i;j++){ //j^2!>i
                ar[i] = Math.min(ar[i],ar[i-j*j]+1);
            }
        }
        System.out.println(ar[n]);
    }
}




