import java.util.Scanner;

public class Q_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int s = sc.nextInt();
                // The answer is the smallest n such that n*n >= s
                // This is equivalent to the ceiling of sqrt(s)
                int ans = (int) Math.ceil(Math.sqrt(s));
                System.out.println(ans);
            }
        }
    }
}