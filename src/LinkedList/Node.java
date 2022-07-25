package LinkedList;

class Node {
    public int flag;
    public Node ptr;
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }

    public Node() {
    }
}
