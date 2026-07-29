import java.util.*;

public class Ques_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();

            long three = Math.min(k, n / 3);

            long ans = 2 * three;

            n -= 3 * three;
            k -= three;

            long one = Math.min(k, n);

            ans += one;

            System.out.println(ans);
        }

        sc.close();
    }
}