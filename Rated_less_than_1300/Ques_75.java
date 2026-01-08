import java.util.*;

public class Ques_75 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] h = new int[n];
        for (int i = 0; i < n; i++) {
            h[i] = sc.nextInt();
        }

        // Calculate sum of first window
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += h[i];
        }

        int minSum = windowSum;
        int index = 0; // 0-based index of result

        // Sliding window
        for (int i = k; i < n; i++) {
            windowSum += h[i];
            windowSum -= h[i - k];

            if (windowSum < minSum) {
                minSum = windowSum;
                index = i - k + 1;
            }
        }

        // Output 1-based index
        System.out.println(index + 1);
    }
}
