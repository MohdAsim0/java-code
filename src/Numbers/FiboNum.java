package Numbers;

class FiboNum{

    private static long[] fibonnaciCache;

    public static void main(String[] args){
        //int n=50;// It takes too much time
        //upto 92 it will work fine
        //after that we will get negative values

        int n=5;
        fibonnaciCache=new long[n+1];
//        System.out.println( fibonaciNumber(n));
    //count start from 0

        //to print fibonnaci series
        for(int i=0;i<=n;i++){
            System.out.print( fibonaciNumber(i)+" ");
        }
    }

    static  long  fibonaciNumber(int n){

        if(n<=1){
            return n;
        }

        //if fibonnaciCache has value that we want
        if(fibonnaciCache[n]!=0){
            return fibonnaciCache[n];
        }

        // store the fibonnaci number
        long nthFibonnaciNumber=fibonaciNumber(n-1)+ fibonaciNumber(n-2);

        //store it in the cache array at index n
        fibonnaciCache[n]=nthFibonnaciNumber;

        //return the number simple
        return (nthFibonnaciNumber);

    }

}