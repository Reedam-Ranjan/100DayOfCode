class MyMainEmployee{

    private int id ;
    private String name;

  /*  public MyMainEmployee(){
        id = 45;
        name = "ReedamRanjan";
    }*/
  public MyMainEmployee(String Myname, int MyId) {
      name = Myname ;
      id = MyId;
  }

    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }
}



public class cwh_42_constructors {

    public static void main(String[] args) {

        MyMainEmployee reedam = new MyMainEmployee("Reedam Ranjan",111);
       // reedam.setId(111);
       // reedam.setName("ranjan");
        System.out.println(reedam.getId());
        System.out.println(reedam.getName());

    }

    }
