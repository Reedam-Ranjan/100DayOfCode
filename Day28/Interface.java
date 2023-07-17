
interface bicycle{
    // properties in interfaces
    int a = 45;
    void applyBreak(int decremeent);
    void speedUp(int increement);

}interface Hornbicycle{
    // properties in interfaces

    void blowhornK3g();
    void blowhornmahn();

}
   class AvonCycle implements bicycle,Hornbicycle{

    void blowhorn(){
        System.out.println("Pee Pee Poo Poo");
    }
       public void applyBreak(int decremeent){
           System.out.println("Applying brake");
       }
       public void speedUp(int increement){
           System.out.println("Applying SpeedUP");
       }
       public void blowhornK3g(){
           System.out.println("Kabhi Khushi Kabhi Gham pee pee poo poo");
       }
       public void blowhornmahn(){
           System.out.println("Main Hoon Na pee pee Poo Poo");
       }


}

public class cwh_54_Interface {
    public static void main(String[] args) {

        AvonCycle reedam = new AvonCycle();
        reedam.applyBreak(1);
        // You can create properties in interfaces
        System.out.println(reedam.a);
        // You cannot modify the properties in interfaces
        // reedam.a = 345;
        System.out.println(reedam.a);

        reedam.blowhornK3g();
        reedam.blowhornmahn();
    }
}
