package LinkedList;

import java.util.HashSet;

public class RemoveLoopInLinkedList {
    // Driver code
    /*public static void main(String[] args) {
        head = new Node(50);
        head.next = new Node(20);
        head.next.next = new Node(15);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(10);

        // Creating a loop for testing
        head.next.next.next.next.next = head.next.next;
        detectAndRemoveLoop(head);
        System.out.println("Linked List after removing loop : ");
        printList(head);
    }
    static Node head;
    static int detectAndRemoveLoop(Node node) {
        Node slow = node, fast = node;
        while (slow != null && fast != null
                && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            // If slow and fast meet at same point then loop
            // is present
            if (slow == fast) {
                removeLoop(slow, node);
                return 1;
            }
        }
        return 0;
    }
    static void removeLoop(Node loop, Node curr) {
        Node ptr1 = null, ptr2 = null;

        *//* Set a pointer to the beginning of the Linked List
         and move it one by one to find the first node which
         is part of the Linked List *//*
        ptr1 = curr;
        while (1 == 1) {

            *//* Now start a pointer from loop_node and check
             if it ever reaches ptr2 *//*
            ptr2 = loop;
            while (ptr2.next != loop && ptr2.next != ptr1) {
                ptr2 = ptr2.next;
            }

            *//* If ptr2 reahced ptr1 then there is a loop. So
             break the loop *//*
            if (ptr2.next == ptr1) {
                break;
            }

            *//* If ptr2 did't reach ptr1 then try the next
             * node after ptr1 *//*
            ptr1 = ptr1.next;
        }

        *//* After the end of loop ptr2 is the last node of
         the loop. So make next of ptr2 as NULL *//*
        ptr2.next = null;
    }

    // Function to print the linked list
    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }*/

    public static void main(String[] args) {
        push(20);
        push(4);
        push(15);
        push(10);
        head.next.next.next.next = head;

        if (removeLoop(head)) {
            System.out.println("Linked List after removing loop");
            printList(head);
        } else
            System.out.println("No Loop found");
    }
    static Node head; // head of list
    static public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    static boolean removeLoop(Node h) {
        HashSet<Node> s = new HashSet<Node>();
        Node prev = null;
        while (h != null) {
            // If we have already has this node
            // in hashmap it means their is a cycle and we
            // need to remove this cycle so set the next of
            // the previous pointer with null.
            if (s.contains(h)) {
                prev.next = null;
                return true;
            }
            // If we are seeing the node for
            // the first time, insert it in hash
            else {
                s.add(h);
                prev = h;
                h = h.next;
            }
        }
        return false;
    }


}
