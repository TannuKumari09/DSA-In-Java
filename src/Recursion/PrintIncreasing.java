package Recursion;

import java.util.Scanner;

public class PrintIncreasing {
    public static void printIncreasing(int n){
        if(n == 1){
            System.out.println(n); // 1
            return;
        }

        printIncreasing(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printIncreasing(n);
    }
}
