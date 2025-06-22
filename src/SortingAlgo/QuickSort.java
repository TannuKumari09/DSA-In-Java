package SortingAlgo;

public class QuickSort {
    static  void swap(int[] arr, int x, int y){
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    static void quickSort(int[] arr, int st, int end){
        if(st >= end) return;

        int pi = partition(arr, st, end);
        quickSort(arr, st, pi-1);
        quickSort(arr, pi+1, end);
    }
    static int partition(int[] arr, int st, int end){
        int pivot = arr[st];
        int count = 0;

        for(int i = st+1; i <= end; i++){
            if(arr[i] <= pivot) count++;
        }
        int pivotIdx = st + count;
        swap(arr, st, pivotIdx);
        int i=st, j = end;

        while(i < pivotIdx && j > pivotIdx){
            while(arr[i] <= pivot) i++;
            while(arr[j] > pivot) j--;

            if(i < pivotIdx && j > pivotIdx){
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return pivotIdx;
    }
    public static void main(String[] args) {
        int[] arr = {7, 20, 4, 4, 11, 8, 2};
        int n = arr.length;

        quickSort(arr, 0, n-1);
        for(int num: arr){
            System.out.print(num +" ");
        }

    }
}
