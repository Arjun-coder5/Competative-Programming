import java.util.*;

public class Ques_84 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sumTop = 0, sumBottom = 0;
        boolean canFix = false;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            sumTop += x;
            sumBottom += y;
            if ((x + y) % 2 == 1) {
                canFix = true;
            }
        }

        if (sumTop % 2 == 0 && sumBottom % 2 == 0) {
            System.out.println(0);
        } else if (sumTop % 2 == 1 && sumBottom % 2 == 1 && canFix) {
            System.out.println(1);
        } else {
            System.out.println(-1);
        }
    }
}
