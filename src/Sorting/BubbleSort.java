package Sorting;
import java.util.*;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr ={34,39,36,3,31,4,6};
        bubbleSort(arr);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }

        System.out.println(Arrays.toString(arr));



    }
    static void bubbleSort(int arr[]){
        boolean swapped;
        //run the pass n-1 times
        for (int i = 0; i < arr.length; i++) {
            swapped=false;
            //for each step,max item will come at the last respective index
            for (int j = 1; j < arr.length-i; j++) {
                if (arr[j]<arr[j-1]){
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped=true;
                }

            }
            //for i=0 if not swapped then it means array is sorted
            // no need to check for other i
            // hence stop the program..
            if (!swapped){
                break;
            }
        }

    }

}
