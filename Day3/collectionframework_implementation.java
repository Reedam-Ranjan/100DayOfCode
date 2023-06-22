package dsa.linked_list;

import java.util.LinkedList;

public class collectionframework_implementation {

    public static void main(String[] args) {

        LinkedList<String> l1 = new LinkedList<String>();

        // Adding elements to the linked list
        l1.add("Ram");
        l1.add("Laxman");
        l1.add("Sita");

        // To add a elment to a specific location
        l1.add(0, "Hanuman");

        System.out.println(l1);

//        l1.remove("Laxman");
//        l1.remove(1);
//        l1.removeFirst();
        l1.removeLast();

        System.out.println(l1);
    }
}
