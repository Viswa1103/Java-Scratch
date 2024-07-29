package StackandQueue.Queue;

public class Main {
    public static void main(String[] args) {

        CircularQueue queue = new CircularQueue();
        queue.insert(11);
        queue.insert(22);
        queue.insert(33);
        queue.insert(44);
        queue.insert(55);
        queue.insert(66);

        queue.display();
        queue.delete();
        queue.insert(77);
        queue.display();

    }

}
