package ArrayNewton;
//https://leetcode.com/problems/minimum-absolute-difference/description/

//Given an array of distinct integers arr, find all pairs of elements with the minimum absolute difference of any two elements.
//        Return a list of pairs in ascending order(with respect to pairs), each pair [a, b] follows
//        a, b are from arr
//        a < b
//        b - a equals to the minimum absolute difference of any two elements in arr

import java.util.*;

public class AbsDiff {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Size of Array :");
        int n=sc.nextInt();

        int[] ar =new int[n];
        System.out.println("Enter Elements");
        for (int i = 0; i < n; i++) {
            ar[i]=sc.nextInt();
        }
//        int ar[]={3,8,-10,23,19,-4,-14,27};
        System.out.println(minimumAbsDifference(ar));

//        findMinAbsDiff(ar,n);
    }

    //to print min absolute difference
    private static void findMinAbsDiff(int[] ar, int n) {
        int minVal = Integer.MAX_VALUE;

        for (int i = 0; i < n-1; i++) {
            minVal = Math.min(minVal,Math.abs(ar[i]-ar[i+1]));
        }
        System.out.println(minVal);
    }

    public static List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min=Integer.MAX_VALUE;
        List<List<Integer>> ans=new ArrayList<>();

        for(int i=1;i<arr.length;i++){
            min=Math.min((arr[i]-arr[i-1]),min);
        }

        for(int i=1;i<arr.length;i++){

            if(arr[i]-arr[i-1]==min){
                ans.add(Arrays.asList(arr[i-1],arr[i]));
            }
        }
        return ans;

    }
}
