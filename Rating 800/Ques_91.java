import java.util.*;

public class Ques_91 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            int rb = sc.nextInt();
            int cb = sc.nextInt();

            int rd = sc.nextInt();
            int cd = sc.nextInt();

            int dr = 1;
            int dc = 1;

            int time = 0;

            while (true) {

                if (rb == rd || cb == cd) {
                    System.out.println(time);
                    break;
                }

                if (rb == n || rb == 1) {
                    dr = -dr;
                }

                if (cb == m || cb == 1) {
                    dc = -dc;
                }

                rb += dr;
                cb += dc;

                time++;
            }
        }
    }
}