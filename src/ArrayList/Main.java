package ArrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[]  args){

       //Dynamic array Resizable-array implementation of the List interface.
        ArrayList<Integer> A=new ArrayList<Integer>();

        A.add(12);
        A.add(19);
        A.add(14);

        //Print Arraylist
        System.out.println(A);
        System.out.println(A.size());//.size work on implement list interface

        //Prints all values in Arraylist
        int n=A.size();
        for(int i=0;i<n;i++){
            System.out.print( A.get(i)+" ");
        }
    }
}
