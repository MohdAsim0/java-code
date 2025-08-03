package Array;
//https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/
//Given an integer array nums sorted in non-decreasing order,
// remove the duplicates in-place such that each unique element appears only once.
// The relative order of the elements should be kept the same.
// Then return the number of unique elements in nums

public class RemoveDuplicateFromSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2};
        System.out.println(removeDuplicates(arr));
        System.out.println(removeDuplicates1(arr));

    }

    public static int removeDuplicates(int[] nums) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {

            if (i < n - 1 && nums[i] == nums[i + 1]) {
                //skip
                continue;
            }
            nums[count++] = nums[i];

        }
        return count;
    }


    //We can think of using two pointers ‘i’ and ‘j’, we move ‘j’ till we don’t get a number arr[j] which is different from arr[i].
    // As we got a unique number we will increase the i pointer and update its value by arr[j].
    public static int removeDuplicates1(int[] nums) {
        int j = 1;//because we have to return the size
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
