package Numbers;

public class SieveOfErathosthenes {

    public static void main(String[] args) {

        sieveOfEratosthenes(10);
        System.out.println();
        sieveOfEratosthenes(12);
        System.out.println();
        sieveOfEratosthenes(40);

    }

    static void sieveOfEratosthenes(int n){

        boolean[] prime=new boolean[n+1];
        for (int i = 0; i<=n ; i++) {
            prime[i]=true;
        }

        for (int p = 2; p*p<=n ; p++) { //p=2  p=3

            if (prime[p]==true){//p==2  p=3
        //// if a no. is prime then its multiples will not prime

                for (int i = p*p; i<=n ; i+=p) {//i=4  i=6  i=8  i=10   //i=9
                    prime[i]=false; //4=false,6,8,10 // 9=false
                }

            }

        }

        //those are marked true are the prime numbers
        for (int i = 2; i <=n; i++) {
            if (prime[i]==true){
                System.out.print(i+" ");
            }
        }

    }

    //2 to 10 initially true
    //4,6,8,10 false after first iteration
    //9 also false after second iteration

    //remain true
    //2,3,5,7
}
