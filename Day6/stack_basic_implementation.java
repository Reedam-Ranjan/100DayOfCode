package dsa.stack;

public class stack_basic_implementation {

    StackNode top;

    private class StackNode{
        int data;
        StackNode next;

        StackNode(int d){
            data = d;
        }
    }

    public boolean isEmpty(){
        if(top == null)
            return true;
        else
            return false;
    }
    public void push(int data){
        StackNode new_node = new StackNode(data);
        if(top == null){
            top = new_node;
        }else{
            StackNode temp = top;
            top = new_node;
            new_node.next = temp;
        }
        System.out.println(data+ " is pushed into the stack");
    }

    public int pop(){
        int popped = Integer.MIN_VALUE;
        if(top == null){
            System.out.println("Stack is empty");
        }else{
            popped = top.data;
            top = top.next;
        }
        return popped;
    }

    public int peek(){
        if(top == null){
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }else{
            return top.data;
        }
    }

    public static void main(String[] args) {
        stack_basic_implementation st = new stack_basic_implementation();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println("Top element is : " +st.peek());
        System.out.println(st.pop()+" popped from the stack");
        System.out.println("Now the top element is : "+st.peek());
    }
}
