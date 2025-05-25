package Recursion;

public class GCDByBruteApproach {
    static int GCD(int x,int y){
        int min = Math.min(x, y);
        int gcd = 1;

        for(int i=1; i<= min; i++){
            if(x%i == 0 && y%i == 0){
                gcd = i;
            }
        }
        return gcd;
    }
    public static void main(String[] args) {
        int x = 4;
        int y = 9;
        System.out.println(GCD(x,y));
    }
}
