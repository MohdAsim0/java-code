package XOR;

public class MissingNumber {
    public static void main(String[] args) {
        int[] nums ={3,0,1};
        int n= nums.length;
        for (int i = 0; i < n; i++) {
            n^=i;
            n^=nums[i];
        }
        System.out.println(n);
    }
}
