package ArrayNewton;

public class Revision {

    public static void main(String[] args) {
        int arr[]={-44,43,22,3,41,-5};
        maxOfArray1(arr);

    }

    static void maxOfArray(int arr[]){

        int res=arr[0];
        for(int i=1;i<arr.length;i++){
            res=Math.max(res,arr[i]);
        }
        System.out.println(res);

    }

    static void maxOfArray1(int arr[]){

        //to take minimum integer value
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
           if(arr[i]>ans){
               ans=arr[i];
           }
        }
        System.out.println(ans);

    }
}
