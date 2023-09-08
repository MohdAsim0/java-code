package ArrayNewton;

// Reverse the array
//print sum of even indices after reversing
//print product of odd indices after reversing

import java.util.Scanner;

public class HipHipArray {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size Of the Array: ");
        int n=sc.nextInt();

        //creating an array with memory allocation
        int arr[]=new int[n];

        //Taking array input
        for (int i = 0; i < n; i++)
        {
            arr[i]=sc.nextInt();
        }

        //Reversing array using swap
        int temp=0;
        for (int i = 0; i<n/2; i++)
        {
            temp=arr[i];
            arr[i]=arr[n-i-1];
            arr[n-i-1]=temp;
        }

        //Printing the reversed array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();


        long sum=0,prod=1;//initialise sum and product
        for (int i = 0; i < n; i++)
        {
            if((i+1)%2==0)//1 base indexing
                sum+=arr[i];
            else
                prod*=arr[i];
        }

        //printing sum and product
        System.out.println(sum +" "+ prod);



    }
}
