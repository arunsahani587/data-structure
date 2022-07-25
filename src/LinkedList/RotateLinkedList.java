package LinkedList;

public class RotateLinkedList {
    /* Driver program to test above functions */
    /*public static void main(String args[]) {
        for (int i = 60; i >= 10; i -= 10)
            push(i);

        System.out.println("Given list");
        printList();
        rotate(4);
        System.out.println("Rotated Linked List");
        printList();
    }
    static Node head;
    static void rotate(int k) {
        if (k == 0)
            return;

        // Let us understand the below code for example k = 4
        // and list = 10->20->30->40->50->60.
        Node current = head;
        // current will either point to kth or NULL after this
        // loop. current will point to node 40 in the above example
        int count = 1;
        while (count < k && current != null) {
            current = current.next;
            count++;
        }
        // If current is NULL, k is greater than or equal to count
        // of nodes in linked list. Don't change the list in this case
        if (current == null)
            return;

        // current points to kth node. Store it in a variable.
        // kthNode points to node 40 in the above example
        Node kthNode = current;
        // current will point to last node after this loop
        // current will point to node 60 in the above example
        while (current.next != null)
            current = current.next;

        // Change next of last node to previous head
        // Next of 60 is now changed to node 10
        current.next = head;
        // Change head to (k+1)th node
        // head is now changed to node 50
        head = kthNode.next;
        // change next of kth node to null
        kthNode.next = null;
    }
    static void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }
    static void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }*/
    /* Driver code*/
    public static void main(String[] args) {
        for (int i = 60; i > 0; i -= 10)
            push(i);

        System.out.print("Given linked list \n");
        printList(head);
        rotate(4);
        System.out.print("\nRotated Linked list \n");
        printList(head);
    }
    static  Node head = null;
    static void rotate(int k) {
        if (k == 0)
            return;

        // Let us understand the below
        // code for example k = 4 and
        // list = 10.20.30.40.50.60.
        Node current = head;

        // Traverse till the end.
        while (current.next != null)
            current = current.next;

        current.next = head;
        current = head;

        // traverse the linked list to k-1 position which
        // will be last element for rotated array.
        for (int i = 0; i < k - 1; i++)
            current = current.next;

        // update the head_ref and last element pointer to null
        head = current.next;
        current.next = null;
    }

    /* UTILITY FUNCTIONS */
    /* Function to push a node */
    static void push(int new_data) {
        Node new_node = new Node();
        new_node.data = new_data;
        new_node.next = head;
        head = new_node;
    }
    static void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }


}
