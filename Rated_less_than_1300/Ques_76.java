import java.util.*;

public class Ques_76 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[m];

        int minA = Integer.MAX_VALUE;
        int maxA = Integer.MIN_VALUE;

        // Read correct solutions
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            minA = Math.min(minA, a[i]);
            maxA = Math.max(maxA, a[i]);
        }

        int minB = Integer.MAX_VALUE;

        // Read wrong solutions
        for (int j = 0; j < m; j++) {
            b[j] = sc.nextInt();
            minB = Math.min(minB, b[j]);
        }

        int v = Math.max(maxA, 2 * minA);

        if (v < minB) {
            System.out.println(v);
        } else {
            System.out.println(-1);
        }
    }
}
