package Tree.Re;

import java.util.Scanner;

public class Binary {

    private static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    public void add(Scanner sc) {
        System.out.println("Enter the Root node:");
        int value = sc.nextInt();
        root = new Node(value);
        add(sc, root);

    }

    private void add(Scanner sc, Node root) {
        System.out.println("Do you need to enter the left node" + root.value);
        Boolean left = sc.nextBoolean();
        if (left) {
            System.out.println("Enter the left node of the" + root.value);
            int value = sc.nextInt();
            root.left = new Node(value);
            add(sc, root.left);
        }
        System.out.println("Do you need to enter the right node" + root.value);
        Boolean right = sc.nextBoolean();
        if (right) {
            System.out.println("Enter the right node of the" + root.value);
            int value = sc.nextInt();
            root.right = new Node(value);
            add(sc, root.right);
        }

    }

    public void display() {
        display(root, 0);
    }

    private void display(Node root, int level) {
        if (root == null) {
            return;
        }
        display(root.right, level + 1);
        if (level != 0) {
            for (int i = 0; i < level - 1; i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|--------->" + root.value);
        } else {
            System.out.println(root.value);
        }
        display(root.left, level + 1);
    }
}
