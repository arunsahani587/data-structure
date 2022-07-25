package LinkedList;

public class FloydsCycleFindingAlgorithm {
    static Node head;
    public static void main(String args[]) {
        push(20);
        push(4);
        push(15);
        push(10);
        head.next.next.next.next = head;

        detectLoop();
    }
    public static void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    static void detectLoop() {
        Node slow_p = head, fast_p = head;
        int flag = 0;
        while (slow_p != null && fast_p != null
                && fast_p.next != null) {
            slow_p = slow_p.next;
            fast_p = fast_p.next.next;
            if (slow_p == fast_p) {
                flag = 1;
                break;
            }
        }
        if (flag == 1)
            System.out.println("Loop found");
        else
            System.out.println("Loop not found");
    }


}
