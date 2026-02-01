import java.util.*;

public class Q_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {

            int s1 = sc.nextInt();
            int s2 = sc.nextInt();
            int s3 = sc.nextInt();
            int s4 = sc.nextInt();

            int leftWinner = Math.max(s1, s2);
            int rightWinner = Math.max(s3, s4);
            int[] arr = {s1, s2, s3, s4};
            Arrays.sort(arr);

            int top1 = arr[3];
            int top2 = arr[2];

            if ((leftWinner == top1 || leftWinner == top2) &&
                (rightWinner == top1 || rightWinner == top2))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
