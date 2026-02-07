import java.util.*;

public class Q_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();

            int digits = String.valueOf(n).length();

            long rep = 0;
            for (int i = 0; i < digits; i++) {
                rep = rep * 10 + 1;
            }

            long ans = (digits - 1) * 9 + (n / rep);
            System.out.println(ans);
        }
    }
}
