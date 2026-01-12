import java.util.*;

public class Ques_81 {
    static final int MAX = 1_000_000;
    static final int MOD = 1073741824; // 2^30

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Step 1: Precompute number of divisors for all numbers up to 1e6
        int[] d = new int[MAX + 1];
        for (int i = 1; i <= MAX; i++) {
            for (int j = i; j <= MAX; j += i) {
                d[j]++;
            }
        }

        long ans = 0;

        // Step 2: Triple loop
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                for (int k = 1; k <= c; k++) {
                    ans += d[i * j * k];
                    if (ans >= MOD) ans %= MOD;
                }
            }
        }

        System.out.println(ans % MOD);
    }
}
