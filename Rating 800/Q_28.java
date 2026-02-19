import java.util.*;

public class Q_28 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            
            long k = sc.nextLong();
            
            long n = (long)Math.ceil(Math.sqrt(k));
            long mid = n*n - n + 1;
            
            if (k >= mid) {
                long row = n;
                long col = n*n - k + 1;
                System.out.println(row + " " + col);
            } else {
                long row = k - (n-1)*(n-1);
                long col = n;
                System.out.println(row + " " + col);
            }
        }
        
        sc.close();
    }
}
