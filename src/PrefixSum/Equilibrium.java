package PrefixSum;

//equilibrium index
public class Equilibrium {
    public static void main(String[] args) {
        int arr[]={-7,1,5,2,-4,3,0};
        int n=arr.length;
//        System.out.print(equilibriumIndex(arr,n));
        System.out.print(equilibriumIndexO(arr,n));

    }
    
    //Brute Force
    static int equilibriumIndex(int arr[],int n){

        int lsum=0,rsum=0;//intialize

        for (int i = 0; i < n; i++) {//accesing element
            lsum=0;
            for (int j = 0; j < i; j++) {//left sum
                lsum+=arr[j];
            }

            rsum=0;
            for (int j = i+1; j <n ; j++) {//right sum
                rsum+=arr[j];
            }

            if (lsum==rsum){
                return i;
            }

        }
        return -1;
    }
    
    static int equilibriumIndexO(int arr[],int n){

        int totalSum=0;//initializa total sum
        int lsum=0;//initialize leftsum to zero

        //finding sum of whole array
        for (int i = 0; i < n; i++) {
             totalSum+=arr[i];
        }

        for (int i = 0; i < n; i++) {
            totalSum-=arr[i];//right sum for the index i

            //check if lsum==rightsum i.e totalsum
            if (totalSum==lsum)
                return i;

            //update the left sum
            lsum+=arr[i];
        }


        return -1;
    }
}
