public class MaxSubarray {

    public static void main(String[] args) {
        int [] arr={-2};
        System.out.println(maxSubarraySum1(arr));
    }

    static int maxSubarraySum(int[] arr){
        int  n=arr.length;
        int max=Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int sum=0;
                for (int k =i; k<j ; k++) {
                    sum+=arr[k];
                }
                max= Math.max(max,sum);
            }
        }
        return max;
    }
    static int maxSubarraySum1(int[] arr){
        int  n=arr.length;
        int max=Integer.MIN_VALUE;
        int sum=0;

        for(int i=0; i<n; i++) {
            if (sum>=0) {
                sum += arr[i];
            }

            if (sum<0)
                sum=arr[i];

            if (sum>max)
               max=sum;

        }
        return max;
    }
}
