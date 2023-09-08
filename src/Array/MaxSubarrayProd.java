package Array;
//https://leetcode.com/problems/maximum-product-subarray/
//Given an integer array nums,
// find a subarray that has the largest product, and return the product.

public class MaxSubarrayProd {
    public static void main(String[] args) {
//        int arr[]={2,3,-2,4};
        int[] arr ={-2,0,-1};
        System.out.println(maxProdSubarray(arr));

    }

    static int maxProdSubarray(int[] arr){
       int maxProd=Integer.MIN_VALUE;
       int prefix=1,suffix=1;

        for (int i = 0; i < arr.length; i++) {//i=0 ,1,2,3,i==4 loop terminates
            if (prefix==0) prefix=1;//no,no,no,no
            if (suffix==0) suffix=1;//no,no,no,no

            prefix=prefix*arr[i];//1*2=2, 2*3=6, 6*-2=-12, -12*4=-48
            suffix=suffix*arr[arr.length-i-1];//1*4=4,4*-2=-8, -8*3=-24,-24*2=-48

            maxProd=Math.max(maxProd,Math.max(prefix,suffix));//(-,(2,4)),,(4,(6,-8)),,(6,(-12,-24)),,(6,(-48,-48))
            //4,6,6,6

        }

        //return maxprod ehis is 6;
        return maxProd;
    }
}
