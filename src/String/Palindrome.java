package String;

public class Palindrome {
    static void isPalindrome(String str){
        int left = 0;
        int right = str.length()-1;
        while(left < right){
            if(str.charAt(left) != str.charAt(right)){
                System.out.println(" not palindrome");
                return;
            }
            left++;
            right--;
        }
        System.out.println("palindrome");
    }
    public static void main(String[] args) {
        String str = "abcdcba";
        isPalindrome(str);
//        StringBuilder gtr = new StringBuilder(str);
//        gtr.reverse();
//        String s = gtr +"";
//        if(str.equals(s)){
//            System.out.println("Palindrome");
//        }
//        else{
//            System.out.println("not palindrome");
//        }
    }
}
