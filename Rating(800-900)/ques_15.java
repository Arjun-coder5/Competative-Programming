import java.util.Scanner;

public class ques_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            boolean sorted = true;

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();

                if (i > 0 && arr[i] < arr[i - 1]) {
                    sorted = false;
                }
            }

            if (!sorted) {
                System.out.println(0);
                continue;
            }

            int minDiff = Integer.MAX_VALUE;

            for (int i = 0; i < n - 1; i++) {
                minDiff = Math.min(minDiff, arr[i + 1] - arr[i]);
            }

            System.out.println(minDiff / 2 + 1);
        }

        sc.close();
    }
}