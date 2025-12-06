import java.util.*;

public class Ques_34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();          // number of pages in the book
        int[] a = new int[7];         // pages Petr can read each day

        for (int i = 0; i < 7; i++) {
            a[i] = sc.nextInt();
        }

        int day = 0;  // 0 -> Monday, 1 -> Tuesday, ..., 6 -> Sunday

        while (true) {
            n -= a[day];

            if (n <= 0) {
                System.out.println(day + 1); // convert to 1-based day
                break;
            }

            day = (day + 1) % 7;  // move to next day (cycle weekly)
        }
    }
}
