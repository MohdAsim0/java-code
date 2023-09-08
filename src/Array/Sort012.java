package Array;

public class Sort012 {
    public static void main(String[] args) {

        int arr[]={2,1,2,0,1,2,1,2,0,0,0,1};
//        sort012(arr);
        sortColors(arr);
    }

    public static  void sortColors(int[] arr) {
        //TC=O(N)  SC=O(1)
        int low=0;
        int mid=0;
        int high= arr.length-1;

        while (mid<=high){
            if (arr[mid]==0){
                //swap low and mid  and low++ and mid++
                int temp=arr[mid];
                arr[mid]=arr[low];
                arr[low]=temp;
                low++;
                mid++;
            }
            else if (arr[mid]==1) {
                //move mid to 1
                mid++;
            }
            else{
                //if arr[mid]==2 then swap mid and high  and high--
                int temp=arr[mid];
                arr[mid]=arr[high];
                arr[high]=temp;
                high--;
            }
        }
        System.out.println("Array after sorting");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }

    static void sort012(int nums[]){

        //Brute Force  //TC=O(2N) SC=O(1)
         int count0=0;
         int count1=0;
         int count2=0;

         for(int i=0;i<nums.length;i++){
             if(nums[i]==0)
              {
             count0++;
             }

             if(nums[i]==1)
             {
             count1++;
               }

             if(nums[i]==2)
             {
             count2++;
              }
         }

         for(int i=0;i<count0;i++){
             nums[i]=0;
         }

         for(int i=count0;i<count0+count1;i++){
             nums[i]=1;
         }

         for(int i=count0+count1;i<nums.length;i++){
             nums[i]=2;
         }

        System.out.println("Array after sorting");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+"  ");
        }

    }

}
