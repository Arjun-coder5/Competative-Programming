import java.util.*;

public class Ques_86 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            int maxFreq = 1;
            int count = 1;

            for (int i = 1; i < n; i++) {

                if (a[i] == a[i - 1]) {
                    count++;
                } else {
                    maxFreq = Math.max(maxFreq, count);
                    count = 1;
                }
            }

            maxFreq = Math.max(maxFreq, count);

            System.out.println(maxFreq);
        }
    }
}