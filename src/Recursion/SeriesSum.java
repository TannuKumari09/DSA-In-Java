package Recursion;

import java.util.Scanner;

public class SeriesSum {
    static  int SeriesSum1(int n){
        if(n == 0){
            return 0;
        }
        return SeriesSum1(n-1) + n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Print n : ");
        int n  = sc.nextInt();
        System.out.println(SeriesSum1(n));
    }
}
