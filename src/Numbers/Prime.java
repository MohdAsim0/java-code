package Numbers;

public class Prime {

    public static void main(String[] args) {

//        System.out.println(isPrime(5));
//        System.out.println(isPrime(1));
//        System.out.println(isPrime(0));
//        System.out.println(isPrime(15));
        System.out.println(isPrime(13));

        System.out.println(isPrime1(2));

        System.out.println(isPrime2(13));
//        System.out.println(isPrime2(0));
//        System.out.println(isPrime2(17));
//        System.out.println(isPrime2(22));
    }

    static boolean isPrime(int n){
        //0 and 1 are not prime
        if (n<=1){
            return false;
        }

        for (int i = 2; i <n ; i++) {
            // if n has factor between 2 and n-1 then it is not prime
            if (n%i==0)
                return false;
        }
        return true;
    }

    //OPTIMIZE
    //RUN loop equal to n/2  b/c --> any number is divisible by its half only not more than half
    //ex--> 6 has factor less than equal to 3
    // 12--> has factor less than or equal to 6
    static boolean isPrime2(int n){
        if (n<=1){
            return false;
        }

        for (int i = 2; i <n/2 ; i++) {
            if (n%i==0)
                return false;
        }
        return true;
    }


    static boolean isPrime1(int n){
        if (n<=1){
            return false;
        }

        int cnt=0;
        for (int i = 1; i<=n ; i++) {
            if (n%i==0)
                ++cnt;
        }

        //no. has exact two factor then it is prime
       if (cnt==2)
           return true;
       else
           return false;
    }

    static boolean isPrime3(int n){
        if (n<=1)
            return false;
        for (int i = 2; i*i<=n; i++) {
            if (n%i==0)
                return false;
        }
        return true;
    }

}
