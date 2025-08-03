package CycleSortQuestions;
//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
import java.util.ArrayList;
import java.util.List;

public class FindDissapearedElemInArray {
    public static void main(String[] args) {
//        int [] nums={4,3,2,7,8,2,3,1};
        int [] nums={1,1};
        System.out.println(findDisappearedNumbers(nums));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        int i=0;
        int n=nums.length;
        while(i<n){
            int correctPos=nums[i]-1;
            if(nums[i]<=n && nums[i]!=nums[correctPos]){
                swap(nums,i,correctPos);
            }
            else{
                i++;
            }
        }

        List<Integer> ans =new ArrayList<>();
        for(int in=0;in<n;in++){
            if(nums[in]!=in+1){
                ans.add(in+1);
            }
        }
        return ans;
    }

    static void swap(int[] arr,int first,int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
