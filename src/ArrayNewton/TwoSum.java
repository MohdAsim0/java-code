package ArrayNewton;
//Que--> GIVEN AN ARRAY AND TARGET...FIND ME count of pairs such that sum==TARGET
import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
//        int a[]={0,-1,2,-3,1,-1};
//        int target=-2;
        int[] a ={2,7,4,5,11,15};
        int target=44;
        System.out.println(two_sum1(a,target));

    }

    //BRUTE FORCE O(N^2) O(1)
    static int two_sum(int[] arr, int target){
        int count=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i]+arr[j]==target){
                    ++count;
                }
            }
        }

      return count;
    }

    // Time complexity: O(n*log(n))
    static int two_sum1(int[] arr, int target){

        int count=0;

        Arrays.sort(arr);

        int l=0;
        int r=arr.length-1;

        while(l<=r){

            if(arr[l]+arr[r]==target)
            {
                ++count;
                l++;
                r--;
            }
            else if (arr[l]+arr[r]<target)
            {
                l++;
            }
            else{
                r--;
            }


        }

      return count;

    }
}
