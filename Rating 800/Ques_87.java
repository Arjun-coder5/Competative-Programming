import java.util.*;

public class Ques_87 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int ans = 0;

            for (int i = 0; i < n - 1; i++) {

                int small = Math.min(a[i], a[i + 1]);
                int big = Math.max(a[i], a[i + 1]);

                while (small * 2 < big) {
                    small *= 2;
                    ans++;
                }
            }

            System.out.println(ans);
        }
    }
}