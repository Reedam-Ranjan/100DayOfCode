package dsa.stack;

public class stack_array_implementation {

    static final int max = 1000;
    int top;
    int arr[] = new int [max];

    boolean isEmpty(){
        return top < 0;
    }
    stack_array_implementation(){
        top = -1;
    }

    boolean push(int x ){
        if(top >= (max-1)){
            System.out.println("Stack Overflow");
            return false;
        }else{
            arr[++top] = x ;
            System.out.println(x +" is pushed into the stack");
            return true;
        }
    }

    int pop(){
        if(top < 0){
            System.out.println("Stack underflow");
            return 0;
        }else{
            int x = arr[top--];
            System.out.println(x +" is popped from the stack ");
            return x;
        }
    }
    int peek(){
        if(top < 0){
            System.out.println("Stack Undeflow");
            return 0;
        }else{
            int x = arr[top];
            return x;
        }
    }

    void length(){
        for (int i = 0; i < arr[top]; i++) {
            System.out.println(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        stack_array_implementation sta = new stack_array_implementation();
        sta.push(1);
        sta.push(2);
        sta.push(3);
        sta.push(4);
        sta.push(5);
        System.out.println("Top element is "+sta.peek());
        sta.pop();
        System.out.println("Now the top element is " +sta.peek());

    }
}
