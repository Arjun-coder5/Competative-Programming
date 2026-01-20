import java.util.*;

public class Ques_96 {
    static final long MOD = 1000000007L;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong();
        long n = sc.nextLong();

        long ans;
        long r = n % 6;

        if (r == 1) ans = x;
        else if (r == 2) ans = y;
        else if (r == 3) ans = y - x;
        else if (r == 4) ans = -x;
        else if (r == 5) ans = -y;
        else ans = x - y;   // r == 0

        ans = ((ans % MOD) + MOD) % MOD;
        System.out.println(ans);
    }
}
