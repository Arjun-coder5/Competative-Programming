import java.util.Scanner;

public class Ques_53 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the number of test cases
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int w = sc.nextInt();
            int h = sc.nextInt();
            int n = sc.nextInt();
            
            long pieces = 1;
            
            // While width is even, divide and double the piece count
            while (w % 2 == 0) {
                w /= 2;
                pieces *= 2;
            }
            
            // While height is even, divide and double the piece count
            while (h % 2 == 0) {
                h /= 2;
                pieces *= 2;
            }
            
            // Final check
            if (pieces >= n) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        sc.close();
    }
}