import java.util.Scanner;
public class happy_w3_9 {
    static int ishappynumber(int n ){
        int sum =0,d;
        while(n!=0){
            d = n%10;
            sum += (d*d);
            n /=10;
        }
        return sum;
    }

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = in.nextInt();
        while(n>9){
            n = ishappynumber(n);
        }
        if(n==1)
            System.out.println("Happy number");
        else
            System.out.println("Not happy number");

    }
}

  /*  static boolean auto(int n){
        int square = n * n;
        while(n > 0){

            if(n%10 != square%10)
                return false;
            n /= 10;
            square /=10;
        }
        return true;
    }
    public static void main(String[] args){
        int n = 76;
        if(auto(n))
            System.out.println("true");
        else
            System.out.println("False");
    }*/
