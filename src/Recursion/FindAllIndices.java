package Recursion;

import java.util.ArrayList;

public class FindAllIndices {
    static ArrayList<Integer> allIndices(int[] a, int n, int target, int idx){
        //base case
        if(idx >= n){
            return new ArrayList<Integer>(); // return empty arraylist
        }
        ArrayList<Integer> ans = new ArrayList<>();
        //self Work
        if(a[idx] == target){
            ans.add(idx);
        }

        // recursive work
        ArrayList<Integer> smallAns = allIndices(a,n,target,idx+1);
        ans.addAll(smallAns);
        return ans;
    }
    public static void main(String[] args) {
    int[] a = {1,2,4,4,5,4};
    int target = 4;
    int n = a.length;
    ArrayList<Integer> ans = allIndices(a,n,target,0);
        for(int i : ans){
            System.out.print(i+" ");
        }
    }
}
