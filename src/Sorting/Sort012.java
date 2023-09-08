package Sorting;

public class Sort012 {

    public static void main(String[] args) {
        int arr[]={1,2,2,1,0,0,1,0,2,0};
        sortArray(arr,arr.length);

        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }


    static void sortArray(int[] arr,int n){

        int countzero=0;
        int countone=0;
        int counttwo=0;

        int i=0;

        while (i<n){

            if (arr[i]==0)
            {
                countzero=countzero+1;
            }

            if (arr[i]==1)
            {
                countone=countone+1;
            }

            if (arr[i]==2)
            {
                counttwo=counttwo+1;
            }

            i=i+1;

        }


        i=0;
        while (i<countzero)
        {
            arr[i]=0;
            i=i+1;
        }
        while (i<countzero+countone)
        {
            arr[i]=1;
            i=i+1;
        }

        while (i<countzero+countone+counttwo)
        {
            arr[i]=2;
            i=i+1;
        }

    }
}
