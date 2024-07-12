package MazeProblem;

public class countpath {

    public static void main(String[] args) {
        System.out.println(count(3, 3));

    }

    static int count(int r, int c) {
        if (r == 1 && c == 1) {
            return 1;
        }
        int left = 0;
        int right = 0;

        if (r > 0) {
            left = count(r - 1, c);
        }
        if (c > 0) {
            right = count(r, c - 1);
        }

        return left + right;
    }
}
