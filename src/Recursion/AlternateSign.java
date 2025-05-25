package Recursion;

import java.util.Scanner;

public class AlternateSign {
    static int alternate(int n){
        //base case
        if( n == 1){
            return 1;
        }

        // recursive work and self work
        if(n % 2 == 0){
            return alternate(n-1) - n;
        }
        else{
            return alternate(n-1) + n;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Print n : ");
        int n = sc.nextInt();
        System.out.println(alternate(n));
    }
}
