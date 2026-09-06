
import java.util.Scanner;

public class Ques_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
            int[] freq = new int[26];
            if (n - k <= 1) {
                System.out.println("Yes");
            } else if (n - k > 1) {
                for (int i = 0; i < s.length(); i++) {
                    freq[s.charAt(i) - 'a']++;
                }
                int odd = 0;

                for (int i = 0; i < 26; i++) {
                    if (freq[i] % 2 != 0) {
                        odd++;
                    }
                }
                  if (odd <= k + 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
            }
        }
}
