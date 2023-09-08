package Array;

public class RotateArray1 {
    public static void main(String[] args) {
    int nums[]={1,2,3,4,5,6,7};
    int k=3;
    int n=nums.length;
//   rotateR(nums,k);
    rotateL(nums,k);
    printArray(nums,n);
    }


    public static void rotateR(int[] nums, int k) {
        //if k> nums.length then k%nums.length will bring k back to the range
        k=k%nums.length;
        reverse(nums,0,nums.length-1);//reverse whole array
        reverse(nums,0,k-1);//reverse 0 to k-1
        reverse(nums,k,nums.length-1);//reverse from k to n-1

    }
    public static void rotateL(int[] nums, int k) {
        k=k%nums.length;//after n rotation again it will start from 1

        if (k<0){
            k=k+ nums.length;
        }

        reverse(nums,0,k-1);//reverse from 0 to k-1
        reverse(nums,k, nums.length-1);//reverse from k to n-1
        reverse(nums,0,nums.length-1);//reverse whole array 0 to n
    }

    public static void reverse(int []nums,int start,int end){
        while (start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }

   static void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
