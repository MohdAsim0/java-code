package Numbers;

public class CountPrimes {
    public static void main(String[] args) {
//        System.out.println(isPrime(2));
///TLE IN LEETCODE
        int N=1;
        if (N<=1){
            System.out.println("Not a prime");
        }
        int cnt=0;
        for(int i=2;i<N;i++){
            if(isPrime(i))
                cnt++;
        }

        System.out.println(cnt);

    }


    static  boolean isPrime(int n){
        if (n<=1)
            return false;
        for (int i = 2; i*i<=n; i++) {
            if (n%i==0)
                return false;
        }
        return true;
    }
}
