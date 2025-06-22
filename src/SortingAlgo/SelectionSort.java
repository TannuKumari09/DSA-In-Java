package SortingAlgo;

public class SelectionSort {
    static void selection(int[] arr){
        for(int i=0; i<arr.length-1; i++){ // i represent the current index

            int min_idx = i;
                for(int j=i+1; j<arr.length; j++){
                    if(arr[min_idx] > arr[j]){
                        min_idx = j;
                    }
                }
                int temp = arr[i];
                arr[i] = arr[min_idx];
                arr[min_idx] = temp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {3,5,90,2,6,1};
        selection(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
}
