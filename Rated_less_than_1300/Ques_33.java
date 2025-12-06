import java.util.*;

public class Ques_33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] x = new int[n];
        int[] y = new int[n];

        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
      //  https://chatgpt.com/

        int count = 0;

        for (int i = 0; i < n; i++) {
            boolean left = false;
            boolean right = false;
            boolean up = false;
            boolean down = false;

            for (int j = 0; j < n; j++) {
                if (x[j] > x[i] && y[j] == y[i]) right = true;
                if (x[j] < x[i] && y[j] == y[i]) left = true;
                if (x[j] == x[i] && y[j] > y[i]) up = true;
                if (x[j] == x[i] && y[j] < y[i]) down = true;
            }

            if (left && right && up && down) {
                count++;
            }
        }

        System.out.println(count);   // ✅ PRINT ONCE
    }
}
