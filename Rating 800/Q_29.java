import java.util.*;

public class Q_29 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            
            String s = sc.next();
            
            int countA = 0;
            int countB = 0;
            int countC = 0;
            
            for (char ch : s.toCharArray()) {
                if (ch == 'A') countA++;
                else if (ch == 'B') countB++;
                else countC++;
            }
            
            if (countB == countA + countC) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}
