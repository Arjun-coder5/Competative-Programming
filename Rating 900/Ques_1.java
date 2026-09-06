
import java.util.*;

public class Ques_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int xk = sc.nextInt();
            int yk = sc.nextInt();
            int xq = sc.nextInt();
            int yq = sc.nextInt();
            HashSet<String> set = new HashSet<>();
            long[] dx = {a, a, -a, -a, b, b, -b, -b};
            long[] dy = {b, -b, b, -b, a, -a, a, -a};

            for (int i = 0; i < 8; i++) {
                long newX = xk + dx[i];
                long newY = yk + dy[i];
                set.add(newX + "," + newY);

            }
            HashSet<String> queenSet = new HashSet<>();

            for (int i = 0; i < 8; i++) {
                long newX = xq + dx[i];
                long newY = yq + dy[i];

                queenSet.add(newX + "," + newY);
            }

            int count = 0;

            for (String position : queenSet) {
                if (set.contains(position)) {
                    count++;
                }
            }
            System.out.println(count);

        }
    }
}
