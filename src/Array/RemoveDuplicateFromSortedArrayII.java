package Array;
//https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/
//Given an integer array nums sorted in non-decreasing order,
// remove some duplicates in-place such that each unique element appears at most twice.
// The relative order of the elements should be kept the same
//Return k after placing the final result in the first k slots of nums.

public class RemoveDuplicateFromSortedArrayII {
    public static void main(String[] args) {

        int[]arr={0,0,1,1,1,1,2,3,3};
        int k=removeDuplicates(arr);
        System.out.println(k);

        for (int i = 0; i < k; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static int removeDuplicates(int[] nums) {

        //Edge Case
        if(nums.length<3)
            return nums.length;


        int in=2;

        for(int i=2;i<nums.length;i++){

            if(nums[i]!=nums[in-2]){
                nums[in++]=nums[i];
            }

        }
        return in;
    }
}
