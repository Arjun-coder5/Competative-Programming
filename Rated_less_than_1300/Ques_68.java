import java.util.*;

public class Ques_68 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        int[] cnt = new int[256];

        // count ONLY letters from heading
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if (c != ' ') {   // IGNORE spaces
                cnt[c]++;
            }
        }

        // try to build letter
        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);

            if (c == ' ') continue;  // spaces are FREE

            if (cnt[c] > 0) {
                cnt[c]--;
            } else {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }
}
