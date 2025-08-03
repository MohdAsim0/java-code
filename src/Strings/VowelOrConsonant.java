package Strings;

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character");
      char charac=sc.next().charAt(0);
//        char charac='a';



        if (charac =='a'|| charac=='e' || charac=='i' || charac=='o' || charac=='u' ||
                charac=='A' ||charac=='E' ||charac=='I'||charac=='O'||charac=='U'){
            System.out.println("Vowel");
        }
        else{
            System.out.println("Consonant");
        }




    }
}
