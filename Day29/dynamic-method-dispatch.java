
class Phone{
    public void showtime(){
        System.out.println("This shows the time " );
    }
    public void on(){
        System.out.println("Turning on the phone");
    }
}
class Smarthphone extends Phone{
    public void music(){
        System.out.println("Playing music");
    }
    public void on(){
        System.out.println("Turning on smarthphone");
            }
}
public class practice6_dynamicmethdispt {
    public static void main(String[] args) {
        Phone ob1= new Phone();
        ob1.on();
        Phone ob = new Smarthphone();

        ob.showtime();
        ob.on();

    }
}
