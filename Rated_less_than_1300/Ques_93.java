import java.util.*;

public class Ques_93 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int ones = 0;
        int maxGain = Integer.MIN_VALUE;
        int current = 0;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x == 1) {
                ones++;
                x = -1;  
            } else {
                x = 1;   
            }

            current = Math.max(x, current + x);
            maxGain = Math.max(maxGain, current);
        }

        System.out.println(ones + maxGain);
    }
}
