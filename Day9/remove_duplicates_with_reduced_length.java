public class remove_duplicates_with_reduced_length {

    static int remove (int[] nums , int val){
        int i=0;
        int cnt = nums.length;

        while(i<cnt){
            if(nums[i]== val){

                for(int j =i+1;j<cnt;j++){
                    nums[j-1] = nums[j];
                }
                cnt--;
            }
            else{
                i++;
            }
        }
        return cnt;
    }
    public static void main(String args[]){
        remove_duplicates_with_reduced_length len = new remove_duplicates_with_reduced_length();
        int arr[] = {1,2,3,1,2,3};
        int val = 3;
        System.out.println(len.remove(arr,val));
    }
}
