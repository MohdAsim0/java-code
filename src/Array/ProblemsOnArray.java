package Array;

import java.util.*;

public class ProblemsOnArray {

    public static void main(String[] args) {
//        sumOfArrayElements();
//        compareTwoArrays();
        maxOfArray();
//        minMaxOfArrayRecursive();

    }

    // Calculate sum of all elements of an array
    static void sumOfArrayElements() {

        int sum = 0; //variable to store the sum
        int nums[] = {1, 2, 3, 4, 5, 6};//array given

        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        System.out.println(sum);
    }


    static void compareTwoArrays() {

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};

        // Checking if above two arrays are equal
        // using equals() method

//        if (Arrays.equals(arr1, arr2))
//            System.out.println("same");
//        else
//            System.out.println("not same");


//       How to Deeply Compare Array Contents?
        Object inarr1[] = {arr1};
        Object inarr2[] = {arr2};

//        if (Arrays.equals(inarr1, inarr2))
//            System.out.println("same");
//        else
//            System.out.println("not same");

//        So Arrays.equals() is not able to do a deep comparison.

//      Java provides another method for this Arrays.deepEquals() which does the deep comparison.

        if (Arrays.deepEquals(inarr1, inarr2))
            System.out.println("same");
        else
            System.out.println("not same");

    }

    static void maxOfArray() {
        // ARRAY
        int[] arr = {1, 423, 6, 46, 34, 23, 13, 53, 4};
        int n = arr.length;

        //METHOD 1
//        sort the array
//        Arrays.sort(arr);
//        max element i.e last element
//        System.out.println("max element : " +arr[arr.length-1]);
//        min element i.e 1st element
//        System.out.println("min element : " +arr[0]);

        //METHOD 2
//        int ans=0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > ans) {
//                ans = arr[i];
//            }
//
//        }
//        System.out.println(ans);


        //  METHOD 3
        int res = arr[0];
        for (int i = 1; i < n; i++) {
            res = Math.max(res, arr[i]);
//            res = Math.min(res, arr[i]);
        }
        System.out.println(res);


    }

    //METHOD 4 RECURSION for max and min elements
    static void minMaxOfArrayRecursive() {
        int[] arr1 = {1, 2, 7, 5, 4, 9};
        int n = arr1.length;
        System.out.println(getMax(arr1, 0, n));
    }

    static int getMin(int arr[], int i, int n) {
        // If there is single element, return it.
        // Else return minimum of first element and
        //  remaining array element.
        return (n == 1) ? arr[i] : Math.min(arr[i], getMin(arr, i + 1, n - 1));

    }

    static int getMax(int arr[], int i, int n) {
        // If there is single element, return it.
        // Else return maximum of first element and
        //  remaining array element.
        return (n == 1) ? arr[i] : Math.max(arr[i], getMax(arr, i + 1, n - 1));

    }


}

