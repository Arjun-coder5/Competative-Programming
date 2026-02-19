import java.util.*;

public class Q_277 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            
            int n = sc.nextInt();
            
            int count1 = 0;
            int count2 = 0;
            
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (x == 1) count1++;
                else count2++;
            }
            
            int sum = count1 + 2 * count2;
            
            if (sum % 2 != 0) {
                System.out.println("NO");
            } 
            else {
                int half = sum / 2;
                
                if (half % 2 == 1 && count1 == 0) {
                    System.out.println("NO");
                } 
                else {
                    System.out.println("YES");
                }
            }
        }
        
        sc.close();
    }
}
