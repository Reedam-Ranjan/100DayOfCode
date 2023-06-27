package dsa.array;
class Solution{
    static int minJumps(int[] arr){
        int jumpCount = 0;
        int n = arr.length;
        int range = 0;
        int jumps;
        int k = 0;

        for(int i = 0; i<n ;i++){
            // setting a range as atleast arr[i]
            range = jumps = arr[i];
            // to check if jump will be more than enough to jump all elements after it
            if(range+i+1 >= n){
                jumpCount++;
                break;
            }
            // case if 0 occurs
            if(arr[i] == 0){
                return -1;
            }
            // checking the best jump possible
            k = 1;
            for(int j = 1 ; j<=jumps ; j++){
                // maximizing the range
                if(j+i<n && (arr[i+j]+j) >= range ){
                    k = j;
                    range = arr[i+j]+j;
                }
            }
            // adding the jumps that we did
            // -1 since i++ is executed after every loop (adjustment)
            i += k -1;
            jumpCount++;
        }
        return jumpCount;
    }
}