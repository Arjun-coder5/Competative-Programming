import java.util.Scanner;

public class Ques_48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                
                // Case 1: If already divisible by 7, print it
                if (n % 7 == 0) {
                    System.out.println(n);
                } else {
                    // Case 2: Change only the units digit.
                    // Find the base (e.g., 123 -> 120)
                    int base = (n / 10) * 10;
                    
                    // Iterate through possible last digits (0-9)
                    for (int i = 0; i <= 9; i++) {
                        if ((base + i) % 7 == 0) {
                            System.out.println(base + i);
                            break;
                        }
                    }
                }
            }
        }
        sc.close();
    }
}