package BinarySearch;

public class SearchInRotatedSortedArray {
    public static void main(String[] args) {

        int[] nums={4,5,6,7,0,1,2};
//        System.out.println(findPivot(nums));
//        System.out.println(binarySearch(nums,1,0, nums.length-1));
        System.out.println(search(nums,4));
    }

    static int search(int[] arr,int target){

        int pivot=findPivot(arr);

        // if you did not find a pivot, it means the array is not rotated
        if (pivot==-1){
            return binarySearch(arr,target,0, arr.length-1);
        }

        // if pivot is found, you have found 2 asc sorted arrays
        if (arr[pivot]==target){
            return pivot;
        }

        //search space 0-p-1 b/c all elements after pivot are <start i.e arr[0]
        if (target>=arr[0]){
            return binarySearch(arr,target,0,pivot-1);
        }
        else {
            return binarySearch(arr, target, pivot + 1, arr.length - 1);
            }
    }

    static int binarySearch(int[] arr, int key,int start,int end){
//         start=0;
//         end=arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if (arr[mid]==key)
                return mid;
            else if (arr[mid]>key) {
                end=mid-1;
            }
            else {
                start=mid+1;
            }
        }

        return -1;
    }

    static int findPivot(int [] arr){
        //pivot means how many times sorted array rotated
        int start=0;
        int end=arr.length-1;
        //arr[4,5,6,7,0,1,2]  //pivot is 7  b/c from there next asc array starts

        while(start<=end){
            int mid=start+(end-start)/2;

            //mid can't be last mid+1 give out of bound error && mid>mid+1 ? asc==pivot---mid
            if (mid<end && arr[mid]>arr[mid+1]){
                return mid;
            }

            //mid can't be start mid-1 give out of bound error && mid<mid-1 ? asc==pivot---mid-1
            if ( mid>start && arr[mid]<arr[mid-1]){
                return mid-1;
            }

            //3rd case  [start<mid ] pivot(peak) will always be in [mid+1--end]
            if (arr[mid]>arr[start]){
                start=mid+1;
            }

            //4th case [start>mid ] pivot(peak) will always be in [mid-1--start]
            else {
                end=mid-1;
            }
        }
        //if pivot not found return -1
        return -1;
    }
}
