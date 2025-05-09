package String;

public class PalindromeSubstring {
    static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    static int CountPalindromeSubstring(String s){
        int count = 0;
        for(int i=0; i<s.length(); i++){
            for(int j = i+1; j<=s.length(); j++){
                String str = s.substring(i, j);
                if(isPalindrome(str)){
                    count++;
                }
            }
        }
        return count;

    }
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(CountPalindromeSubstring(s));
    }
}
