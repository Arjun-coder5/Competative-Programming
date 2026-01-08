import java.io.*;
import java.util.*;

public class Ques_73 {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            int zeros = 0;
            for (int i = 0; i < n; i++) {
                int x = Integer.parseInt(st.nextToken());
                if (x == 0) zeros++;
            }

            if (zeros % 2 == 1) {
                System.out.println("Alice");
            } else {
                System.out.println("Bob");
            }
        }
    }
}
