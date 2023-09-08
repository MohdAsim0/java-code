package RecursionQuestions;

//https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/description/
public class ReduceToZero {
    public static void main(String[] args) {

//        System.out.println(  noOfSteps(14));
//        System.out.println(reducer(123,0));
        System.out.println(numberOfSteps(14));

    }
    public static int numberOfSteps ( int num) {
        int count = 0 ;

        while (num != 0 ) {
            if (num % 2 == 0 ) {
                num = num / 2 ;
            } else {
                num--;
            }
            count++;
        }
        return count;
    }


    static int noOfSteps(int num){
        int ans = 0;
        for (; num > 0; ans++)
            if (num % 2 == 1) num--;
            else num /= 2;
        return ans;
    }


    static int reducer(int n,int steps){
        if(n==0)
            return steps;

        if(n%2==0)
           return  reducer(n/2,steps+1);

        return reducer(n-1,steps+1);

    }

}
