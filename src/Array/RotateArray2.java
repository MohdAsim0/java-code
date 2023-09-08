package Array;

public class RotateArray2 {
    public static void main(String[] args) {
        int nums[]={1,2,3,4,5,6,7};
        int k=3;
        int n=nums.length;
        leftRotate(nums,3,n);
        printArray(nums,n);


    }

    static void leftRotate(int arr[], int k, int n) {

        //creating a temp array of size d
        int temp[] = new int[k];

        //copying first k element in array temp
        for (int i = 0; i<k; i++) {
            temp[i] = arr[i];
        }

        // Moving the rest element to index
        // zero to N-k
        for (int i = k; i < n; i++) {
            arr[i -k] = arr[i];
        }

        // Copying the temp array element
        // in original array
        for (int i = 0; i<k; i++) {
            arr[i + n - k] = temp[i];
        }
    }

    static void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }





}
