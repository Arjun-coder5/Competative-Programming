import java.util.*;

public class Q_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = String.valueOf(n);

            int digits = s.length();
            int firstDigit = s.charAt(0) - '0';

            int ans = (digits - 1) * 9 + firstDigit;

            // build number like 333 or 7777
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < digits; i++) {
                sb.append(firstDigit);
            }

            int formed = Integer.parseInt(sb.toString());

            if (formed > n) {
                ans--;
            }

            System.out.println(ans);
        }
    }
}
