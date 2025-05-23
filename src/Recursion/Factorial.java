package Recursion;

import java.util.Scanner;

public class Factorial {
    static  int factorial(int n){
        if(n<=1) return 1;

        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print value of n: ");
        int n = sc.nextInt();
        System.out.println("factorial: ");
        System.out.println(factorial(n));
    }
}
//  Time Complexity: O(n)
// Space Complexity: O(n)
