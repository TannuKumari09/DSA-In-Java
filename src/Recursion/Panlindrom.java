package Recursion;

import java.util.Scanner;

public class Panlindrom {
        static String ReverseString(String s, int idx){
            //base case
            if(idx == s.length()) return "";

            String smallAns = ReverseString(s, idx+1);
            return smallAns + s.charAt(idx);
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            String rev = ReverseString(s, 0);
            if(rev.equals(s)){
                System.out.println("is Palindrome");
            }
            else{
                System.out.println("Not palindrome");
            }

        }
    }


//Time Complexity = O(n^2)
