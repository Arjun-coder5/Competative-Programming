import java.util.*;

public class Ques_50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        String s = sc.next();

        int[] freq = new int[26];

        // Count frequencies
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }

        // Check if possible
        for (int i = 0; i < 26; i++) {
            if (freq[i] % k != 0) {
                System.out.println("-1");
                return;
            }
        }

        // Build one block
        StringBuilder block = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < freq[i] / k; j++) {
                block.append((char) ('a' + i));
            }
        }

        // Print k times
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < k; i++) {
            result.append(block);
        }

        System.out.println(result.toString());
    }
}
