import java.util.*;

public class Ques_78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);

            int sum = 0;
            boolean possible = true;

            for (int i = 0; i < n; i++) {
                if (sum + arr[i] == x) {
                    // try swapping with next
                    if (i == n - 1) {
                        possible = false;
                        break;
                    }
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
                sum += arr[i];
            }

            if (!possible) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
                for (int val : arr) {
                    System.out.print(val + " ");
                }
                System.out.println();
            }
        }
    }
}