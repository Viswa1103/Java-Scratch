package StackandQueue.Stack;

public class DyanamicStack extends stack {

    public DyanamicStack() {
        super();
    }

    public DyanamicStack(int size) {
        super(size);
    }

    @Override
    public boolean push(int item) {

        if (this.isFull()) {
            int[] temp = new int[2 * data.length];

            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }

            data = temp;
        }

        return super.push(item);
    }

}
