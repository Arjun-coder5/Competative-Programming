import java.util.*;

public class Ques_90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] v = new long[n];
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextLong();
        }

        // Prefix sum of original
        long[] pref1 = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            pref1[i] = pref1[i - 1] + v[i - 1];
        }

        // Sorted copy
        long[] sorted = v.clone();
        Arrays.sort(sorted);

        // Prefix sum of sorted
        long[] pref2 = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            pref2[i] = pref2[i - 1] + sorted[i - 1];
        }

        int m = sc.nextInt();
        while (m-- > 0) {
            int type = sc.nextInt();
            int l = sc.nextInt();
            int r = sc.nextInt();

            if (type == 1) {
                System.out.println(pref1[r] - pref1[l - 1]);
            } else {
                System.out.println(pref2[r] - pref2[l - 1]);
            }
        }
    }
}
