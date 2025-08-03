package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum3 {
    public static void main(String[] args) {
//        int[]arr={-1,1,2,2,3,3,2,2,4,6,4,-1};
        int[]arr={-1,0,1,2,-1,-4};
        int n=arr.length;
        int target=6;
        threeSum(arr,target,n);

    }

    static void threeSum(int a[],int target,int n){
        Arrays.sort(a);
        int cnt=0;
        for (int i = 0; i<n; i++) {

            if (i==0||a[i]!=a[i-1]){

               int j=i+1,k=n-1;
               int tar=target-a[i];

                while(j<k){
                    //Three Cases
                    if (a[j]+a[k]==tar){
                        System.out.println(a[i]+" "+a[j]+" "+a[k]);
                        cnt++;
                        //Ignoring Duplicates
                        while (j<n&&(a[j]==a[j+1])) j++;
                        while (j<n&&(a[k]==a[k-1])) k--;
                        j++;
                        k--;

                    }
                    else if (a[j]+a[k]<tar) {
                        j++;
                    }
                    else{
                        k--;
                    }
                }

            }

        }
        if (cnt==0)
            System.out.println("No triplets found for target "+target);

    }


    public List<List<Integer>> threeSum(int[] nums,int target) {
        Arrays.sort(nums);
        int n=nums.length;
        List<List<Integer>> ans=new ArrayList<>();

        for(int i=0;i<n;i++){

            if(i==0||(nums[i]!=nums[i-1])){
                int j=i+1,k=n-1;
                //sum  a[i]+a[j]+a[k]=target; =>a[j]+a[k]=target-a[i](which is tar in this case)
                int tar= target-nums[i];

                while(j<k){
                    if(nums[j]+nums[k]==tar){
                        // Found a triplet with zero sum
                        ans.add(Arrays.asList(nums[i],nums[j],nums[k]));

                        while(j<k&&nums[j]==nums[j+1]) j++;
                        while(j<k&&nums[k]==nums[k-1]) k--;

                        j++;
                        k--;
                    }
                    else if(nums[j]+nums[k]<tar){
                        // nums[j]+nums[k] is less than zero, increment j to increase the sum
                        j++;
                    }
                    else{
                        // nums[j]+nums[k] is less than zero, increment j to increase the sum
                        k--;
                    }
                }
            }
        }
        return ans;

    }
}
