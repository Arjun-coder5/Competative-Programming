import java.util.*;

public class Ques_70 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        // Length check
        if (s1.length() != s2.length()) {
            System.out.println("NO");
            return;
        }

        int first = -1, second = -1;
        int diffCount = 0;

        // Find differing positions
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                diffCount++;
                if (first == -1) first = i;
                else second = i;
            }
        }

        // Must be exactly 2 differences
        if (diffCount != 2) {
            System.out.println("NO");
            return;
        }

        // Check swap condition
        if (s1.charAt(first) == s2.charAt(second) &&
            s1.charAt(second) == s2.charAt(first)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
