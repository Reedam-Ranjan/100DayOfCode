public class DoublyLinkedList {

    private ListNode head;
    private ListNode tail;
    private int length;

    private class ListNode {

        private int data;
        private ListNode next;
        private ListNode previous;

        public ListNode(int data) {
            this.data = data;
        }
    }
        public DoublyLinkedList(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }
    public boolean isEmpty(){
        return  length==0 ;

    }
    public  int length(){
        return length;
    }

    public void displayforward(){
        ListNode temp = head;
        while(temp!=null){
            System.out.println(temp.data+"-->");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public void displaybackward(){
        if(tail==null){
            return;
        }
        ListNode temp = tail;
        while (temp!=null){
            System.out.println(tail.data+"-->");
            tail=temp.previous;
        }
        System.out.println("null");
    }

    public static void main(String args[]){

        DoublyLinkedList dl1 = new DoublyLinkedList();


    }
}
