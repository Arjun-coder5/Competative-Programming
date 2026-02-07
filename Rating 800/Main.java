import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long[] a = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            long maxProduct = 0;

           
            for (int i = 0; i < n - 1; i++) {

                long currentProduct = a[i] * a[i+1];
                maxProduct = Math.max(maxProduct, currentProduct);
            }
            
            System.out.println(maxProduct);
        }
        sc.close();
    }
}