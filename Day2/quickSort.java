package dsa.sorting;

public class quickSort {

    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};

        quicksort(array, 0, array.length);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

        public static void quicksort(int[] input, int start ,int end){
        if(end-start<2){
            return;
        }
        int pivotIndex = partition(input, start, end);
        quicksort(input, start, pivotIndex);
        quicksort(input, pivotIndex+1, end);
        }
        // The partition method
        public  static int partition(int[] input, int start, int end){
        int pivot = input[start];
        int i = start;
        int j = end;
        while(i < j){
            // Note: Empty loop body
            while(i < j && input[--j] >= pivot);
            if(i < j){
                input[i] = input[j];
            }
            // Note: Empty loop body
            while(i<j && input[++i] <= pivot);
            if(i<j){
                input[j] = input[i];
            }
        }
        input[j] = pivot;
        return j;
        }
}
