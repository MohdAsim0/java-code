package BinarySearch;

public class Floor{
    public static void main(String[] args) {
        int arr[]={2,3,5,9,14,16,18};
        int target=13;
        int ans=floor(arr,target);
        System.out.println(ans);

    }

    //Smallest element in array greater or equal to target
    static int floor(int []arr,int target){

        //if target is greater than array last element
        if (target>arr[arr.length-1]){
            return -1;
        }

        int start=0;
        int end=arr.length-1;

        while (start<=end){
            int mid=start+(end-start)/2;

            if (arr[mid]==target)
                return mid;
            else if (target>arr[mid])
                start=mid+1;
            else if(target<arr[mid])
                end=mid-1;

        }
        return end;
    }
}

