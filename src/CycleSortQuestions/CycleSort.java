package CycleSortQuestions;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
//        int[] arr={3,5,4,1,2};
        int[] arr={3,5,4,1,2};

        cycleSort(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void cycleSort(int[] arr) {

        int i = 0;

        while (i < arr.length) {
            int correctPos = arr[i] - 1;

            if (arr[i]<= arr.length && arr[correctPos] != arr[i]) {
                swap(arr, i, correctPos);
            } else {
                i++;
            }

        }
    }

    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
