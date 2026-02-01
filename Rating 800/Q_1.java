import java.util.*;

public class Q_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long q = n / 3;
            long r = n % 3;
            long c1 = q;
            long c2 = q;
            if (r == 1) c1++;
            else if (r == 2) c2++;
            System.out.println(c1 + " " + c2);
        }
    }
}
