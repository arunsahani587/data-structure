package BST;

public class CheckIfBinaryTreeHeightIsBalancedOrNot {
    /*public static void main(String args[]) {
        CheckIfBinaryTreeHeightIsBalancedOrNot tree = new CheckIfBinaryTreeHeightIsBalancedOrNot();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.left.left.left = new Node(8);

        if (tree.isBalanced(tree.root))
            System.out.println("Tree is balanced");
        else
            System.out.println("Tree is not balanced");
    }

    Node root;

    *//* Returns true if binary tree with root as root is height-balanced *//*
    boolean isBalanced(Node node) {
        int lh; *//* for height of left subtree *//*

        int rh; *//* for height of right subtree *//*

        *//* If tree is empty then return true *//*
        if (node == null)
            return true;

        *//* Get the height of left and right sub trees *//*
        lh = height(node.left);
        rh = height(node.right);

        if (Math.abs(lh - rh) <= 1
                && isBalanced(node.left)
                && isBalanced(node.right))
            return true;

        *//* If we reach here then tree is not height-balanced *//*
        return false;
    }

    *//* UTILITY FUNCTIONS TO TEST isBalanced() FUNCTION *//*
    *//*  The function Compute the "height" of a tree. Height is the
        number of nodes along the longest path from the root node
        down to the farthest leaf node.*//*
    int height(Node node) {
        *//* base case tree is empty *//*
        if (node == null)
            return 0;

        *//* If tree is not empty then height = 1 + max of left
         height and right heights *//*
        return 1 + Math.max(height(node.left), height(node.right));
    }
*/
//=========================================================================


    static class Height {
        int height = 0;
    }

    Node root;

    /* Returns true if binary tree with root as root is height-balanced */
    public static void main(String args[]) {
        Height height = new Height();

        /* Constructed binary tree is
                   1
                 /   \
                2      3
              /  \    /
            4     5  6
            /
           7         */
        CheckIfBinaryTreeHeightIsBalancedOrNot tree = new CheckIfBinaryTreeHeightIsBalancedOrNot();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(6);
        tree.root.left.left.left = new Node(7);
        if (tree.isBalanced(tree.root, height))
            System.out.println("Tree is balanced");
        else
            System.out.println("Tree is not balanced");
    }

    boolean isBalanced(Node root, Height height) {
        /* If tree is empty then return true */
        if (root == null) {
            height.height = 0;
            return true;
        }
        /* Get heights of left and right sub trees */
        Height lheight = new Height(), rheight = new Height();
        boolean l = isBalanced(root.left, lheight);
        boolean r = isBalanced(root.right, rheight);
        int lh = lheight.height, rh = rheight.height;
        /* Height of current node is max of heights of
           left and right subtrees plus 1*/
        height.height = (lh > rh ? lh : rh) + 1;

        /* If difference between heights of left and right
           subtrees is more than 2 then this node is not balanced
           so return 0 */
        if (Math.abs(lh - rh) >= 2)
            return false;

        /* If this node is balanced and left and right subtrees
           are balanced then return true */
        else
            return l && r;
    }


}
