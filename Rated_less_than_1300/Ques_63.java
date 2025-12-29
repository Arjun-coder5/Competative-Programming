import java.util.*;

public class Ques_63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int[] freq = new int[26];

        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        int odd = 0;
        for (int f : freq) {
            if (f % 2 == 1) {
                odd++;
            }
        }

        if (odd == 0 || odd % 2 == 1) {
            System.out.println("First");
        } else {
            System.out.println("Second");
        }
    }
}
