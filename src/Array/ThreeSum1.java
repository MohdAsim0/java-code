package Array;

public class ThreeSum1 {
    public static void main(String[] args) {

        int[] nums ={12,4,1,6,9,3,10,2};
        int target=24;
        findTriplets(nums,target);

    }


    //BRUTE FORCE TC--O(n^3)  SC=O(1)
    static void findTriplets(int[] arr, int target){
        int n=arr.length;
        int cnt=0;//only to track count of triplets
        for (int i = 0; i < n-2; i++) {

            for (int j = i+1; j <n-1 ; j++) {

                for (int k = j+1; k < n; k++) {

                    if (arr[i]+arr[j]+arr[k]==target){
                        System.out.println("Triplets are "+arr[i]+" "+arr[j]+" "+arr[k]);
                        cnt++;
                    }

                }
            }
        }
        if (cnt==0)
                 System.out.println("No triplets in array");
        else
            System.out.println("total "+cnt+" triplets equal to target!!!!!!!!!!");
    }
}
