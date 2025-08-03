package Array;

import java.util.Arrays;

public class PrintDuplicateElements {
    public static void main(String[] args) {


        int[] arr = {1, 2, 1, 3, 2, 1, 2,3,3,4,4,4};
        Arrays.sort(arr);
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                System.out.print(arr[i] + " ");
            }

        }
    }
}
