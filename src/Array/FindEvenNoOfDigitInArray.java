package Array;

public class FindEvenNoOfDigitInArray {
    static void findEvenNoOfDigit(int[] ar){
        int count=0;
        String[] str = new String[ar.length];
        for (int i=0;i<ar.length;i++){
            str[i] = String.valueOf(ar[i]);
        }
        for (int i=0;i< str.length;i++){
            String s = str[i];
            if (s.length()%2==0) count++;
        }
        System.out.println(count);
    }


    public static void main(String[] args) {
        int countDigi=0,count=0;
        int[] ar = {9,5,975,9877,6,74};
//        findEvenNoOfDigit(ar);
        for (int i = 0; i < ar.length; i++) {
            int num = ar[i];
            while (num>0){
                num/=10;
                countDigi++;
            }
            if (countDigi%2!=0) countDigi =0;
            if (countDigi%2==0 && countDigi!=0){
                count++;
                countDigi=0;
            }
        }
        System.out.println(count);
    }
}
