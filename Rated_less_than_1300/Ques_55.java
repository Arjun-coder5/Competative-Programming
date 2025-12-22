import java.util.*;

public class Ques_55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Upper half including middle
        for (int i = 0; i <= n; i++) {
            // spaces
            for (int s = 0; s < (n - i) * 2; s++) {
                System.out.print(" ");
            }

            // increasing numbers
            for (int j = 0; j <= i; j++) {
                System.out.print(j);
                if (j != i) System.out.print(" ");
            }

            // decreasing numbers
            for (int j = i - 1; j >= 0; j--) {
                System.out.print(" " + j);
            }

            System.out.println();
        }

        // Lower half
        for (int i = n - 1; i >= 0; i--) {
            // spaces
            for (int s = 0; s < (n - i) * 2; s++) {
                System.out.print(" ");
            }

            // increasing numbers
            for (int j = 0; j <= i; j++) {
                System.out.print(j);
                if (j != i) System.out.print(" ");
            }

            // decreasing numbers
            for (int j = i - 1; j >= 0; j--) {
                System.out.print(" " + j);
            }

            System.out.println();
        }
    }
}
