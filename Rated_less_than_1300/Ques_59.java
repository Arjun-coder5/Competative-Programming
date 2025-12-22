import java.util.*;

public class Ques_59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // passengers
        int m = sc.nextInt(); // planes

        PriorityQueue<Integer> maxPQ =
                new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minPQ =
                new PriorityQueue<>();

        for (int i = 0; i < m; i++) {
            int x = sc.nextInt();
            maxPQ.add(x);
            minPQ.add(x);
        }

        int maxSum = 0;
        int minSum = 0;

        // Maximum earning
        for (int i = 0; i < n; i++) {
            int x = maxPQ.poll();
            maxSum += x;
            if (x - 1 > 0) maxPQ.add(x - 1);
        }

        // Minimum earning
        for (int i = 0; i < n; i++) {
            int x = minPQ.poll();
            minSum += x;
            if (x - 1 > 0) minPQ.add(x - 1);
        }

        System.out.println(maxSum + " " + minSum);
    }
}
