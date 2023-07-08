import java.util.HashMap;

public class subArray {

    void subArraySum(int arr[] , int sum) {
        int currSum = 0;
        int start = 0;
        int end = -1;

        HashMap<Integer, Integer> ans = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];
            if (currSum - sum == 0) {
                start = 0;
                end = i;
                break;
            }
            if (ans.containsKey(currSum - sum)) {
                start = ans.get(currSum - sum) + 1;
                end = i;
                break;
            }
            ans.put(currSum, i);
        }
        if(end == -1) {
            System.out.println("Not found");
        }
        else{
            System.out.println(start+" "+end);

        }
     }

    public static void main(String[] args) {

        int a[] = {10, 15, -5, 15, -10, 5};
        int sum = 5;
        subArray s = new subArray();

        s.subArraySum(a,sum);

    }


}
