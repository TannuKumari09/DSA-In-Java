package Recursion;

public class PrintSubSequence {
    static void printSSQ(String s, String currAns){

        if(s.length() == 0){
            System.out.println(currAns);
            return;
        }

        char curr = s.charAt(0); // a
        String remString = s.substring(1); // bc

        //curr char --> choose to be a part of currAns
        printSSQ(remString,currAns+curr); // add curr
        //curr  char --> does not choose to be a part of currAns

        printSSQ(remString, currAns); //do not add  curr
    }
    public static void main(String[] args) {
        printSSQ("abc", "");
    }
}
