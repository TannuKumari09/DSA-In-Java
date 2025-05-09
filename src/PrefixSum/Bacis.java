package PrefixSum;

import java.util.Arrays;

public class Bacis {
//    make new array for doing prefixSum
//    static int prefixSum(int[] arr){
//        int[] prefixSum = new int[arr.length];
//        prefixSum[0] = arr[0];
//        for(int i=1; i<arr.length; i++){
//            prefixSum[i] = arr[i] + prefixSum[i-1];
//        }
//        return prefixSum[prefixSum.length-1];
//    }

//    find prefixSum in same array
    static int[] prefixSum(int[] arr){
        int n = arr.length;
        for(int i=1; i<n;i++){
            arr[i] += arr[i-1];
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(prefixSum(arr)));

    }
}
