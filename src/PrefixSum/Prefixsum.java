package PrefixSum;

import java.util.Scanner;

public class Prefixsum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();

        int arr[]=new int[n];
        System.out.println("Enter array elements of size: "+n);
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }

        System.out.println("Prefix sum array is:");
//        prefixSumArray(arr,n);
          prefixSumArr(arr,n);


    }
    static void prefixSumArray(int arr[],int n){
        //Create prefixsum of size n
        int []prefixsum=new int[n];
          prefixsum[0]=arr[0];

        //calculating prefix sum from 1bto n
        for (int i = 1; i < n; i++) {
            prefixsum[i]=arr[i]+prefixsum[i-1];
        }

        //loop to print prefixsum array from 0 to n
        for (int i = 0; i < n; i++) {
            System.out.print(prefixsum[i]+" ");
        }
    }


    //Prefix sum array without creating prefixsum array
    static void prefixSumArr(int arr[],int n){


        //calculating prefix sum from 1bto n
        for (int i = 1; i < n; i++) {
            arr[i]=arr[i]+arr[i-1];
        }

        //loop to print prefixsum array from 0 to n
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
