package Array;
//https://leetcode.com/problems/maximum-subarray/

public class MaxSubarraySum {
    public static void main(String[] args) {
        int arr[]={-2,1,-3,4,-1,2,1,-5,4};
//        maxSubarray(arr);
//        maxSubarray1(arr);
        System.out.println(maxSubarraySum(arr,arr.length));
    }


    static int maxSubarraySum(int arr[],int n){
    //KADANE'S ALGORITHM
        int sum=0;
        int maxi=Integer.MIN_VALUE;

        for (int i = 0; i<n; i++) {
            //add element to sum  if sum>=0
            if (sum>=0) {
                sum += arr[i];
            }

            //if sum is negative return that element
            if (sum < 0) {
                sum = arr[i];
            }

            //if sum>maxi  add sum to maxi
            if (sum >maxi) {
                maxi = sum;
            }
        }

        return maxi;
    }

    static void maxSubarray(int arr[]){
        //BRUTE FORCE O(N^3) SC=O(1)
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length ; j++) {

                int sum=0;
                for (int k = i; k<=j ; k++) {
                    sum+=arr[k];
                }
                max=Math.max(sum,max);

            }

        }
        System.out.println(max);
    }

    static void maxSubarray1(int arr[]){
        //BETTER SOLUTION O(N^2) SC=O(1)
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum=0;
            for (int j = i; j < arr.length ; j++) {
                sum+=arr[j];
                max=Math.max(sum,max);
            }

        }
        System.out.println(max);
    }

}
