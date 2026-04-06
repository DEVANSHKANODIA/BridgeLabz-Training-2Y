package Tree;

public class TreeByPicture {

    public static void main(String[] args) {

        // Root
        Node root = new Node('A'); // A

        // Level 1
        root.left = new Node('B');   // B
        root.right = new Node('C');  // C

        // Level 2
        root.left.left = new Node('D');   // D
        root.left.right = new Node('E');  // E
        root.right.left = new Node('G');  // G
        root.right.right = new Node('H'); // H

        // Level 3
        root.left.right.left = new Node('I');  // I
        root.left.right.right = new Node('J'); // J
        root.right.left.left = new Node('K');  // K
        // Call preorder traversal
        System.out.println("Preorder Traversal:");
        preordertraverse(root);

        System.out.println("\nInorder Traversal:");
        Inordertraverse(root);
        System.out.println("\nPostorder Traversal:");
        Postordertraverse(root);
    }
    static void preordertraverse(Node z) {
        if (z == null) {
            return;
        }
        System.out.print(z.data + " "); // Visit root
        preordertraverse(z.left);       // Traverse left subtree
        preordertraverse(z.right);      // Traverse right subtree
    }
    static void Inordertraverse(Node z) {
        if (z == null) {
            return;
        }
        Inordertraverse(z.left);
        System.out.print(z.data + " "); // Visit root
        Inordertraverse(z.right);      // Traverse right subtree
    }
    static void Postordertraverse(Node z) {
        if (z == null) {
            return;
        }
        Postordertraverse(z.left);
        Postordertraverse(z.right);
        System.out.print(z.data + " "); // Visit root
    }
}