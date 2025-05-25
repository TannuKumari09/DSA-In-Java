package Recursion;

import java.util.Scanner;

public class GCD {
    static  int gcd(int x,int y){
        while(x % y != 0){
            int rem = x % y;
            x = y;
            y = rem;
        }
        return y;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Print value of x: ");
        int x = sc.nextInt();
        System.out.print("Print value of y: ");
        int y = sc.nextInt();
        System.out.print("Value of GCD: " +gcd(x, y));
    }
}
