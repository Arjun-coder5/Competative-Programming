import java.util.*;

public class Q_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            long sum = 0;

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                sum += a[i];
            }

            if (sum % n != 0) {
                System.out.println(-1);
                continue;
            }

            long avg = sum / n;
            int count = 0;

            for (int x : a) {
                if (x > avg) count++;
            }

            System.out.println(count);
        }
    }
}
