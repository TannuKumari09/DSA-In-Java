package Recursion;

public class ArrayRecursion {
    static void printArray(int[] arr, int idx){
        //base case
        if(idx == arr.length){
            return;
        }
        //self work
        System.out.println(arr[idx]);

        //recursion work - sub problem
        printArray(arr , idx+1);
    }
    public static void main(String[] args) {
        int []arr = {5,6,7,8,9};
        printArray(arr, 0);
    }
}
