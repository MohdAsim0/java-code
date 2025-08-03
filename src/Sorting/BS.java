package Sorting;

public class BS {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        bubbleS(arr);
       for(int n:arr){
           System.out.print(n+" ");
       }

    }

    static void bubbleS(int[] arr) {
        boolean isSwapped;
        for (int i = 0; i < arr.length; i++) {
            isSwapped=false;
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    isSwapped=true;
                }
            }
            //for i=0 if not swapped then it means array is sorted
//            no need to check for other i
            if(!isSwapped){
                break;
            }
        }

    }
}
