package OOPs.POLYMORPHISM;

class AddMethods {
    static int AddNums(int a, int b) {
        return (a+b);
    }

    static int AddNums(int a, int b, int c) {
        return (a+b+c);
    }

    static double AddNums(double a, double b) {
        return (a+b);
    }
}

public class CompileTimePolymorphism {

    public static void main(String[] args) {
        System.out.println("Addition of two integers: "+ AddMethods.AddNums(6, 11));
        System.out.println("Addition of three integers: "+ AddMethods.AddNums(6, 11, 5));
        System.out.println("Addition of two decimal numbers: "+ AddMethods.AddNums(6.3, 2.8));
    }
}