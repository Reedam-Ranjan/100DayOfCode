import java.util.HashSet;

public class dupl_del_arr_w3_16 {

    public static void main(String args[]) {

            int arr[] = {1,5,6,5,7,6};
            int arr1[] = new int[7];
            int count = 0;
        /*1.My Method
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j] && (i != j))
                    for (int k = j; k < arr.length - 1; k++) {
                        arr[k] = arr[k + 1];
                        count++;
                        }
                  }
           }
        if (count == 0) {
            System.out.println("No duplicate elements");
        } else {
            System.out.println("duplicates deleted successfully");
            for (int i = 0; i < arr.length; i++) {
                arr1[i]=arr[i];
                System.out.print(arr1[i] + " ");
            }
        }
    }
}*/
            HashSet<Integer> hs = new HashSet<>();
            for(int i =0; i<arr.length;i++) {
                hs.add(arr[i]);
            }
            for( int no:hs){
                System.out.print(no+" ");
            }
        }

    }


    // For Strings
    /*String[] str = {"apple","banana","apple","grapes","kiwi","kiwi"};

        for(int i =0 ;i<str.length-1;i++){
        for(int j=i+1;j<str.length;j++){

        if(str[i].equals(str[j]) && (i!=j))

        System.out.println("Duplicate element: " +str[j]);*/




// gfg method of removing duplicates : fails for some test cases
// First check all the values that are
// present in an array then go to that
// values as indexes and increment by
// the size of array

       /* for (int i = 0; i < n; i++) {
        int index = arr[i] % n;
        arr[index] += n;
        }

        // Now check which value exists more
        // than once by dividing with the size
        // of array
        int flag = 0;
        ArrayList<Integer> ans = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
        if ((arr[i] / n) > 1) {
        ans.add(i);
        flag = 1;
        }
        }
        if (flag == 0) ans.add(-1);
        return ans;
        */