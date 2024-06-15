package LinearSearch;

import java.util.Scanner;

public class srtingsearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Enter the search character:");
        char ch = sc.next().charAt(0);

        int res = search(str, ch);
        if (res != -1) {
            System.out.println("Character is found in the " + res + " position");
        } else {
            System.out.println("Character is found");
        }
        sc.close();

    }

    static int search(String str, char ch) {
        if (str.length() == 0) {
            return -1;
        }
        for (char i : str.toCharArray()) {
            if (i == ch) {
                return (str.indexOf(i) + 1);
            }
        }
        return -1;
    }
}
