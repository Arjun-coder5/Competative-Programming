import java.util.*;

public class Ques_101 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int count = 0;
        int cutoff = a[k - 1];

        for (int i = 0; i < n; i++) {

            if (a[i] >= cutoff && a[i] > 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}