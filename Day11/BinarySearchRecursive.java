package dsa.searching;
public class BinarySearchRecursive {

     int binarySearch(int[]arr, int l, int r, int x){

         if( r >= 1){
             int mid = l + (r-1)/2;
             // if x is the middle element return it
             if(arr[mid] == x )
                 return mid;
             // if x is smaller than the middle element
             if(arr[mid] > x)
                 return binarySearch(arr, l, mid - 1, x);
             // if x is greater than the middle element
             return binarySearch(arr, mid+1,r, x);
         }
         return -1;
     }
    public static void main(String[] args) {
         BinarySearchRecursive ob = new BinarySearchRecursive();
            int arr[] = {2, 3, 5, 11, 34};
            int n = arr.length;
            int x = 11;
            int result = ob.binarySearch(arr, 0, n-1, x);
            if(result == -1)
                System.out.println("Element not present");
            else
                System.out.println("Element found at index " + result);
            }
    }
















