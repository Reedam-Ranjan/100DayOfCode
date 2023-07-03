public class linked_array_impl {

    static class Node {
        int data;
        Node next;
    };
    static Node root;
          static Node insert(Node root , int item){
              Node temp = new Node();
              temp.data = item;
              temp.next = root;
              root = temp;
              return  root;
    }
    static void display(Node root){
              while (root!=null){
                  System.out.print(root.data+"-->");
                  root=root.next;
              }
        System.out.print("null");
    }
    static Node ArraytoList(int arr[], int n){
              root = null;
              for(int i = n-1 ; i>=0 ; i--){
                  root = insert(root , arr[i]);
              }
              return root;
    }
    public static void main(String[] args) {
       root = null;
       int arr[] = {1,2,3,4,5};
       int n = arr.length;
       Node root = ArraytoList(arr,n);
       display(root);
    }
}
