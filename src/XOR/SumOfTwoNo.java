package XOR;

public class SumOfTwoNo {
    public static void main(String[] args) {
        System.out.println(sum(5,6));
    }

    static  int sum(int a,int b){
        while (b!=0){
            int temp=(a&b)<<1;
            a=a^b;
            b=temp;
        }
        return a;
    }
}
