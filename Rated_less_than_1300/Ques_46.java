import java.util.*;

public class Ques_46  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        Arrays.sort(a);

        int profit = 0;
        int count = 0;

        for (int i = 0; i < n && count < m; i++) {
            if (a[i] < 0) {
                profit += -a[i];
                count++;
            } else {
                break;
            }
        }

        System.out.println(profit);
    }
}
