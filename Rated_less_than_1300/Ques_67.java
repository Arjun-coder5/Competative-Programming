import java.util.*;

public class Ques_67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] cnt = new int[8];

        for (int i = 0; i < n; i++) {
            cnt[sc.nextInt()]++;
        }

        // ❌ invalid numbers
        if (cnt[3] > 0 || cnt[5] > 0 || cnt[7] > 0) {
            System.out.println(-1);
            return;
        }

        // ❌ feasibility check (MOST IMPORTANT)
        if (cnt[1] != cnt[2] || cnt[2] != cnt[4] + cnt[6]) {
            System.out.println(-1);
            return;
        }

        StringBuilder sb = new StringBuilder();

        // ✔️ first build (1,2,4)
        while (cnt[4] > 0) {
            sb.append("1 2 4\n");
            cnt[1]--;
            cnt[2]--;
            cnt[4]--;
        }

        // ✔️ then build (1,2,6)
        while (cnt[6] > 0) {
            sb.append("1 2 6\n");
            cnt[1]--;
            cnt[2]--;
            cnt[6]--;
        }

        System.out.print(sb.toString());
    }
}
