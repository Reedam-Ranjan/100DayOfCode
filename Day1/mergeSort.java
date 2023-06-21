package dsa.sorting;

public class mergeSort {

    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};

        mergesort(array, 0 , array.length);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static  void mergesort(int[] input, int start, int end){
        // break condition
        if(end -start < 2){
            return;
        }

        int mid = (start + end)/2;
        // to handle the left part of the array
        mergesort(input , start , mid );
        // to handle the right part of the array
        mergesort(input, mid, end);
        // merge method
        merge(input , start , mid , end);
    }

    // merge method : for merging step
    public static void merge(int[] input, int start, int mid, int end){

        if(input[mid-1] < input[mid]){
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end-start];
        while( i < mid && j < end){
            temp[tempIndex++] = input[i] < input[j] ? input[i++] : input[j++];
        }
        // copying the left elements that are greater : basically jumping in original array
        System.arraycopy(input, i , input, start+tempIndex, mid-i);
        // copying the rest of the array elements.
        System.arraycopy(temp, 0 , input, start, tempIndex);

    }
}
