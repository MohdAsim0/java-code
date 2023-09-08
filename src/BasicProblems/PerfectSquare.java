package BasicProblems;

import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n=sc.nextInt();

        int flag=0;

        for(int i=1;i<=n/2;i++){
            if (n==i*i){
                flag=1;
                break;
            }
        }
        if (flag==1)
            System.out.println("perfect Square");
        else
            System.out.println("Not a Perfect Square");





    }
}
