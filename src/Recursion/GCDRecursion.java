package Recursion;

import java.util.Scanner;

public class GCDRecursion {
    static int gcd(int x, int y){
        if(y == 0) return x;
        return gcd(y, x%y);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Print value of x: ");
        int x = sc.nextInt();
        System.out.print("Print value of y: ");
        int y = sc.nextInt();
        System.out.print("Value of GCD: " +gcd(x,y));
    }
}
