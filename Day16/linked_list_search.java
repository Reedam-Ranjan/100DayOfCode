import javax.swing.*;

public class linked_list_search {
    // class name

    private ListNode head;             // head node that holds the whole list i.e its an instance variable

    private static class ListNode {    // Listnode class  i.e create listnode
        private int data;              // data property i.e generic type
        private ListNode next;         // pointer(reference) to the next node

        public ListNode(int data) {        // constructor for the data part
            this.data = data;
            this.next = null;
        }
    }

    public void display() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + "--->");
            current = current.next;
        }
        System.out.println("null");

    }

    public boolean find(int searchKey) {
        if (head == null) {
            return false;
        }
        ListNode current = head;
        while (current != null) {
            if (current.data == searchKey) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
    public ListNode reverse(){
        if(head==null){
            return head;
        }
        ListNode current = head ;
        ListNode previous = null;
        ListNode next = null;
        while(current!=null){
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }

    public static void main(String args[]) {  //main method

        linked_list_search sl1 = new linked_list_search();     // initialise the singly_linked_list
        sl1.head = new ListNode(10);                      // 1st listnode
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);

        // we will connect them together to forma a chain
        sl1.head.next = second;  // 10--->1
        second.next = third;    //10--->1--->8
        third.next = fourth;    //10--->1--->8--->11


        /*if(sl1.find(12))
        System.out.println("Found");
        else
            System.out.println("Not found");*/
        sl1.display();


    }
}