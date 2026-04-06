package Tree;

public class treefirst {
    public static void main(String[] args){
        //Zero Level
        Node root=new Node(10);
//        Node nodeB=new Node(15);
//        Node nodeC=new Node(20);
//        Node nodeD=new Node(30);
//        Node nodeE=new Node(40);
//        Node nodeF=new Node(50);
//        Node nodeG=new Node(60);
//        Node nodeH=new Node(70);
//        Node nodeI=new Node(80);
//        Node nodeJ =new Node(90);

//        root.left=nodeB;
//        root.right= nodeC;
//        nodeB.left=nodeD;
//        nodeB.right=nodeE;
//        nodeE.left=nodeH;
//        nodeE.right=nodeI;
//        nodeC.left=nodeF;
//        nodeC.right=nodeG;
//        nodeF.right=nodeJ;
        //First Level
        root.left=new Node(15);
        root.right=new Node(20);
        //Second Level
        root.left.left=new Node(30);
        root.left.right=new Node(40);
        root.right.left=new Node(50);
        root.right.right=new Node(60);
        //Third Level
        root.left.right.left=new Node(70);
        root.left.right.right=new Node(80);
        root.right.left.right=new Node(90);
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
