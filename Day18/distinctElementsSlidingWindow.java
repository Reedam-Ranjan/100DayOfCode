import java.util.HashMap;
import java.util.Map;

public class distinctElementsSlidingWindow {

    void countDistinct(int a[] , int k){
        Map<Integer, Integer> res = new HashMap<>();
        for (int i = 0; i < k; i++) {
            res.put(a[i], res.getOrDefault(a[i],0)+1);
        }
        System.out.println(res.size());
        for (int i = k; i <a.length ; i++) {{
            if(res.get(a[i-k]) == - 1) {
                res.remove(a[i - k]);
            }
            else{
                res.put(a[i-k], res.getOrDefault(a[i],0)+1);
                System.out.println(res.size());

            }
        }
        }
    }
    public static void main(String[] args) {
   distinctElementsSlidingWindow ob = new distinctElementsSlidingWindow();

        int array[] = {1, 2, 2, 1, 3, 1, 1, 3};


        ob.countDistinct(array,4);


    }
}
