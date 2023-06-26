package dsa.queue;
// doubt : queue is public and should be declared in file name queue.java

// queue class
 class queue_basic {
    // data types
    QNode front , rear;

    // constructor to initialize the values to the class
    queue_basic() {
        this.front = this.rear = null;
    }

    // Node class for the data and the next variable
        class QNode {
            int data;
            QNode next;
            // constructor to initialize the Node class
            QNode(int d){
                this.data = d;
                this.next = null;
        }
    }

    // enqueue method : to insert items into the queue
    void enqueue(int data){
        QNode temp = new QNode(data);
        if(rear == null){
            front = rear = temp;
        }else{
            rear.next = temp ;
            rear = temp;
        }
    }

    // dequeue method : to delete items from the queue
    void dequeue(){
        if (front==null)
            return;

        QNode temp = front ;
        front = front.next;

        if (front == null)
            rear = null;
    }
}

// main class
public class queue{
    public static void main(String[] args) {
        queue_basic q = new queue_basic();

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        System.out.println("Queue front "+q.front.data);
        q.dequeue();
        System.out.println("Queue front "+q.front.data);
        System.out.println("Queue back "+q.rear.data);

    }
}
