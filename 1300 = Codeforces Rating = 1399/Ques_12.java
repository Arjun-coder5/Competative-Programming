import java.util.*;

public class Ques_12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long k = sc.nextLong();

        long maxJoy = Long.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            long f = sc.nextLong();
            long t = sc.nextLong();

            long joy;
            if (t <= k) {
                joy = f;
            } else {
                long extraTime = t - k;
                joy = f - extraTime;
            }

            maxJoy = Math.max(maxJoy, joy);
        }

        System.out.println(maxJoy);
        sc.close();
    }
}
