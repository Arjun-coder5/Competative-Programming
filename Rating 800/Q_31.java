import java.util.*;

public class Q_31{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[2 * n];
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }
            
            Arrays.sort(a);

            int[] b = new int[2 * n];
            for (int i = 0; i < n; i++) {
                b[2 * i] = a[i];        
                b[2 * i + 1] = a[i + n];
            }
            
            for (int i = 0; i < b.length; i++) {
                System.out.print(b[i] + " ");
            }
            System.out.println(); 
        }
    }
}
