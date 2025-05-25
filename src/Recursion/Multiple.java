package Recursion;

import java.util.Scanner;

public class Multiple {
    static  void printMultiple(int num, int k){
        // base case
        if(k == 1){
            System.out.println(num);
            return;
        }
        //recursive work
        printMultiple(num, k-1);

        // self work
        System.out.println(num * k);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Print num : ");
        int num = sc.nextInt();
        System.out.print("Print k : ");
        int k = sc.nextInt();
        printMultiple(num, k);
    }
}
