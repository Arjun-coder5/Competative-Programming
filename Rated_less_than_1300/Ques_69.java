import java.util.*;

public class Ques_69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int cnt100 = 0, cnt200 = 0;

        for (int i = 0; i < n; i++) {
            int w = sc.nextInt();
            if (w == 100) cnt100++;
            else cnt200++;
        }

        int total = cnt100 * 100 + cnt200 * 200;

        // total must be even
        if (total % 2 != 0) {
            System.out.println("NO");
            return;
        }

        // now check feasibility
        if (cnt100 == 0) {
            // only 200g apples
            System.out.println("NO"); // because target = total/2 = 100*k, can't make with only 200s unless k even
        } else if (cnt100 % 2 == 0) {
            System.out.println("YES");
        } else if (cnt200 > 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
