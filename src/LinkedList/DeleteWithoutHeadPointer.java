package LinkedList;

public class DeleteWithoutHeadPointer {
    static  Node head; // head of the list
    public static void main(String[] args) {
        /* Use push() to construct below list 1->12->1->4->1  */
        push(1);
        push(4);
        push(1);
        push(12);
        push(1);

        System.out.println("Before deleting");
        printList();
        deleteNode(head);
        System.out.println("\nAfter Deleting");
        printList();
    }

    /* Given a reference to the head of a list and an int,
        inserts a new Node on the front of the list. */
    public static void push(int new_data) {
        /* 1. alloc the Node and put the data */
        Node new_Node = new Node(new_data);

        /* 2. Make next of new Node as head */
        new_Node.next = head;

        /* 3. Move the head to point to new Node */
        head = new_Node;
    }

    /* This function prints contents of linked list
        starting from the given Node */
    public static void printList() {
        Node tNode = head;
        while (tNode != null) {
            System.out.print(tNode.data + " ");
            tNode = tNode.next;
        }
    }

    public static void deleteNode(Node Node_ptr) {
        Node temp = Node_ptr.next;
        Node_ptr.data = temp.data;
        Node_ptr.next = temp.next;
        temp = null;
    }


}
