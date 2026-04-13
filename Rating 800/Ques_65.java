import java.util.Scanner;

public class Ques_65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int t = sc.nextInt(); // Number of test cases
            
            while (t-- > 0) {
                int n = sc.nextInt(); // Length of the array
                boolean foundNonSquare = false;
                
                for (int i = 0; i < n; i++) {
                    int a = sc.nextInt();
                    
                    // Check if 'a' is NOT a perfect square
                    if (!isPerfectSquare(a)) {
                        foundNonSquare = true;
                    }
                }
                
                if (foundNonSquare) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
        sc.close();
    }

    // Helper method to check for perfect square
    public static boolean isPerfectSquare(int n) {
        if (n < 0) return false;
        int root = (int) Math.sqrt(n);
        return (root * root == n);
    }
}