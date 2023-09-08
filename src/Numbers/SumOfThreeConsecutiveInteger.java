package Numbers;

//https://leetcode.com/problems/find-three-consecutive-integers-that-sum-to-a-given-number/
public class SumOfThreeConsecutiveInteger {
    public static void main(String[] args) {
//        long res[]= sumOfThree(33);
//        for (int i=0;i<res.length;i++) {
//            System.out.println(res[i]);
//        }

        long res[]= sumOfThree(33);
        for (int i=0;i<res.length;i++) {
            System.out.println(res[i]);
        }

    }

    public static long[] sumOfThree(long num) {
        long ar[]=new long[3];
        if(num%3!=0)
            return new long[0];

        ar[0]=((num/3))-1;      //33/3=11 ,11-1=10, 11+1=12
        ar[1]=((num/3));
        ar[2]=((num/3))+1;

        return ar;

    }

//    public static long[] sumOfThree(long num) {
//
//        long ar[]=new long[3];
//        for (long i =1; i<num; i++) {
//            long j=i+1;
//            long k=i+2;
//            if ((i+j+k)==num){
////                System.out.println(i+" "+j+" "+k);
//                ar[0]=i;
//                ar[1]=j;
//                ar[2]=k;
//            }
//
//        }
//
//        return ar;
//    }

}
