package HackerRank_Basics;
import java.util.Scanner;

public class anagrams {

    static boolean isAnargram(String a, String b) {
        String s = a.toLowerCase();
        String s1 = b.toLowerCase();
        while(s.length()==s1.length()&&s.length()!=0)
        {
            char c= s.charAt(0);
            System.out.println(c);
            String a1= s.replace(c+"", "");
            System.out.println(a1);
            String b1=s1.replace(c+"", "");
            System.out.println(b1);
            s=a1;
//            System.out.println(s);
            s1=b1;
//            System.out.println(s1);
        }
        System.out.println(s.length());
        System.out.println(s1.length());
        if(s.length()==s1.length()) return true;
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first String");
        String a = scan.next();
        System.out.println("Enter second String");
        String b = scan.next();
        scan.close();
        boolean ret = isAnargram(a, b);
        System.out.println((ret) ? "Anargams" : "Not Anargams");
    }
}
