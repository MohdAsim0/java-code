package IFELSE;
import java.util.*;
public class Questions {
    public static void main(String[] args) {

//        leapYear();
        profitLoss();




//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter the positive Integer: ");
//        int n=sc.nextInt();
//        if (n%2==0)
//            System.out.println("The number "+n+ " is even ");
//        else
//            System.out.println(n+ " is odd");





    }
    static void leapYear(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year to check is it leap or not");
        int year=sc.nextInt();

        if (year%400==0)
            System.out.println(year+" is a leap year");
        else if (year%100==0)
            System.out.println(year+" is not a leap year");
        else if (year%4==0)
            System.out.println(year+" is a leap year");
        else
            System.out.println(year+ " is not a leap year");

    }

    //Que-3
    static void absoluteInteger(){
        int n=-3;
        if (n<0)
            System.out.println(-(n));
    }

    //Que-4
    static void profitLoss() {
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter the sell price");
        int sp=sc.nextInt();
        System.out.println("Enter the cost price");
        int cp=sc.nextInt();

//        int profit=0;//to store profit
        int loss=0;//to store loss

        if (sp>cp){
            System.out.println("seller made profit");
//            profit=sp-cp;
            System.out.println("the profit is "+(sp-cp));
        }
        else if (sp==cp) {
            System.out.println("no loss and no profit");
        }
        else {
            System.out.println("seller incurred loss");
            loss=cp-sp;
            System.out.println("the loss is "+loss);

        }

    }




}

