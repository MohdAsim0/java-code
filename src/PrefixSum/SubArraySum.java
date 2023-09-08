package PrefixSum;
//Q--> return true if any subArray with sum zero

import java.util.HashSet;

public class SubArraySum {
    public static void main(String[] args) {
//        int[] nums = { 3, 4, -7, 3, 1, 3, 1 };
        int[] nums = { 4,2,-3,1,6};
        int n=nums.length;
        subarraySumZero(nums,n);
//        System.out.println( subarray1SumZero(nums,n));
//        System.out.println(subarrSumZero(nums,n));
    }


    //OPTIMIZE APPROACH   return true if any  subArray with sum zero found else false.
    static boolean subarrSumZero(int []arr,int n){

        HashSet<Integer> set = new HashSet<Integer>();//set to check repeated prefix sum
        int sum=0;
        for(int i=0;i<n;i++){

            sum+= arr[i];//prefix Sum

            // Return true in following cases
            // a) Current element is 0
            // b) sum of elements from 0 to i is 0
            // c) sum is already present in hash set
            if (arr[i]==0||sum==0||set.contains(sum))//O(1)
                return true;
            set.add(sum); //adding sum in each iteration to set then it check sum is in set or not

        }
      return false;
    }


    //Brute Force  to print subarray whose sum is zero
    static void subarraySumZero( int arr[],int n){

        for (int i = 0; i < n; i++) {
            int sum=0;
            for (int j = i; j <n ; j++) {
                sum+=arr[j];

                if (sum==0)
                    System.out.println("Subarray["+i+".."+j+"]");
            }
        }

    }

   static boolean  subarray1SumZero( int arr[],int n){

        for (int i = 0; i < n; i++) {
            int sum = arr[i];
            if (sum==0)   //sum found single index subArray zero
                return true;

            for (int j = i+1; j <n ; j++) {
                sum+=arr[j];
                if (sum==0)
                    return true;
            }
        }
        return false;

    }
}
