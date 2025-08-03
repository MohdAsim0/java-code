package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {8,6,5,4,3,2};
        System.out.println("Array before insertion sort");
        printArray(arr);

        System.out.println("After sorting");
//        insertionSorting(arr,arr.length);
//        printArray(arr);

        insertionSort(arr, arr.length);
        printArray(arr);
    }

    static void insertionSorting(int[] A, int n){
        //this is right b/c in this we are shifting
        for (int i = 1; i < n; i++) {

           int j=i-1;
           int x=A[i];
           while(j>-1&&A[j]>x){
               A[j+1]=A[j];//j+1 basically i
               j--;
           }
            A[j+1]=x;
        }

    }


    static void insertionSort(int[] A, int n){
        for (int i =1; i<n; i++) {
            for (int j = i-1; j>=0; j--) {
                if (A[j]>A[j+1]){
                    swap(A,j,j+1);
                }
                else {
                    break;
                }
            }
        }

    }
    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static void printArray(int[] arr)
    {
        int n = arr.length;
        for(int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }


}
