import java.util.*;

public class Q_30 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            
            long l1 = sc.nextLong();
            long l2 = sc.nextLong();
            long l3 = sc.nextLong();
            
            boolean possible = false;
            
            // Case 1: Two equal + third even
            if (l1 == l2 && l3 % 2 == 0) possible = true;
            if (l2 == l3 && l1 % 2 == 0) possible = true;
            if (l1 == l3 && l2 % 2 == 0) possible = true;
            
            // Case 2: One equals sum of other two
            if (l1 == l2 + l3) possible = true;
            if (l2 == l1 + l3) possible = true;
            if (l3 == l1 + l2) possible = true;
            
            if (possible) System.out.println("YES");
            else System.out.println("NO");
        }
        
        sc.close();
    }
}
