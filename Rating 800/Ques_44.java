import java.util.Scanner;

public class Ques_44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                solve(sc);
            }
        }
        sc.close();
    }

    public static void solve(Scanner sc) {
        int l = sc.nextInt();
        int r = sc.nextInt();
        int k = sc.nextInt();

        // Case 1: Only one element in the range
        if (l == r) {
            if (l > 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            return;
        }

        // Case 2: Count odd numbers in the range [l, r]
        // The number of integers in [1, x] that are odd is (x + 1) / 2
        int oddsInRange = countOdds(r) - countOdds(l - 1);

        if (k >= oddsInRange) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static int countOdds(int n) {
        if (n < 1) return 0;
        return (n + 1) / 2;
    }
}