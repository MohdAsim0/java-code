package Array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int arr[]={1,2,3,4,5,6};
        System.out.println("Initial Array : "+Arrays.toString(arr));


//        int start=0;
//        int end=arr.length-1;
//
//        int temp=0;// it is a variable not array
//        while (start<end){
//            temp=arr[start];
//            arr[start]=arr[end];
//            arr[end]=temp;
//            start++;
//            end--;
//        }
//
//        System.out.println("Reversed Array: "+Arrays.toString(arr));

    }

    static void reverse(int arr[]){

        for (int i = 0; i < arr.length/2; i++) {
            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        System.out.println(arr);
    }
}
