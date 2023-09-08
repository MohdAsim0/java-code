package Array;

//LEFT ROTATION OF ARRAY  BRUTE FORCE
public class RoatateArrayBasic {

    static void rotate_Once(int arr[]){

        //Store first array value in temp
        int temp=arr[0];

        //loop fron 1 to n and store in previous index
        for (int i = 1; i <arr.length ; i++) {
             arr[i-1]=arr[i];
        }
        //put temp value in last index
        arr[arr.length-1]=temp;
    }

  static void rotate(int a[],int k){         //TC=O(N*k)
        k=k%a.length;

        //it means right rotate
        if (k<0){
            k=k+a.length;
        }

        //rotate array k times
      for (int i = 0; i < k; i++) {
          rotate_Once(a);
      }

  }

    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
//        rotate_Once(a);
        rotate(a,3);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }

    }
}
