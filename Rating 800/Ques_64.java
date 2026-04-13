import java.util.*;

public class Ques_64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int t = sc.nextInt(); // Number of test cases
            while (t-- > 0) {
                int n = sc.nextInt();
                long l = sc.nextLong();
                long r = sc.nextLong();
                long k = sc.nextLong();
                
                List<Long> validChocolates = new ArrayList<>();
                
                for (int i = 0; i < n; i++) {
                    long price = sc.nextLong();
                    // Step 1: Only consider chocolates within [l, r]
                    if (price >= l && price <= r) {
                        validChocolates.add(price);
                    }
                }
                
                // Step 2: Sort the valid chocolates to buy cheapest first
                Collections.sort(validChocolates);
                
                int count = 0;
                for (long price : validChocolates) {
                    // Step 3: Buy if within budget
                    if (k >= price) {
                        k -= price;
                        count++;
                    } else {
                        break;
                    }
                }
                
                System.out.println(count);
            }
        }
        sc.close();
    }
}