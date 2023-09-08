package IFELSE;

import java.util.Scanner;

public class AreaPerimeterGreater {
    public static void main(String[] args) {

//        checkThreeDigitNumber(3433);

//        int n=1000;
//        if (n>9&&n<100) {
//            System.out.println(n+" is a two digit number");
//        }
//        else{
//            System.out.println(n+" is not a two digit no.");
//        }

        //Object of scanner class
//        Scanner sc=new Scanner(System.in);
//
//        System.out.println("enter the length");
//        int l=sc.nextInt();
//        System.out.println("enter the breadth");
//        int b=sc.nextInt();
//
//        int area=l*b;
//        int perimeter=2*(l+b);
//
//        if (area>perimeter){
//            System.out.println("Area is greater than perimeter");
//        }
//        else if (perimeter>area) {
//            System.out.println("Perimeter is greater than Area");
//        }
//        else {
//            System.out.println("Area is equal to the perimeter");
//        }
    }

    static void checkThreeDigitNumber(int n){
        if (n>99&&n<1000) {
            System.out.println(n+" is a three digit number");
        }
        else{
            System.out.println(n+" is not a three digit no.");
        }
    }

}
