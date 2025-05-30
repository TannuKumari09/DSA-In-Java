package Recursion;

public class SumOfArray {
    static int sumofArray(int[] arr, int idx){
        if(idx == arr.length){
            return 0;
        }
        int smallAns = sumofArray(arr, idx + 1);
        return smallAns + arr[idx];
    }

    public static void main(String[] args) {
        int[] arr = {2,3,5,20,1};
        System.out.println(sumofArray(arr,0));
    }
}
