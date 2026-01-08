import java.io.*;
import java.util.*;

public class Ques_72 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        long minL = Long.MAX_VALUE;
        long maxR = Long.MIN_VALUE;

        long[] L = new long[n];
        long[] R = new long[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            L[i] = Long.parseLong(st.nextToken());
            R[i] = Long.parseLong(st.nextToken());

            minL = Math.min(minL, L[i]);
            maxR = Math.max(maxR, R[i]);
        }

        for (int i = 0; i < n; i++) {
            if (L[i] == minL && R[i] == maxR) {
                System.out.println(i + 1);
                return;
            }
        }

        System.out.println(-1);
    }
}
