import java.util.*;

public class Ques_64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        long x = sc.nextLong();
        long y = sc.nextLong();
        long ex = sc.nextLong();
        long ey = sc.nextLong();

        String wind = sc.next();

        for (int i = 0; i < t; i++) {
            char c = wind.charAt(i);

            // move only if it helps reach the destination
            if (c == 'E' && x < ex) x++;
            else if (c == 'W' && x > ex) x--;
            else if (c == 'N' && y < ey) y++;
            else if (c == 'S' && y > ey) y--;

            if (x == ex && y == ey) {
                System.out.println(i + 1); // earliest time
                return;
            }
        }

        System.out.println(-1);
    }
}
