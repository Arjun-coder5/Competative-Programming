import java.util.Scanner;

public class Q_49 {
    
    // Helper method to find the Greatest Common Divisor
    public static int gcd(int a, int b) {
        while (b != 0) {
            a %= b;
            // Swap a and b
            int temp = a;
            a = b;
            b = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int k = sc.nextInt();
                
                // The ratio is k/100.
                // Minimum steps = 100 / gcd(k, 100)
                int commonDenominator = gcd(k, 100);
                System.out.println(100 / commonDenominator);
            }
        }
        sc.close();
    }
}