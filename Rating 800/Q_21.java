import java.util.Scanner;

public class Q_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long x = sc.nextLong();
            int ans = 0;

            for (int s = 1; s <= 90; s++) {
                long y = x + s;
                if (digitSum(y) == s) {
                    ans++;
                }
            }

            System.out.println(ans);
        }
    }

    public static int digitSum(long n) {
        int s = 0;
        while (n > 0) {
            s += n % 10;
            n /= 10;
        }
        return s;
    }
}


