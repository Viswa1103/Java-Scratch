package LinkedList.Doubly;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "-->");
            temp = temp.next;

        }
        System.out.println("End");
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        if (head != null)
            head.pre = node;
        node.pre = null;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;

    }

    public void insertLast(int value) {
        Node node = new Node(value);
        if (tail == null) {
            insertFirst(value);
            return;
        }
        // if (head == null) {
        // node = head;
        // node.pre = null;
        // return;
        // }

        tail.next = node;
        node.pre = tail;
        node.next = null;
        tail = node;
        size++;

    }

    public void insert(int value, int index) {

        Node node = new Node(value);

        if (head == null) {
            head = node;
            node.pre = null;
            return;
        }
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        node.next = temp.next;
        if (temp.next != null)
            temp.next.pre = node;
        temp.next = node;
        node.pre = temp;
        size++;
    }

    private class Node {
        private int value;
        private Node next;
        private Node pre;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node pre) {
            this.value = value;
            this.next = next;
            this.pre = pre;
        }

    }

}
