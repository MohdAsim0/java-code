package Array;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/

public class findEvenDigit__Array {
    public static void main(String[] args) {
        int arr[]={326,4,2,6,334,12343};
//        System.out.println(findNumbers(arr));
        System.out.println(findNumbers1(arr));
//        System.out.println(digits1(1234));
    }

    static int findNumbers(int [] nums){
        int count=0;
        for(int num:nums){
        if(even(num)){
            count++;
                 }
          }
        return count;
     }

     static boolean even(int nums) {
        int noOfDigits=digits(nums);
        if(noOfDigits%2==0){
            return true;
        }
        return false;

    }

    static int digits(int number){
        int cnt=0;
        while(number>0){
            cnt++;
            number=number/10;
        }
        return cnt;
    }

    //METHOD 2
    static int digits1(int number){
       String s=Integer.toString(number);
       int cnt=s.length();
       return cnt;
    }

    static boolean even1(int nums) {
        int noOfDigits=digits1(nums);
        if(noOfDigits%2==0){
            return true;
        }
        return false;

    }
    static int findNumbers1(int [] nums){
        int count=0;
        for(int num:nums){
            if(even1(num)){
                count++;
            }
        }
        return count;
    }

}
