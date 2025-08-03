package ArrayNewton;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n=sc.nextInt();
        System.out.println("Enter the Elements of the array: ");
        int arr[]=new int[n];

        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the Key Element: ");
        int key=sc.nextInt();

        System.out.println("Key element is present at Index: "+Linear_Search(arr,key,n));


//        int array[]={5,2,1,-5,-7,47,33};
//        int key=47;
//        System.out.println(Linear_Search(array,key,n));

    }

    static int Linear_Search(int[]arr,int key,int n){

//        int n=arr.length;
        for (int i = 0; i < n; i++) {
            if(arr[i]==key)
                return i;
        }
        return -1;
    }
}
