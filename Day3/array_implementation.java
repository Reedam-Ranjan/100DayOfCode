package dsa.linked_list;

public class array_implementation {
    static class Node{
        int data;
        Node next;
    }
    static Node insert(Node root, int item){
        Node temp = new Node();
        Node ptr;
        temp.data = item;
        temp.next = null;
        if(root == null){
            root = temp;
        }else{
            ptr = root;
            while (ptr.next != null)
                ptr = ptr.next;
            ptr.next = temp;
        }
        return root;
    }

    static void display( Node root){
        while(root != null){
            System.out.print(root.data+"-->");
            root = root.next;
        }
        System.out.print("null");
    }

    static Node arrayList(int arr[], int n){
        Node root = null;
        for (int i = 0; i < n; i++) {
            root = insert(root, arr[i]);
        }
        return root;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int n = arr.length;
        Node root = arrayList(arr, n);
        display(root);
    }
}