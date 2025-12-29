import java.util.*;

public class Ques_61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;

        long[] arr = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();   
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }

        long maxDiff = max - min;

        long countMin = 0;
        long countMax = 0;

        for (long x : arr) {
            if (x == min) countMin++;
            if (x == max) countMax++;
        }

        long ways;
        if (min == max) {
            ways = (long) n * (n - 1) / 2;  
        } else {
            ways = countMin * countMax;
        }

        System.out.println(maxDiff + " " + ways);
    }
}
