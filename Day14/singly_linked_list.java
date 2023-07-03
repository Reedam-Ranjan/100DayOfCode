import java.util.List;

public class singly_linked_list {      // class name

    private ListNode head;             // head node that holds the whole list i.e its an instance variable

    private static class ListNode {    // Listnode class  i.e create listnode
        private int data;              // data property i.e generic type
        private ListNode next;         // pointer(reference) to the next node

         public ListNode(int data) {        // constructor for the data part
            this.data = data;
            this.next = null;
        }
    }
         public void display(){
        ListNode current = head;
        while(current!=null){
            System.out.print(current.data + "--->");
            current = current.next;
        }
             System.out.print("null");
    }
      public int length(){                // find the length of the linkedlist
        while(head==null){
            return 0;
        }
        int count =0;
        ListNode current =head;
        while (current!=null){
            count++;
            current = current.next;
        }
        return count;
      }
      public void insertfirst(int value){         //insert a node at the beginning
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
      }
           public void insert(int position, int value){   // insert at a given position
            ListNode node = new ListNode(value);
            if(position ==1) {
                node.next = head;
                head = node;
            }else{
                ListNode previous = head;
                int count =1;    // traversing to pos -1

                while(count < position-1){
                    previous = previous.next;
                    count++;
                }
                ListNode current = previous.next;
                previous.next = node;
                node.next = current;
            }
           }
      public void insertLast(int value){              // Insert a Node at the Last position
              ListNode newNode = new ListNode(value);
              if(head == null) {
                  head = newNode;
                  return;
              }
              ListNode current = head;
              while(null != current.next) {
                  current = current.next;
              }
              current.next= newNode;

          }
          public ListNode deleteFirst() {           //delete the first node of a singly linked list
              if (head == null) {
                  return null;
              }

              ListNode temp = head;
              head = head.next;
              temp.next = null;
              return temp;

        }
        public void delete(int position){           // delete a node at any given position
        //position is valid and starting from 1
            //3-->4-->7-->8-->9-->null
            if(position ==1){
                head = head.next;
            }
            ListNode previous = head;
            int count =1;
            while(count < position -1){
                previous = previous.next;
                count++;
            }
            ListNode current = previous.next;
            previous.next = current.next;
        }
        public ListNode deleteLast(){                     // delete the last Node of a singly linked list
        if(head == null || head.next ==null) {
            return head;
        }
        ListNode current = head;
        ListNode previous = null;
        while(current.next != null) {
            previous = current;
            current = current.next;
        }
        previous.next= null;
        return current;
        }


         public static void main(String args[]){  //main method

            singly_linked_list sl1 = new singly_linked_list();     // initialise the singly_linked_list
            /* sl1.head = new ListNode(10);                      // 1st listnode
            ListNode second = new ListNode(1);
            ListNode third = new ListNode(8);
            ListNode fourth = new ListNode(11);

            // we will connect them together to forma a chain
            sl1.head.next=second;  // 10--->1
            second.next = third;    //10--->1--->8
            third.next = fourth;    //10--->1--->8--->11
            sl1.display();
            System.out.println("\nLength : " +sl1.length()); */

             sl1.insert(1,3);
             sl1.insert(2,5);
             sl1.insert(1,2);
             sl1.insert(2,4);
             sl1.insert(5,7);
            // System.out.println(sl1.deleteLast().data);
             //System.out.println(sl1.deleteFirst().data);
             sl1.delete(3);
             sl1.display();
        }
    }


