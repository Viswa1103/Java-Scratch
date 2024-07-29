package StackandQueue.Queue;

public class CircularQueue {

    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int end = 0;
    int front = 0;
    int size = 0;

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean insert(int item) {
        if (isFull()) {
            System.out.println("Queue is full");
            return false;
        }

        data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }

    public int delete() {
        if (isEmpty()) {
            System.out.println("The QUeue is Empty");
            return -1;
        }

        int removed = data[front++];

        front = front % data.length;
        size--;

        return removed;
    }

    public void display() {
        int i = front;
        do {
            System.out.print(data[i] + " ");
            i++;
            // i = i % data.length;
        } while (i != end);
        System.out.println();
    }

}
