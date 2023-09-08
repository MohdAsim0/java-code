package Array;

public class PeakElement {
    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 30, 31, 36, 35};
        int n = arr.length;
        System.out.println("the peak element is " + findPeak(arr, n));
//        System.out.println("the peak element is " + findPeakEl(arr, n));

    }

    static int findPeak(int[] arr, int n) {

        if (n == 1)
            return 0;
        //First or last element is Peak element
        if (arr[0] >= arr[1])
            return arr[0];
        if (arr[n - 1] >= arr[n - 2])
            return arr[n-1];

        //Check for every other elements
        for (int i = 1; i < n; i++) {
            if (arr[i] >= arr[i + 1] && arr[i] >= arr[i - 1]) {
                return arr[i];
            }

        }
        return 0;
    }


}
