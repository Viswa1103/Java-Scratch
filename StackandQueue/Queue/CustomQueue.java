package StackandQueue.Queue;

public class CustomQueue {

    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int end = 0;

    public CustomQueue(int size) {
        this.data = new int[size];
    }

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public boolean isFull() {
        return end == data.length;
    }

    public boolean isEmpty() {
        return end == 0;
    }

    public boolean insert(int item) {
        if (isFull()) {
            System.out.println("Queue is full");
            return false;
        }

        data[end++] = item;
        return true;
    }

    public int delete() {
        if (isEmpty()) {
            System.out.println("The QUeue is Empty");
            return -1;
        }

        int removed = data[0];

        for (int i = 1; i < end; i++) {
            data[i - 1] = data[i];

        }
        end--;

        return removed;
    }

    public void display() {

        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

}
