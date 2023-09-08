//    import java.io.*;
    import java.util.*;
    class Solution {
        private void recurPermute(int fi, int[] nums, List < List < Integer >> ans) {
            if (fi == nums.length) {
                // copy the ds to ans
                List < Integer > ds = new ArrayList < > ();
                for (int i = 0; i < nums.length; i++) {
                    ds.add(nums[i]);
                }
                ans.add(new ArrayList < > (ds));
                return;
            }
            for (int i = fi; i < nums.length; i++) {
                swap(i, fi, nums);
                recurPermute(fi + 1, nums, ans);
                swap(i, fi, nums);
            }
        }
        private void swap(int i, int j, int[] nums) {
            int t = nums[i];
            nums[i] = nums[j];
            nums[j] = t;
        }
        public List < List < Integer >> permute(int[] nums) {
            List < List < Integer >> ans = new ArrayList < > ();
            recurPermute(0, nums, ans);
            return ans;
        }
    };
    
    public class TUF {
        public static void main(String[] args) {
            int nums[] = {1,2,3};
            Solution sol = new Solution();
            List < List < Integer >> ls = sol.permute(nums);
            System.out.println("All Permutations are");
            for (int i = 0; i < ls.size(); i++) {
                for (int j = 0; j < ls.get(i).size(); j++) {
                    System.out.print(ls.get(i).get(j) + " ");
                }
                System.out.println();
            }
        }
    }

