import java.util.*;

public class Ques_82 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for (int c = 1; c <= n; c++) {
            int c2 = c * c;
            for (int a = 1; a <= c; a++) {
                int b2 = c2 - a * a;
                if (b2 <= 0) continue;

                int b = (int) Math.sqrt(b2);
                if (b * b == b2 && b >= a && b <= c) {
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}
