import java.util.*;

public class Ques_88 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();

            int[] freq = new int[101];

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                freq[x]++;
            }

            // Print one occurrence of every number
            for (int i = 0; i <= 100; i++) {
                if (freq[i] > 0) {
                    System.out.print(i + " ");
                    freq[i]--;
                }
            }

            // Print remaining duplicates
            for (int i = 0; i <= 100; i++) {
                while (freq[i] > 0) {
                    System.out.print(i + " ");
                    freq[i]--;
                }
            }

            System.out.println();
        }
    }
}