package LinkedList;

import java.util.LinkedList;
import java.util.Stack;

public class ReverseALinkedList {
    /*  public static void main(String[] args) {
          Node head = new Node(85);
          head.next = new Node(15);
          head.next.next = new Node(4);
          head.next.next.next = new Node(20);
          System.out.println("Given Linked list");
          printList(head);
          head = reverse(head);
          System.out.println("");
          System.out.println("Reversed linked list ");
          printList(head);
      }
      static Node reverse(Node node) {
          Node prev = null;
          Node current = node;
          Node next = null;
          while (current != null) {
              next = current.next;
              current.next = prev;
              prev = current;
              current = next;
          }
          node = prev;
          return node;
      }
      static void printList(Node node) {
          while (node != null) {
              System.out.print(node.data + " ");
              node = node.next;
          }
      }*/


    //recursive
    /*static Node head;
    public static void main(String args[]) {
        push(20);
        push(4);
        push(15);
        push(85);
        System.out.println("Given linked list");
        print();
        head = reverse(head);
        System.out.println("Reversed Linked list");
        print();
    }
    static Node reverse(Node head) {
        if (head == null || head.next == null)
            return head;

        *//* reverse the rest list and put
        the first element at the end *//*
        Node rest = reverse(head.next);
        head.next.next = head;

        *//* tricky step -- see the diagram *//*
        head.next = null;

        *//* fix the head pointer *//*
        return rest;
    }
    static void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    static void push(int data) {
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
    }*/

    //using stack
    // Driver Code
    public static void main(String[] args) {
        insert_back(1);
        insert_back(2);
        insert_back(3);
        insert_back(4);
        System.out.print("Given linked list\n");
        printlist(head);
        reverseLL();
        System.out.print("\nReversed linked list\n");
        printlist(head);
    }

    static Node head = null;
    static void reverseLL() {
        Stack<Node> s = new Stack<>();
        Node temp = head;
        while (temp.next != null) {
            s.add(temp);
            temp = temp.next;
        }
        head = temp;
        while (!s.isEmpty()) {
            temp.next = s.peek();
            s.pop();
            temp = temp.next;
        }
        temp.next = null;
    }
    static void printlist(Node temp) {
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    static void insert_back(int value) {
        // we have used insertion at back method
        // to enter values in the list.(eg:
        // head.1.2.3.4.Null)
        Node temp = new Node();
        temp.data = value;
        temp.next = null;

        // If *head equals to null
        if (head == null) {
            head = temp;
            return;
        } else {
            Node last_node = head;
            while (last_node.next != null) {
                last_node = last_node.next;
            }
            last_node.next = temp;
            return;
        }
    }



}
