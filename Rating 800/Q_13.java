
import java.util.Scanner;

public class Q_13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {

            int xa = sc.nextInt();
            int ya = sc.nextInt();

            int xb = sc.nextInt();
            int yb = sc.nextInt();

            int xf = sc.nextInt();
            int yf = sc.nextInt();

            int shortestPath = Math.abs(xa - xb) + Math.abs(ya - yb);

            if (xa == xb && xa == xf) {
                if (yf > Math.min(ya, yb) && yf < Math.max(ya, yb)) {
                    shortestPath += 2;
                }
            }

            if (ya == yb && ya == yf) {
                if (xf > Math.min(xa, xb) && xf < Math.max(xa, xb)) {
                    shortestPath += 2;
                }
            }

            System.out.println(shortestPath);
        }
    }
}
