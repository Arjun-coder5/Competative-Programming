import java.util.*;
public class Q_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            int n = s.length();
            char[] original = s.toCharArray();
            char[] sorted = s.toCharArray();
            Arrays.sort(sorted);
            int k = 0;
            for (int i = 0; i < n; i++) {
                if (original[i] != sorted[i]) {  // count mismatches
                    k++;
                }
            }
            System.out.println(k);
        }
    }
}
