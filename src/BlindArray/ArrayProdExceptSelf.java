package BlindArray;

import java.util.Arrays;

public class ArrayProdExceptSelf {

    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4};
//        System.out.println(Arrays.toString(productExceptSelf(arr)));

        int arr[] = {1, 2,3,4};
        System.out.println(Arrays.toString(productExceptSelf1(arr)));
        System.out.println(Arrays.toString(productExceptSelf2(arr)));


    }

    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] prodAr = new int[n];

        for (int i = 0; i < n; i++) {
            int prod = 1;
            for (int j = 0; j < n; j++) {
                if (i == j) continue;
                prod = prod * nums[j];
            }
            prodAr[i] = prod;
        }

        return prodAr;
    }

    public static int[] productExceptSelf1(int[] arr) {
        int n = arr.length;
        int[] product = new int[n];

        int[] prefix = new int[n];
        prefix[0] = 1; // since first element can have no prefix
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] * arr[i - 1];
        }
        int[] suffix = new int[n];
        suffix[n - 1] = 1; // since last element can have no suffix
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * arr[i + 1];
        }
        // Building Product Array
        for (int i = 0; i < n; i++) {
            product[i] = prefix[i] * suffix[i];
        }

        return product;
    }

    public static int[] productExceptSelf2(int[] arr) {
        int n = arr.length;
        int[] product = new int[n];

        int productOfAllBeforeCurrent=1;
        int productOfAllAfterCurrent=1;


        for (int i = 0; i < n; i++) {
            product[i]=productOfAllBeforeCurrent;
            productOfAllBeforeCurrent *= arr[i];
        }

//        System.out.println(Arrays.toString(product));

        for (int i = n-1; i >=0; i--) {
                product[i] *= productOfAllAfterCurrent;
                productOfAllAfterCurrent *= arr[i];
        }

        return product;
    }

}
