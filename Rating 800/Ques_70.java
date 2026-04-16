import java.util.Scanner;

public class Ques_70 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                long n = sc.nextLong();
                
                // A number can only be a sum of (2050 * 10^k) 
                // if the number itself is divisible by 2050.
                if (n % 2050 != 0) {
                    System.out.println("-1");
                } else {
                    long quotient = n / 2050;
                    long sumOfDigits = 0;
                    
                    // Sum the digits of the quotient
                    while (quotient > 0) {
                        sumOfDigits += quotient % 10;
                        quotient /= 10;
                    }
                    
                    System.out.println(sumOfDigits);
                }
            }
        }
        sc.close();
    }
}