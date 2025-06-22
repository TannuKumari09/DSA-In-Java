package SortingAlgo;

public class SortString {

    static void sortFruits(String[] fruits){
        for(int i=0; i<fruits.length-1; i++){
            int min_idx = i;
            for(int j=i+1; j<fruits.length; j++){
                if(fruits[j].compareTo(fruits[min_idx]) < 0){
                    min_idx = j;
                }
            }
            String temp = fruits[i];
            fruits[i] = fruits[min_idx];
            fruits[min_idx] = temp;
        }
    }

    public static void main(String[] args) {
        String[] fruits = {"kiwi", "apple", "papaya", "mango"};
        sortFruits(fruits);
        for(String val : fruits){
            System.out.print(val + " ");
        }
    }
}
