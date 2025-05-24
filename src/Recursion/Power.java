package Recursion;

public class Power {
//    Method 1
//    static int pow(int p, int q){
//        if(q == 0) return 1;
//        return pow(p, q-1) * p;
//    }

//    Method 2
    static int pow(int p, int q){
        if(q == 0) return 1;
        // check even power
        if(q % 2 == 0){
            return pow(p, q/2) * pow(p, q/2);
        }
            // check odd power
        else{
            return p * pow(p, q/2) * pow(p, q/2);
        }
    }
    public static void main(String[] args) {
        System.out.println(pow(5,4));

    }
}
