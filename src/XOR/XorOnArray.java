package XOR;
//https://leetcode.com/problems/xor-operation-in-an-array/description/
//You are given an integer n and an integer start.
//Define an array nums where nums[i] = start + 2 * i (0-indexed) and n == nums.length.
//Return the bitwise XOR of all elements of nums.
public class XorOnArray {

    public static void main(String[] args) {
        int n=5;
        int start=0;

        System.out.println(xorOperation(n,start));

    }

    public static int xorOperation(int n, int start) {
        int [] nums=new int[n];
        int a=0;
        for(int i=0;i<n;i++){
            nums[i]=start+(2*i);
            a=a^nums[i];  //since 0^A=A; after that a becomes 'A'
        }
        return a;
    }


}
