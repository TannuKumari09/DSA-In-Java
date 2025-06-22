package SortingAlgo;

public class MergeSort {

    static  void merge(int[] arr, int l, int mid, int r){
        int n1 = mid-l+1;
        int n2 = r-mid;

        int[] left = new int[n1];
        int[] right = new int[n2];

        int i, j, k;

        for(int a=0; a<n1; a++){
            left[a] = arr[l+a];
        }
        for(int b=0; b<n2; b++){
            right[b] = arr[mid+1+b];
        }

        i=0;
        j=0;
        k=l;

        while(i<n1 && j<n2){
            if(left[i] < right[j]){
                arr[k++] = left[i++];
            }
            else {
                arr[k++] = right[j++];
            }
        }
        while(i<n1){
            arr[k++]  = left[i++];
        }
        while(j<n2){
            arr[k++] = right[j++];
        }
    }

    static  void mergeSort(int[] arr, int l, int r){
        if(l >= r){
            return;
        }
        int mid = (l+r)/2;
        mergeSort(arr, l, mid);
        mergeSort(arr, mid+1, r);
        merge(arr, l, mid, r);
    }
    public static void main(String[] args) {
        int[] arr = {7, 20, 4, 11, 8, 2};
        int n = arr.length;

        mergeSort(arr, 0, n-1);
        for(int num: arr){
            System.out.print(num +" ");
        }

    }
}
