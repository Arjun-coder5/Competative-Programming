import java.util.*;

public class Ques_78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long y = sc.nextLong();
        long k = sc.nextLong();
        long n = sc.nextLong();

        boolean found = false;
        
        long start = (y / k + 1) * k;

        for (long sum = start; sum <= n; sum += k) {
            long x = sum - y;
            if (x >= 1) {
                System.out.print(x + " ");
                found = true;
            }
        }

        if (!found) {
            System.out.println(-1);
        }
    }
}
