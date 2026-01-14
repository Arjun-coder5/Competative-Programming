import java.util.*;

public class Ques_86 {
    static class Team {
        int p, t;
        Team(int p, int t) {
            this.p = p;
            this.t = t;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        List<Team> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();
            int t = sc.nextInt();
            list.add(new Team(p, t));
        }

        // Sort: problems descending, penalty ascending
        Collections.sort(list, (a, b) -> {
            if (a.p != b.p) return b.p - a.p;
            return a.t - b.t;
        });

        Team ref = list.get(k - 1);
        int count = 0;

        for (Team team : list) {
            if (team.p == ref.p && team.t == ref.t) {
                count++;
            }
        }

        System.out.println(count);
    }
}
