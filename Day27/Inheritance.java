//Inheritance : Reinventing the wheel.

class base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am ind base and setting x now" );
        this.x = x;
    }

    public void printMe(){
        System.out.println("am a constructor");
    }
}
class Derived extends base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}


public class cwh_45_Inheritance {
    public static void main(String[] args) {

        // Creating an object of base class
        base b = new base();
        b.setX(10);
        System.out.println(b.getX());

        // Creating an object of derived class
        Derived d = new Derived();
        d.setX(45);
        System.out.println(d.getX());

    }
}
