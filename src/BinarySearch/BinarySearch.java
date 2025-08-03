package BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        int[]arr={1,2,3,4,5,6,7,8,9,99};
         int search=binarySearch(arr,4);
        System.out.println(search);
//        int search=binarySearch1(arr,2,0,arr.length-1);
//        System.out.println(search);

//        System.out.println(binaryDescendingSearch(arr,2));

    }

    static int binarySearch(int[] arr, int key) {
        int low=0;
        int high=arr.length-1;

        while (low<=high){
            int mid=low+(high-low)/2;//to reduce integer overflow

            if(arr[mid]==key)
                return mid;
            else if (key>arr[mid])
                low=mid+1;
            else if(key<arr[mid])
                high=mid-1;

        }
        return -1;
    }

    static int binarySearch1(int[] arr, int key, int low, int high) {
//        if (low>high) return -1;

        if (low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==key)
                return mid;
            else if (arr[mid]<key)
                return binarySearch1(arr,key,low,mid-1);
            else return binarySearch1(arr,key,mid+1,high);
        }

        return -1;
    }


    static int binaryDescendingSearch(int[] arr, int key){
        int start=0;
        int end=arr.length-1;


        while(start<=end){
            int mid=start+(end-start)/2;

            if (arr[mid]==key)
                return mid;
            else if (key>arr[mid]) {
                end=mid-1;
            }
            else if(key<arr[mid]){
                start=mid+1;

            }

        }
        return -1;
    }



}


