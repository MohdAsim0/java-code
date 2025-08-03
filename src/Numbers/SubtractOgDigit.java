package Numbers;

public class SubtractOgDigit {

    public static void main(String[] args) {
        int n = 234;
        System.out.println(product(n));
        System.out.println(sumOfDigits(n));

        System.out.println(product(n)-sumOfDigits(n));
    }

    static int product(int num) {
        int product = 1;
        int temp = num;
        while (temp != 0) {
            product = product * (temp % 10);

//            temp = temp / 10;
            temp /= 10;
        }
        return product;
    }

    static int sumOfDigits(int num) {

        int sum = 0;
        int temp = num;
        while (temp != 0) {
            sum = sum+(temp % 10);

            temp = temp / 10;
        }
        return sum;
    }


}


