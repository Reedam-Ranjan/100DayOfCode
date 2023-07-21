package OOPs.ENCAPSULATION;

class MyEmployee{
    private int id;
    private String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        this.name = n;
    }
    public void setId(int i){
        this.id = i;
    }
    public int getId(){
        return id;
    }
}
public class getSet {
    public static void main(String[] args) {
        MyEmployee reedam = new MyEmployee();
        // reedam.id = 45;
        // reedam.name = "ReedamRanjan"; --> Throws an error due to private access modifier
        reedam.setName("Reedam-Ranjan");
        System.out.println(reedam.getName());
        reedam.setId(686);
        System.out.println(reedam.getId());
    }
}
