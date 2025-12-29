import java.util.*;

public class Ques_62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // value -> list of positions
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            map.computeIfAbsent(x, k -> new ArrayList<>()).add(i);
        }

        List<int[]> ans = new ArrayList<>();

        for (int x : map.keySet()) {
            List<Integer> pos = map.get(x);

            if (pos.size() == 1) {
                ans.add(new int[]{x, 0});
            } else {
                int diff = pos.get(1) - pos.get(0);
                boolean ok = true;

                for (int i = 2; i < pos.size(); i++) {
                    if (pos.get(i) - pos.get(i - 1) != diff) {
                        ok = false;
                        break;
                    }
                }

                if (ok) {
                    ans.add(new int[]{x, diff});
                }
            }
        }

        ans.sort(Comparator.comparingInt(a -> a[0]));

        System.out.println(ans.size());
        for (int[] p : ans) {
            System.out.println(p[0] + " " + p[1]);
        }
    }
}
