import java.util.*;

public class Q_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            int single = 0;
            int pair = 0;

            int freq[] = new int[26];

            for (char x : s.toCharArray()) {
                freq[x - 'a']++;
            }

            for (int f : freq) {
                if (f >= 2) pair++;
                else if (f == 1) single++;
            }

            pair += single / 2;

            System.out.println(pair);   // print inside loop
        }
    }
}
