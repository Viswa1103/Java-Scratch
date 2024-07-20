package LinkedList.Singly;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(23);
        list.insertFirst(33);
        list.insertFirst(43);
        list.insertFirst(53);
        list.insertFirst(63);
        list.display();

        list.delete(3);
        list.display();

    }

}
