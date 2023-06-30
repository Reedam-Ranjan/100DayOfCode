package dsa.searching;
public class BinarySearchIterative {

    int binarySearch(int[]arr,int x){
        int l = 0 , r = arr.length-1;

        while(l <= r ){
            int m = l + (r-1)/2;
            // if x is the middle element
            if(arr[m] == x )
                return m;
            // if x is greater than the middle element
            if(arr[m] < x)
                l = m + 1;
            else
                r = m -1;
        }
        return -1;
    }
    public static void main(String[] args) {
        BinarySearchIterative ob = new BinarySearchIterative();
        int[] arr = {2, 3, 5, 11, 34};
        int x = 11;
        int result = ob.binarySearch(arr, x);
        if(result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }
}
















