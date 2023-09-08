package Array;
//https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/

import java.util.Arrays;
import java.util.HashMap;

public class DuplicateElement {
    public static void main(String[] args) {
        int arr[]={0,0,1,1,1,2,2,4};
        int n=removeDuplicates(arr);
//        System.out.println(removeDuplicates(arr));
        System.out.println(Arrays.toString(arr));

//        int arr[]={1,2,3,5};
//        System.out.println(containsDuplicate(arr));

    }

    static int removeDuplicates(int[] nums) {
        // Length of the updated array
        int count = 0;

        // Loop for all the elements in the array
        for (int i = 0; i < nums.length; i++) {
            // If the current element is equal to the next element, we skip
            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                continue;
            }
            // We will update the array in place
            nums[count] = nums[i];
            count++;
        }

        return count;
    }


//        int arr[]={1,2,1,3,2,1,2};
//        Arrays.sort(arr);
//        int n=arr.length;
//        for (int i = 0; i <n-1; i++) {
//                if (arr[i]==arr[i+1]){
//                    System.out.print(arr[i]);
//                }
//        }



        static boolean containsDuplicate(int[] nums) {
            HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
            for(int i=0;i<nums.length;i++){
                if(hm.containsKey(nums[i])){
                    return true;
                }
            else
            {
                hm.put(nums[i],i);
            }
        }
        return false;

    }

}
