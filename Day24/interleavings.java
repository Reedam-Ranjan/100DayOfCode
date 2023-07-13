//33. Write a Java program to find all interleavings of given strings

import java.util.Scanner;
public class interleavings {
    public static void main(String args[]){


        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String");
        String str = in.nextLine();
        System.out.println("Enter the character to be searched");
        char ch = in.next().charAt(0);
         boolean cond = false; int count=0;
        for(int i =0; i<str.length();i++){
            if(str.charAt(i)==ch){
                cond = true;
                count++;
            }
        }
        if(count==0){
            System.out.println("Character not found");
        }else
        System.out.println("The frequency of characters is" +count);


    }
}

