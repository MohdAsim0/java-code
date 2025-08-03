package Array;

import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfArray {
    public static void main(String[] args) {

        int[] arr1={1,2,2,3,4,1};
        int[] arr2={2,2,3,4};

        System.out.println(Arrays.toString(intersection(arr1,arr2)));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int n : nums1) {
            set1.add(n);
        }

        for (int n : nums2) {
            if (set1.contains(n))
                set2.add(n);
        }

        int[] result = new int[set2.size()];
        int index = 0;
        for (int n : set2) {
            result[index++] = n;
        }

        return result;
    }

}
