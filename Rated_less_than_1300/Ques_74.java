import java.util.*;

public class Ques_74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] count = new int[1001]; // since ai <= 1000
        
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            count[x]++;
        }
        
        int maxFreq = 0;
        for (int i = 1; i <= 1000; i++) {
            maxFreq = Math.max(maxFreq, count[i]);
        }
        
        if (maxFreq > (n + 1) / 2) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}