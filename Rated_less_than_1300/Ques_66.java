import java.util.*;

public class Ques_66 {

    static int[][] g = new int[5][5];
    static boolean[] used = new boolean[5];
    static int[] p = new int[5];
    static int ans = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // input
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                g[i][j] = sc.nextInt();
            }
        }

        // generate permutations
        permute(0);

        System.out.println(ans);
    }

    static void permute(int idx) {
        if (idx == 5) {
            simulate();
            return;
        }

        for (int i = 0; i < 5; i++) {
            if (!used[i]) {
                used[i] = true;
                p[idx] = i;
                permute(idx + 1);
                used[i] = false;
            }
        }
    }

    static void simulate() {
        ArrayList<Integer> line = new ArrayList<>();
        for (int x : p) line.add(x);

        int total = 0;

        while (!line.isEmpty()) {

            // talking
            for (int i = 0; i + 1 < line.size(); i += 2) {
                int a = line.get(i);
                int b = line.get(i + 1);
                total += g[a][b] + g[b][a];
            }

            // first student goes to shower
            line.remove(0);
        }

        ans = Math.max(ans, total);
    }
}
