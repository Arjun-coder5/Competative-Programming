import java.util.*;

public class Ques_84 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int px = sc.nextInt();
            int py = sc.nextInt();

            String s = sc.next();

            int U = 0;
            int D = 0;
            int L = 0;
            int R = 0;

            for (int i = 0; i < s.length(); i++) {

                char ch = s.charAt(i);

                if (ch == 'U') U++;
                else if (ch == 'D') D++;
                else if (ch == 'L') L++;
                else if (ch == 'R') R++;
            }

            boolean possible = true;

            if (px > 0 && R < px) {
                possible = false;
            }

            if (px < 0 && L < Math.abs(px)) {
                possible = false;
            }

            if (py > 0 && U < py) {
                possible = false;
            }

            if (py < 0 && D < Math.abs(py)) {
                possible = false;
            }

            if (possible) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}