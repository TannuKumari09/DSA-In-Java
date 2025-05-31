package String;

public class RemoveA {
    static String remove(String s){
        String ans  = "";
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) != 'a'){
                ans += s.charAt(i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String s = "abhgfftgaardax";
        System.out.println(remove(s));

    }
}
