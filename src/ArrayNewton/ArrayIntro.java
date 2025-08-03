package ArrayNewton;

import java.util.Scanner;

public class ArrayIntro {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size Of the Array");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the Elements Of Array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("the sum of all the array elements are: " + sumOfArrayElement(arr, n));
        System.out.println("the product of all the array elements are: " + productOfArrayAllElements(arr, n));

    }

    static int sumOfArrayElement(int[] arr, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {

            //sum=sum+arr[i]    //Creating a copy of sum every time---SC=O(N)
            sum += arr[i];
            //O(1)---No copy createds
        }
        return sum;

    }

    static int productOfArrayAllElements(int arr[], int n) {
        int prod = 1;
        for (int i = 0; i < n; i++) {
            prod *= arr[i];
        }
        return prod;
    }
}
