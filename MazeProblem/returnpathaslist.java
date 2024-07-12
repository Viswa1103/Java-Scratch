package MazeProblem;

import java.util.ArrayList;
import java.util.List;

public class returnpathaslist {
    public static void main(String[] args) {
        System.out.println(path("", 3, 3));

    }

    static List<String> path(String p, int r, int c) {
        if (r == 1 && c == 1) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        List<String> list = new ArrayList<>();

        if (r > 0) {
            list.addAll(path(p + 'D', r - 1, c));
        }
        if (c > 0) {
            list.addAll(path(p + 'R', r, c - 1));
        }

        return list;

    }
}
