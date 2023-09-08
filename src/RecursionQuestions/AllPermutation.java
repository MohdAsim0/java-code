package RecursionQuestions;

//import java.util.Scanner;

public class AllPermutation {

    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String s=sc.next();
        int arr[]={1,2,3};
        permutations(arr,0);


    }

    static void permutations(int [] ar,int fi){

        //Base Condition
        if (fi==ar.length-1) {
            System.out.println(ar);
            return;
        }


        for (int i = fi; i<ar.length ; i++) {
            swap(ar,i,fi);
            permutations(ar,fi+1);
            swap(ar,i,fi);

        }

    }

    static void swap(int [] ar,int i,int fi){
        int temp=ar[i];
        ar[i]=ar[fi];
        ar[fi]=temp;
    }

}
