package dsa.Hashing;

import java.util.HashMap;

public class hashMap {

    // function to create HashMap from array
    static void createHashMap(int[] arr){
        // creates empty hashmap
        HashMap<Integer, Integer> hmap = new HashMap<Integer,Integer>();

        for(int i = 0 ; i < arr.length; i++){
            // Get if the element is present
            Integer c = hmap.get(arr[i]);

            // If this is the first occurrence of the element insert it.
            if(hmap.get(arr[i]) == null){
                hmap.put(arr[i],1);
            }
            // If it already exists, incremment the count by 1
            else {
                hmap.put(arr[i], ++c);
            }
        }
        System.out.println(hmap);
    }
    public static void main(String[] args) {

        int arr[] = {1, 2, 1, 3, 2};
        createHashMap(arr);
    }
}
