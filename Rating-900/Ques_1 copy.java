import java.util.*;

public class Ques_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            boolean found = false;

            int n = sc.nextInt();

            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            for (int l = 0; l < n && !found; l++) {

                for (int r = l; r < n && !found; r++) {

                    int[] copy = a.clone();

                    opr(copy, l, r);

                    if (allZero(copy)) {

                        System.out.println((l + 1) + " " + (r + 1));

                        found = true;
                    }
                }
            }
        }

        sc.close();
    }

    public static void opr(int[] copy, int l, int r) {

        int xor = 0;

       
        for (int i = l; i <= r; i++) {
            xor ^= copy[i];
        }

       
        for (int i = l; i <= r; i++) {
            copy[i] = xor;
        }
    }

    public static boolean allZero(int[] copy) {

        for (int num : copy) {
            if (num != 0) {
                return false;
            }
        }

        return true;
    }
}

