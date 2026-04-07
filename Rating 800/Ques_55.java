import java.util.*;
public class Ques_55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.util.in);
        
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            boolean hasNegative = false;
            int maxVal = 0;
            
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (a[i] < 0) {
                    hasNegative = true;
                }
                maxVal = Math.max(maxVal, a[i]);
            }
            
            if (hasNegative) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
                System.out.println(maxVal + 1);
                for (int i = 0; i <= maxVal; i++) {
                    System.out.print(i + (i == maxVal ? "" : " "));
                }
                System.out.println();
            }
        }
        sc.close();
    }
}