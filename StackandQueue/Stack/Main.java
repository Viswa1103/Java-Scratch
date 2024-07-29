package StackandQueue.Stack;

import Assignment.Daytwo.sort;

public class Main {
    public static void main(String[] args) {
        DyanamicStack s = new DyanamicStack(5);

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);

        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());

        // System.out.println(s.pop());

    }
}
