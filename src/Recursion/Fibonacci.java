package Recursion;

import java.util.Scanner;

public class Fibonacci {
    static int fib(int n){
        if(n == 1 || n == 0){
            return n;
        }

        int prev = fib(n-1);
        int prevPrev = fib(n-2);
        return prev + prevPrev;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print value of n: ");
        int n = sc.nextInt();
        System.out.println("Fibonacci Series: ");
        System.out.println(fib(n));
    }
}


// Time Complexity: O(2^n)
// Space Complexity: O(n)
