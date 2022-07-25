package LinkedList;

public class MiddleElement {
    public static void main(String[] args) {
        for (int i = 5; i > 0; --i) {
            push(i);
            printList();
            printMiddle();
        }
    }
    static  Node head;
    static void printMiddle() {
        Node slow_ptr = head;
        Node fast_ptr = head;
        if (head != null) {
            while (fast_ptr != null && fast_ptr.next != null) {
                fast_ptr = fast_ptr.next.next;
                slow_ptr = slow_ptr.next;
            }
            System.out.println("The middle element is [" + slow_ptr.data + "] \n");
        }
    }
    public static void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    public static void printList() {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + "->");
            tnode = tnode.next;
        }
        System.out.println("NULL");
    }

    void printMiddle(Node head) {
        int count = 0;
        Node mid = head;
        while (head != null) {
            // Update mid, when 'count'
            // is odd number
            if ((count % 2) == 1)
                mid = mid.next;

            ++count;
            head = head.next;
        }
        if (mid != null)
            System.out.println("The middle element is [" + mid.data + "]\n");
    }
}
