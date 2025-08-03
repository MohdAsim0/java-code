package Array;
//https://leetcode.com/problems/two-sum/description/


import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums ={0,-1,2,-3,1,-1};
        int target=-2;
//       System.out.println(Arrays.toString(twoSum(nums, target)));
//       System.out.println(twoSum(nums,target));   //for counting pairs
        System.out.println(Arrays.toString(twoSum1(nums, target)));
        twoSum2(nums,target);



    }

    //BRUTE FORCE O(N^2) O(1)
    static int[] twoSum(int[] arr,int target){
        int n= arr.length;
        for (int i = 0; i <n ; i++) {
            for (int j =i+1; j<n; j++) {
                if (arr[i]+arr[j]==target) {
                    return new int[]{i, j};
//                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
        return new int[]{};
    }

//Tc--O(N) Sc-->O(N)
    static int[] twoSum1(int[] arr,int target) {
        //Map for <Element,index>
        HashMap<Integer, Integer> map = new HashMap<>();

        //iterate over array
        for (int i = 0; i < arr.length; i++) {
//            int num = arr[i];
//            int rem = target - num;//num+rem==target ==>rem=target-num
            int rem=target-arr[i];

            if (map.containsKey(rem)) {
                return new int[]{map.get(rem),i};
            }
            map.put(arr[i],i);
        }
        return new int[]{};
    }

    //print the index of two element with sum==target
    static void twoSum2(int []arr,int target){

        int []ans=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int rem=target-arr[i];
            if (map.containsKey(rem)){
                ans[0]=map.get(rem);
                ans[1]=i;
            }
            map.put(arr[i],i);
        }
        System.out.println(ans[0]+" "+ans[1]);
    }



}
