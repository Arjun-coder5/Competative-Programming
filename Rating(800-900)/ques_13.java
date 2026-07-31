import java.util.*;

public class ques_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();

            if (c % 2 == 1) {
                a++;
            } else {
                b++;
            }

            if (a > b) {
                System.out.println("First");
            } else {
                System.out.println("Second");
            }
        }
    }
}