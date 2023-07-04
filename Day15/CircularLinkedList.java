import java.util.List;

public class CircularLinkedList {

    public ListNode last;
    public int length;

    private class ListNode {
        private ListNode next;
        private int data;

        private ListNode(int data) {
            this.data = data;
        }
    }
        public CircularLinkedList(){
        last = null ;
        length =0;
    }
    public int getLength(){
        return length;
    }
    public boolean isEmpty(){
        return length ==0;
    }
    public void createCircularLinkedList(){

        ListNode first = new ListNode(1);
        ListNode second = new ListNode(5);
        ListNode third = new ListNode(10);
        ListNode fourth = new ListNode(15);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = first;

        last = fourth;

    }

    public void display(){
        if(last==null){
            return;
        }
        ListNode first = last.next;
        while(first!=last){
            System.out.print(first.data+" ");
            first = first.next;
        }
        System.out.println(first.data);
    }

    public static void main(String args[]){

        CircularLinkedList cl1 = new CircularLinkedList();
        cl1.createCircularLinkedList();
        cl1.display();
    }

}
