package IFELSE;

import java.util.Scanner;

public class DivisibleQuestions {
    public static void main(String[] args) {
        divisiblebythreeandfive();
    }
    static void divisiblebythreeandfive(){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        if (n%5==0&&n%3==0)
            System.out.println("is divisible by 5 and 3");
        else
            System.out.println("not divisible by 5 and 3");

        // WAP num is divisible by 5 and not by 3
//        if (n%5==0  && n%3!=0)
//            System.out.println("is divisible by 5 and not by 3");
//        else
//            System.out.println(" not satisfying problem");
    }
}
