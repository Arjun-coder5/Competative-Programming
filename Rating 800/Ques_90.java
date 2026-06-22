import java.util.*;

public class Ques_90 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            for (int i = 0; i < n; i++) {
                System.out.print(2 * i + 3 + " ");
            }
            System.out.println();
        }
    }
}