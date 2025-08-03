package Array1;

import java.util.Arrays;

public class SecondLargestEl {
    public static void main(String[] args) {
        int[] nums={12,32,100,10,34,101}; //ans==34
//        int[] nums={10};
//      int[] nums={10,10,10};
        int n= nums.length;


//        System.out.println(secondLargestElinArray(nums,n));
//        System.out.println(secondLargestElement(nums,n));
        System.out.println(secondLargestElementOptimal(nums,n));

    }

    //Brute
    public static int secondLargestElinArray(int[] arr,int n){
        //if n<2 how will we get second largest
        if(n<2){
            return -1;
        }

        Arrays.sort(arr); //nlogn
        int largest=arr[n-1];
        //for second largest
        for(int i=n-2;i>=0;i--){ //n
            if(arr[i]!=largest){
                return arr[i];
            }
        }
        return -1;
    }

    //Better  Tc==n+n=n
    public static int secondLargestElement(int[] arr,int n){
        //if n<2 how will we get second largest
        if(n<2){
            return -1;
        }

       int largest=Integer.MIN_VALUE;
        //for largest
        for(int i=0;i<n;i++){ //n
            if(arr[i]>largest){
                largest=arr[i];
            }
        }


        int secLargest=Integer.MIN_VALUE;
        //for second largest
        for(int i=0;i<n;i++){//n
            if(arr[i]!=largest && arr[i]>secLargest){
                secLargest=arr[i];
            }
        }

        //Important
        if(secLargest!=Integer.MIN_VALUE){
            return secLargest;
        }
        return -1;
    }

    // Most Optimal
    public static int secondLargestElementOptimal(int[] arr,int n) {
        //if n<2 how will we get second largest
        if (n < 2) {
            return -1;
        }
        int largest=Integer.MIN_VALUE;
        int secLargest=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            if(arr[i]>largest){
                secLargest=largest;
                largest=arr[i];
            } else if (arr[i]>secLargest && arr[i]!=largest) {
                secLargest=arr[i];
            }
        }
        if(secLargest!=Integer.MIN_VALUE){
            return secLargest;
        }
        return -1;
    }


}
