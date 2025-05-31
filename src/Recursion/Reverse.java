package Recursion;

import java.util.Scanner;

public class Reverse {
    static String ReverseString(String s, int idx){
        //base case
        if(idx == s.length()) return "";

        String smallAns = ReverseString(s, idx+1);
        return smallAns + s.charAt(idx);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(ReverseString(s, 0));

    }
}


//Time Complexity = O(n^2)
