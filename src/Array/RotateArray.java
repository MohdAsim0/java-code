package Array;

public class RotateArray {
    public static void main(String[] args) {
        int[] ar = {1,2,3,4,5,6,7};
        int d = 3;
        rotateArrayDTimes(ar,d,ar.length);
    }

    private static void rotateArrayDTimes(int[] ar, int d, int length) {
        int[] temp = new int[length];
        int j=0;
        for (int i = d; i < length; i++) {
            temp[j++] = ar[i];
        }
        for (int i = 0; i < d; i++) {
            if (j<=length) temp[j++] = ar[i];
        }
        for (int ele:temp) {
            System.out.print(ele+" ");
        }
    }

}
