package Recursion;

public class PrintMax {
    static int ArrayMax(int[] arr, int idx){
        if(idx == arr.length-1) {
            return arr[idx];
        }

        int smallAns = ArrayMax(arr, idx+1);

        return Math.max(arr[idx], smallAns);
    }
    public static void main(String[] args) {
        int[] arr = {3,10,13,2,5};
        System.out.println(ArrayMax(arr, 0));

    }
}
