package LinkedList;

public class NthNodeFromEndOfLinkedList {
    /*Driver program to test above methods */
    /*public static void main(String[] args) {
       push(20);
        push(4);
        push(15);
        push(35);

        printNthFromLast(4);
    }
    static  Node head; // head of the list
    static void printNthFromLast(int n) {
        int len = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            len++;
        }
        // check if value of n is not more than length of
        // the linked list
        if (len < n)
            return;

        temp = head;

        // 2) get the (len-n+1)th node from the beginning
        for (int i = 1; i < len - n + 1; i++)
            temp = temp.next;

        System.out.println(temp.data);
    }
    public static void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    static void printNthFromLast(Node head, int n) {
        int i = 0;

        if (head == null)
            return;
        printNthFromLast(head.next, n);

        if (++i == n)
            System.out.print(head.data);
    }*/

    /*Driver program to test above methods */
    public static void main(String[] args) {
        push(20);
        push(4);
        push(15);
        push(35);

        printNthFromLast(4);
    }
    static  Node head; // head of the list
    static void printNthFromLast(int n) {
        Node main_ptr = head;
        Node ref_ptr = head;
        int count = 0;
        if (head != null) {
            while (count < n) {
                if (ref_ptr == null) {
                    System.out.println(n + " is greater than the no " + " of nodes in the list");
                    return;
                }
                ref_ptr = ref_ptr.next;
                count++;
            }
            if (ref_ptr == null) {
                head = head.next;
                if (head != null)
                    System.out.println("Node no. " + n + " from last is " + head.data);
            } else {
                while (ref_ptr != null) {
                    main_ptr = main_ptr.next;
                    ref_ptr = ref_ptr.next;
                }
                System.out.println("Node no. " + n + " from last is " + main_ptr.data);
            }
        }
    }
    public static void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }



}
