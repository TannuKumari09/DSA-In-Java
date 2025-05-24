package Recursion;

public class Power {
//    Method 1
//    static int pow(int p, int q){
//        if(q == 0) return 1;
//        return pow(p, q-1) * p;
//    }

//    Method 2
//    static int pow(int p, int q){
//        if(q == 0) return 1;
//        if(q % 2 == 0){
//            return pow(p, q/2) * pow(p, q/2);
//        }
//        else{
//            return p * pow(p, q/2) * pow(p, q/2);
//        }
//    }
//    method -3
    static int pow(int p, int q){
        if(q == 0) return 1;
        int smallPow = pow(p, q/2);
        if(q % 2 == 0){
            return smallPow * smallPow;
        }
        else{
            return p * smallPow * smallPow;
        }
    }
    public static void main(String[] args) {
        System.out.println(pow(5,4));

    }
}
