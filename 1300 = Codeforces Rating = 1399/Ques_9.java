import java.util.*;

public class Ques_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int total = n * n;
        int half = n / 2;

        for (int i = 1; i <= n; i++) {
            int start = i;
            for (int j = 0; j < half; j++) {
                System.out.print(start + " " + (total - start + 1) + " ");
                start += n;
            }
            System.out.println();
        }
        sc.close();
    }
}
