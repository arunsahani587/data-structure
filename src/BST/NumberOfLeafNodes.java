package BST;

import java.util.LinkedList;
import java.util.Queue;

public class NumberOfLeafNodes {

    // Driver Code
   /* public static void main(String[] args) {
        {
            *//*   1
                / \
               2   3
              / \
             4   5
            Let us create Binary Tree shown in
            above example *//*
            Node root = newNode(1);
            root.left = newNode(2);
            root.right = newNode(3);
            root.left.left = newNode(4);
            root.left.right = newNode(5);

            *//* get leaf count of the above created tree *//*
            System.out.println(getLeafCount(root));
        }
    }
    static class Node {
        int data;
        Node left, right;
    }

    *//* Function to get the count of
    leaf Nodes in a binary tree*//*
    static int getLeafCount(Node node) {
        // If tree is empty
        if (node == null) {
            return 0;
        }

        // Initialize empty queue.
        Queue<Node> q = new LinkedList<>();

        // Do level order traversal starting from root
        int count = 0; // Initialize count of leaves
        q.add(node);
        while (!q.isEmpty()) {
            Node temp = q.peek();
            q.poll();

            if (temp.left != null) {
                q.add(temp.left);
            }
            if (temp.right != null) {
                q.add(temp.right);
            }
            if (temp.left == null &&
                    temp.right == null) {
                count++;
            }
        }
        return count;
    }

    *//* Helper function that allocates
    a new Node with the given data
    and null left and right pointers. *//*
    static Node newNode(int data) {
        Node node = new Node();
        node.data = data;
        node.left = node.right = null;
        return (node);
    }
*/
//==========================================
    /* Driver program to test above functions */
    private static Node root;
    public static void main(String args[]) {
        root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

        /* get leaf count of the abve tree */
        System.out.println("The leaf count of binary tree is : " + getLeafCount());
    }


    /* Function to get the count of leaf nodes in a binary tree*/
    static int getLeafCount() {
        return getLeafCount(root);
    }

    static int getLeafCount(Node node) {
        if (node == null)
            return 0;
        if (node.left == null && node.right == null)
            return 1;
        else
            return getLeafCount(node.left) + getLeafCount(node.right);
    }

  
}
