import java.util.*;

public class Q_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int k = 1;
            while ((k * 2 + 1) < n) {
                k = k * 2 + 1;
            }

            System.out.println(k);
        }
    }
}
