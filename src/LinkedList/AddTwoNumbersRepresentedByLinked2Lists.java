package LinkedList;

public class AddTwoNumbersRepresentedByLinked2Lists {
    public static void main(String[] args) {
        head1 = new Node(7);
        head1.next = new Node(5);
        head1.next.next = new Node(9);
        head1.next.next.next = new Node(4);
        head1.next.next.next.next = new Node(6);
        System.out.print("First List is ");
        printList(head1);

        // creating seconnd list
        head2 = new Node(8);
        head2.next = new Node(4);
        System.out.print("Second List is ");
        printList(head2);

        // add the two lists and see the result
        Node rs = addTwoLists(head1, head2);
        System.out.print("Resultant List is ");
        printList(rs);
    }

    static Node head1, head2;

    static Node addTwoLists(Node first, Node second) {
        // res is head node of the resultant list
        Node res = null;
        Node prev = null;
        Node temp = null;
        int carry = 0, sum;

        // while both lists exist
        while (first != null || second != null) {
            // Calculate value of next
            // digit in resultant 
            // The next digit is sum
            // of following things
            // (i)  Carry
            // (ii) Next digit of first
            // list (if there is a next digit)
            // (ii) Next digit of second
            // list (if there is a next digit)
            sum = carry + (first != null ? first.data : 0)
                    + (second != null ? second.data : 0);

            // update carry for next calulation
            carry = (sum >= 10) ? 1 : 0;

            // update sum if it is greater than 10
            sum = sum % 10;

            // Create a new node with sum as data
            temp = new Node(sum);

            // if this is the first node then set
            // it as head of the resultant list
            if (res == null) {
                res = temp;
            }

            // If this is not the first
            // node then connect it to the rest.
            else {
                prev.next = temp;
            }

            // Set prev for next insertion
            prev = temp;

            // Move first and second pointers
            // to next nodes
            if (first != null) {
                first = first.next;
            }
            if (second != null) {
                second = second.next;
            }
        }

        if (carry > 0) {
            temp.next = new Node(carry);
        }

        // return head of the resultant list
        return res;
    }
    /* Utility function to print a linked list */

    static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println("");
    }


}
