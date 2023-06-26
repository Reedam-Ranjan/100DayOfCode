package dsa.queue;

// class for the array
 class queue_array {
    private static int front, rear, capacity;
    private static int queue[];

    // Constructor to initialize the values
     queue_array(int c ){
         front = rear = 0;
         capacity = c;
         queue = new int[capacity];
     }

    // enqueue method : to insert data to the queue
     static  void enqueue(int data){
         if(capacity == rear){
             System.out.println("\nQueue is full\n");
             return;
         }else{
             queue[rear++] = data;
         }
     }

     // dequeue method : to delete data from the queue
     static void dequeue(){
         if(front == rear){
             System.out.println("\nThe Queue is empty\n");
             return;
         }else{
             for (int i = 0 ; i < rear -1 ; i++){
                 queue[i] = queue[i+1];
             }
             if(rear < capacity)
                 queue[rear] = 0;
             rear--;
         }
         return;
     }

     // display method : to display the items of the queue
     static void display(){
         if(front == rear ){
             System.out.println("\nThe Queue is empty\n");
             return;
         }else{
             for (int i = front; i < rear ; i++) {
                 System.out.printf("%d<--", queue[i]);
             }
             System.out.printf("end ");
             return;
         }
     }
}

// main class
public class queue_array_class{
    public static void main(String[] args) {
        queue_array a = new queue_array(6);

        a.display();
        a.enqueue(1);
        a.enqueue(2);
        a.enqueue(3);
        a.enqueue(4);
        a.enqueue(5);
        a.dequeue();
        a.dequeue();
        a.display();
        a.enqueue(6);
        a.display();
    }
}

