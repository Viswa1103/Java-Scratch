package Tree.BinaryTree;

import java.util.Scanner;

public class BinaryTree {
    private static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    public void populate(Scanner sc) {
        System.out.println("Enter the value of the Root Node : ");
        int value = sc.nextInt();
        root = new Node(value);
        populate(sc, root);

    }

    private void populate(Scanner sc, Node root) {
        System.out.println("Do you want to enter the left of the " + root.value);
        boolean left = sc.nextBoolean();
        if (left) {
            System.out.println("Enter the left of the " + root.value);
            int value = sc.nextInt();
            root.left = new Node(value);
            populate(sc, root.left);
        }

        System.out.println("Do you want to enter the Right of the " + root.value);
        boolean right = sc.nextBoolean();
        if (right) {
            System.out.println("Enter the right of the " + root.value);
            int value = sc.nextInt();
            root.right = new Node(value);
            populate(sc, root.right);
        }
    }

    public void display() {
        display(root);
    }

    private void display(Node node) {
        if (node == null) {
            return;
        }

        System.out.println(node.value + "\t");
        display(node.left);
        display(node.right);

    }

    public void prettyDisplay() {
        prettyDisplay(root, 0);
    }

    private void prettyDisplay(Node node, int level) {
        if (node == null) {
            return;
        }

        prettyDisplay(node.right, level + 1);
        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t");
            }
            System.out.println("|------->" + node.value);
        } else {
            System.out.println(node.value);
        }
        prettyDisplay(node.left, level + 1);

    }
}
