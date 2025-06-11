package SortingAlgo;

public class BubbleSortExmple1 {
    static void bubbleSort(int[] arr){
        int n = arr.length;

        for(int i=0; i<=arr.length; i++){
            boolean flag = false;   // has any swapping happened
            for(int j=0; j<n-i-1; j++){
//                last i elements are already at correct sorted position
//                 so, no need to check them

                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = true;
                }

            }
            if(!flag){   // have any swaps happened?
                return;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,7,4,3,9};
        bubbleSort(arr);
        for(int num: arr){
            System.out.print(num + " ");
        }
    }
}
