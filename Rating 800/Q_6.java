import java.util.*;

public class Q_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            boolean[] visited = new boolean[26];
            char prev = '#';
            boolean ok = true;

            for(char c : s.toCharArray()) {
                if(c != prev) {
                    if(visited[c - 'A']) {
                        ok = false;
                        break;
                    }
                    visited[c - 'A'] = true;
                }
                prev = c;
            }

            System.out.println(ok ? "YES" : "NO");
        }
    }
}
