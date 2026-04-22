import java.io.*;
import java.util.*;

public class Ques_75 {
    public static void main(String[] args) {
        FastReader sc = new FastReader(System.in);
        PrintWriter out = new PrintWriter(System.out);
        
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int h = sc.nextInt();
            
            Integer[] a = new Integer[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            
            // Sort in descending order to get the two strongest weapons
            Arrays.sort(a, Collections.reverseOrder());
            
            int max1 = a[0];
            int max2 = a[1];
            int cycleDamage = max1 + max2;
            
            int fullCycles = h / cycleDamage;
            int totalMoves = fullCycles * 2;
            int remainingH = h % cycleDamage;
            
            if (remainingH == 0) {
                out.println(totalMoves);
            } else if (remainingH <= max1) {
                out.println(totalMoves + 1);
            } else {
                out.println(totalMoves + 2);
            }
        }
        out.flush();
    }

    // Faster input reading for competitive programming
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader(InputStream in) {
            br = new BufferedReader(new InputStreamReader(in));
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }
}