import java.util.Arrays;

public class RotateArrayJAva {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int k=-3;
        System.out.println("Initial Array---> ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(+arr[i]+" ");
        }

        System.out.println();
        rotateArray(arr,k);
        System.out.println(Arrays.toString(arr)+" "+k+"times");


    }


    static void rotateArray(int [] arr,int k){

        k=k%arr.length;//k not go beyond length

        if (k<0){
            k=k+arr.length;
        }

        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
        reverse(arr,0,arr.length-1);
    }




    public static void reverse(int []arr,int start,int end){
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }

    }
}
