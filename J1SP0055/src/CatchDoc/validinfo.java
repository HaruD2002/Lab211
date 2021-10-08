package CatchDoc;

import Doctor.docinfo;
import java.util.*;

/**
 *
 * @author Admin
 */
public class validinfo {

    private static final Scanner sc = new Scanner(System.in);
    docinfo dc = new docinfo();

    public static String validString() {
        String s;
        while (true) {
            s = sc.nextLine().trim();
            if (s.isEmpty()) {
                System.err.println("Empty value: please re-enter:");
            } else {
                return s;
            }
        }
    }

    public static int validA() {
        while (true) {
            int n = 0;
            do {
                while (!sc.hasNextInt()) {
                    String input = sc.next();
                    System.err.println("Not a number");
                }
                n = sc.nextInt();
                if (n < 0) {
                    System.err.println("Negative Number");
                } else {
                    return n;
                }

            } while (n < 0);
        }
    }

    public static String checkInputStringEmpty(String s) {
        String r = sc.nextLine().trim();
        if (r.isEmpty()) {
            System.err.println("Keep");
            return s;
        }
        return r;
    }

    public static int checkInputIntEmpty(int i) {
        while (true) {
            try {
                String result = sc.nextLine().trim();
                if (!result.isEmpty()) {
                    System.err.println("Your input is empty, this information not change!");
                    return Integer.parseInt(result);
                } else {
                    return i;
                }
            } catch (NumberFormatException e) {
                System.out.println("Enter again:");
            }
        }
    }
}
