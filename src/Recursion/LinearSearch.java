package Recursion;



public class LinearSearch {
    static boolean Search(int[] arr, int target,  int idx){
        if(idx >= arr.length){  //base case
            return false;
        }
        //self work
        if(arr[idx] == target){
            return true;
        }
        return Search(arr, target, idx+1);      // recursive work
    }
    public static void main(String[] args) {
        int[] arr = {4, 12, 54, 14, 3, 8, 6, 1};
        int target = 14;
        if(Search(arr, target, 0)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}
