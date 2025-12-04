import java.util.*;

public class Ques_30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] pos = new int[n + 1];

        // store positions of each value
        for (int i = 1; i <= n; i++) {
            int value = sc.nextInt();
            pos[value] = i;
        }

        int m = sc.nextInt();
        long vasya = 0;
        long petya = 0;

        for (int i = 0; i < m; i++) {
            int query = sc.nextInt();
            int p = pos[query];

            vasya += p;
            petya += (n - p + 1);
        }

        System.out.println(vasya + " " + petya);
    }
}
