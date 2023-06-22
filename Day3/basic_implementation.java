package dsa.linked_list;

class basic_implementation {

    Node head;
    static class Node{
        int data;
        Node next;

        Node(int d){
            this.data = d;
            this.next = null;
        }}

    public  void printList(){
        Node n = head;
        while(n!=null){
            System.out.print(n.data+"-->");
            n = n.next;
        }
        System.out.print("null");
    }


    public static void main(String[] args) {
        basic_implementation sl1 = new basic_implementation();

        sl1.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        sl1.head.next = second;
        second.next = third;
        sl1.printList();
    }
}

