package ArrayNewton;
//insert at position 1 in the unsorted array
//Approach-->Shift all elements to the right from position to the right


import java.util.Scanner;

public class InsertionInUnsortedArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n=sc.nextInt();

        int[] arr =new int[n];
        //we need space to insert an element so we take input to n-1
        System.out.println("Please add elements one less than length of array");
        for (int i = 0; i<n-1; i++) {
            arr[i]=sc.nextInt();
        }

        int pos=1,key=6;
        //from last to = pos we make right shift
        for (int i = n-2; i>=pos ; i--) {
            arr[i+1]=arr[i];
        }

        //at index pos we insert key
        arr[pos]=key;

        System.out.println("Array after inserting "+key+" at index "+pos);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }

    }

}
