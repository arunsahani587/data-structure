package LinkedList;

import java.util.HashSet;

public class DetectLoopInLinkedList {
    /* Driver program to test above function */
   /* public static void main(String[] args) {
        push(20);
        push(4);
        push(15);
        push(10);

        *//*Create loop for testing *//*
        head.next.next.next.next = head;
        if (detectLoop(head))
            System.out.println("Loop found");
        else
            System.out.println("No Loop");
    }
    static Node head; // head of list
    static public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    // Returns true if there is a loop in linked
    // list else returns false.
    static boolean detectLoop(Node h) {
        HashSet<Node> s = new HashSet<Node>();
        while (h != null) {
            // If we have already has this node
            // in hashmap it means their is a cycle
            // (Because you we encountering the
            // node second time).
            if (s.contains(h))
                return true;

            // If we are seeing the node for
            // the first time, insert it in hash
            s.add(h);

            h = h.next;
        }

        return false;
    }*/

    // Driver code==================================================
    public static void main(String[] args) {
        Node head = null;
        head = push(head, 20);
        head = push(head, 4);
        head = push(head, 15);
        head = push(head, 10);
        head.next.next.next.next = head;
        if (detectLoop(head))
            System.out.print("Loop found");
        else
            System.out.print("No Loop");
    }
    static Node push(Node head_ref, int new_data) {
        Node new_node = new Node();
        new_node.data = new_data;
        new_node.flag = 0;
        // Link the old list off the new node
        new_node.next = head_ref;
        // Move the head to point to the new node
        head_ref = new_node;
        return head_ref;
    }
    static boolean detectLoop(Node h) {
        while (h != null) {

            // If this node is already traverse
            // it means there is a cycle
            // (Because you we encountering the
            // node for the second time).
            if (h.flag == 1)
                return true;

            // If we are seeing the node for
            // the first time, mark its flag as 1
            h.flag = 1;

            h = h.next;
        }
        return false;
    }



}
