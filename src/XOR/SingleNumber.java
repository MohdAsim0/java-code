package XOR;

import java.util.Arrays;
import java.util.HashMap;

public class SingleNumber {
    public static void main(String[] args) {
        int []arr={2,2,1,4,5,4,1};
        System.out.println(singleNumber(arr));
        System.out.println(singleNumber1(arr));
        System.out.println(singleNo(arr));
    }

    public static int singleNumber(int[] nums) {
        //Duplicate Values(even frequency)=XOR=0
        //Single Value Xor=Single Value
        int ans=0;//0 ,2, 0
        for (int num : nums)//2,,2,,1
            ans ^= num;//0^2=2,, 2^2=0;,,0^1=1

        return ans;//1 returned whis is a single value

        //O(n)
        //O(1)
    }

    public static int singleNumber1(int[] nums) {
        Arrays.sort(nums);
    //each element in the array appears twice except for one element which appear only once
        for (int i =1; i<nums.length-1; i+=2) {
            if (nums[i]!=nums[i-1]){
                return nums[i];
            }
        }
        return nums[nums.length-1];

//        O(n(logn))
//        O(1)

    }

    public static int singleNo(int [] nums){

        HashMap<Integer,Integer> map=new HashMap<>();
        //key--no in the given value
        //value--count of those numbers
//        arr[]={2,2,1};

        for (int num:nums) {
            if (map.containsKey(num)){//2-no //2--yes //1 No //no element left out of loop
                map.put(num,map.get(num)+1);//increse count by 1 //count=2
            }
            else {
                map.put(num,1);//put 2--1 //put 1--1
            }
        }

        for (int num:nums) { //2
            if (map.get(num)==1){//is count of 2==1 no b/c it is 2 //1==1
                return num;//1
            }
        }
        //if no key has count 1 return 0
        return 0;
    }
    //TC=O(n)
    //SC=O(n)
}
