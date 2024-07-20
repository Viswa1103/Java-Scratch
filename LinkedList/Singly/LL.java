package LinkedList.Singly;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "-->");
            temp = temp.next;
        }
        System.out.print("End");
        System.out.println();
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size += 1;
    }

    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    // public void deleteFirst() {
    // head = head.next;
    // size--;
    // if (head == null) {
    // tail = null;
    // }
    // }

    // public void deleteLast() {
    // if (size <= 1) {
    // deleteFirst();
    // return;
    // }
    // Node secondLast = getIndex(size - 2);
    // tail = secondLast;
    // tail.next = null;
    // size--;

    // }

    public void delete(int index) {
        if (index == 0) {
            head = head.next;
            size--;
            if (head == null) {
                tail = null;
            }

        } else if (index == size - 1) {
            Node secondLast = getIndex(size - 2);
            tail = secondLast;
            tail.next = null;
            size--;

        }

        else {
            Node pre = getIndex(index - 1);
            pre.next = pre.next.next;
            size--;
        }

    }

    public Node getIndex(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;

        }
        return node;
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
