import java.util.Arrays;

public class rotated_arr_cpp_GFG {

    static int[] rotate(int[] a, int d){

            int n = a.length;
            int[] rotated_arr = new int[n];

            int i=0;
            int rotate_index = d;

            while(rotate_index< n){
                rotated_arr[i] = a[rotate_index];
                i++;
                rotate_index++;
            }
            rotate_index =0;
            while(rotate_index <d){

                rotated_arr[i]= a[rotate_index];
                i++;
                rotate_index++;
            }
            return rotated_arr;
        }
        public static void main(String args[]){

            int a[] = {1,2,3,4,5};
            int d =3;                                                                                                                                  ;
            System.out.println(Arrays.toString(rotate(a,d)));
        }
    }


