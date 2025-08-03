package Array;
//https://leetcode.com/problems/count-pairs-whose-sum-is-less-than-target/description/
//Given a 0-indexed integer array nums of length n and an integer target,
// return the number of pairs (i, j) where 0 <= i < j < n and nums[i] + nums[j] < target.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PairsSumLessThanTarget {
    public static void main(String[] args) {

//        Integer [] arr={-1,1,2,3,1};
//        Integer [] arr={-6,2,5,-2,-7,-1,3};
////        System.out.println(Arrays.asList(arr));
//        int target=2;
//        System.out.println(countPairs(Arrays.asList(arr),target));

        ArrayList<Integer> arr1=new ArrayList<>();
        arr1.add(-6);
        arr1.add(2);
        arr1.add(5);
        arr1.add(-2);
        arr1.add(-7);
        arr1.add(-1);
        arr1.add(3);
//        System.out.println(arr1.size());
////        System.out.println(arr.get(0)+arr.get(6));
//
        int target=-2;
        System.out.println(countPairs(arr1,target));


    }


    //TC O(NlogN) SC=O(1)
    public static int countPairs(ArrayList<Integer> nums, int target) {
        int n = nums.size();
        Collections.sort(nums);
        int l = 0;
        int r = n - 1;
        int countPairs = 0;

        while (l < r) {

            int sum = nums.get(l) + nums.get(r);
            if (sum < target) {
                countPairs += r-l; //array is sorted 0+last<target  then 0+last-1<target,,0+last-2<target
                //l _ _ _ r ---> r-l = 4-0 = 4 pairs (l,r)(l,_)(l,_)(l,_)
                l++;
            }
            else {//sum>=target
                r--;
            }
        }

        return countPairs;

    }

    //N^2
    public static int countPairs1(List<Integer> nums, int target) {
        int s = 0;
        for(int i=0; i<nums.size()-1; i++){
            for(int j=i+1; j<nums.size(); j++){
                if(nums.get(i)+nums.get(j)<target) s++;
            }
        }
        return s;
    }
}
