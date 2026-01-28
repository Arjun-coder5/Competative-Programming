import java.util.*;

public class Ques_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int min = a[0];
        int max = a[0];
        int amazing = 0;

        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                amazing++;
                max = a[i];
            } else if (a[i] < min) {
                amazing++;
                min = a[i];
            }
        }

        System.out.println(amazing);
    }
}
