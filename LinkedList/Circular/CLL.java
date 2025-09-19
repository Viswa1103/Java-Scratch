package LinkedList.Circular;

// import SimplePrograms.prime;

public class CLL {

    private Node head;
    private Node tail;

    private int size;

    public void insertFirst(int value) {
        Node node = new Node(value);
        if (head == null) {
            head = node;
            tail = node;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
        size++;

    }

    public void display() {
        Node node = head;
        if (head != null) {
            do {
                System.out.print(node.value + "-->");
                node = node.next;
            } while (node != head);
            System.out.println("END");
        }
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

    }
}
