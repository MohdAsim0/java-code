package CycleSortQuestions;

public class MissingNumber {
    public static void main(String[] args) {
       int[] nums ={3,0,1};
//        System.out.println(missingNumber(nums));
        System.out.println(missingNumber1(nums));
    }

    public static int missingNumber(int [] nums){
        int i=0;
        int n=nums.length;
        while (i<n){
            int correctPos=nums[i];
            if (nums[i] < n && nums[i] !=nums[correctPos]) {
                swap(nums,i,correctPos);
            } else {
                i++;
            }
        }
        //find the first number missing from it's index
        //that will be our required number
        for (i = 0; i < n; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return n;
    }

    public static int missingNumber1(int[] nums) {
        int n = nums.length;
        int totalSum = n*(n+1)/2;//Total Sum Of Array

        int sum = 0;
        for (int num : nums) {
            sum = sum + num;//array sum without missing number
        }
        return totalSum - sum;//total-sum will be missing no from array
    }

    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
