package Numbers;

public class Prime1 {
    public static void main(String[] args) {

//        System.out.println(isPrime(12));
//        System.out.println(isPrime(2));
//        System.out.println(isPrime(13));

//        System.out.println(isPrime1(2));
//        System.out.println(isPrime1(7));
//        System.out.println(isPrime1(12));
//        System.out.println(isPrime1(22));

//        System.out.println(isPrime2(2));
//        System.out.println(isPrime2(3));
//        System.out.println(isPrime2(22));

        System.out.println(isPrime3(2));
        System.out.println(isPrime3(22));
        System.out.println(isPrime3(23));
        System.out.println(isPrime3(21));
        System.out.println(isPrime3(33));


    }

   static boolean isPrime(int n){
        if (n<=1)
            return false;
       for (int i = 2; i < n; i++) {
           if (n%i==0)
               return false;
       }
       return true;
   }


   static boolean isPrime1(int n){
        if (n<=1)
            return false;
       for (int i = 2; i <=n/2; i++) {
           if (n%i==0)
               return false;
       }
       return true;
   }


   static boolean isPrime2(int n){
        if (n<=1)
            return false;
       for (int i = 2; i*i<=n; i++) {
           if (n%i==0)
               return false;
       }
       return true;
   }

   static boolean isPrime3(int n){
        if (n<=1)
            return false;

        int cnt=0;
       for (int i = 2; i<=n; i++) {
           if (n%i==0)
               cnt++;
                 }
      if (cnt<=2)
          return true;
      else
          return false;
   }


}
