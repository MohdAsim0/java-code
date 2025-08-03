package Sorting;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] nums = {3, 5, 1, -2, 3, -55, 44, 33};
//        System.out.println(maxElement(nums,0,nums.length));
        selectionSort(nums);
        for (int n : nums) {
            System.out.print(n+" ");
        }

        //to get string representation of the array after sorting
        System.out.println(Arrays.toString(nums));

    }


    //TC=O(N^2)(BEST AND WORST)  SC=O(1)
    static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {  //N
            //last will specify the correct position where max element to be placed....
            int last = arr.length - i - 1;

            //find the index of maximum element in array
            int largest = maxElementIndex(arr, 0, last);//N

            //swap the largest and last index element
            swap(arr, largest, last);//O(1)
        }

    }

    static int maxElementIndex(int[] arr, int start, int end) {
        int max = start;
        //i<=end because last len-1;
        for (int i = start; i<=end ; i++) {
            if (arr[max] < arr[i]) {
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
