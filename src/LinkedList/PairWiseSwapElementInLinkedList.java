package LinkedList;

public class PairWiseSwapElementInLinkedList {
    /*  public static void main(String[] args) {
     *//* The constructed linked list is:
         1->2->3->4->5->6->7 *//*
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);

        System.out.println("Linked list before calling pairwiseSwap() ");
        printList(head);
        Node st = pairWiseSwap(head);
        System.out.println("");
        System.out.println("Linked list after calling pairwiseSwap() ");
        printList(st);
        System.out.println("");
    }
    static Node head;

    static Node pairWiseSwap(Node node) {
        if (node == null || node.next == null) {
            return node;
        }
        Node prev = node;
        Node curr = node.next;
        node = curr; // Change head before proceeeding
        // Traverse the list
        while (true) {
            Node next = curr.next;
            curr.next = prev; // Change next of current as previous node

            // If next NULL or next is the last node
            if (next == null || next.next == null) {
                prev.next = next;
                break;
            }
            // Change next of previous to next next
            prev.next = next.next;

            // Update previous and curr
            prev = next;
            curr = prev.next;
        }
        return node;
    }

    *//* Function to print nodes in a given linked list *//*
    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }*/
    //==================================================
    // Driver program to test above functions
    public static void main(String[] args) {
        /* The constructed linked list is:
         1->2->3->4->5->6->7 */
        head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);
        head.next.next.next.next.next.next = new Node(7);

        System.out.println("Linked list before calling pairwiseSwap() ");
        printList(head);
        head = pairWiseSwap(head);
        System.out.println("");
        System.out.println("Linked list after calling pairwiseSwap() ");
        printList(head);
        System.out.println("");
    }
    static Node head;
    /* Function to pairwise swap elements of a linked
     It returns head of the modified list, so return value
     of this node must be assigned */
    static Node pairWiseSwap(Node node) {
        if (node == null || node.next == null) {
            return node;
        }
        Node remaing = node.next.next;
        Node newhead = node.next;
        node.next.next = node;
        node.next = pairWiseSwap(remaing);
        return newhead;
    }
    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }



}
