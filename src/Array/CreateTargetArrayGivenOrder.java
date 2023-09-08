package Array;
//leetcode
import java.util.*;

public class CreateTargetArrayGivenOrder {
    public static void main(String[] args) {
        int nums[]={0,1,2,3,4};
        int index[]={0,1,2,2,1};
        int []target1=createTargetArray1(nums,index);
        System.out.println(Arrays.toString(target1));

    }
   static int[] createTargetArray(int[] nums, int[] index) {

        ArrayList<Integer> a=new ArrayList<Integer>();
        for(int i=0;i<nums.length;i++){
            a.add(index[i],nums[i]);
        }
        int []target=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            target[i]=a.get(i);

        }
        return target;

    }
    //Brute force
    static int[] createTargetArray1(int[] nums, int[] index) {

      int [] target=new int[nums.length];
        for (int i = 0; i <index.length; i++) {
            for (int j = nums.length-1; j>index[i] ; j--) {
                target[j]=target[j-1];
            }
            target[index[i]]=nums[i];
        }
        return target;
    }
}
