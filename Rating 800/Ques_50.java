import java.util.Scanner;

public class Ques_50 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in); 
        if (sc.hasNextInt()) {
            int t = sc.nextInt();
            while (t-- > 0) {
                String s = sc.next();
                solve(s);
            }
        }
        sc.close();
    }
    public static void solve(String s) {
        int zeros = 0;
        int ones = 0;
        // Count occurrences of '0' and '1'
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                zeros++;
            } else {
                ones++;
            }
        } 
        // If counts are different, the minority is the smaller count
        if (zeros != ones) {
            System.out.println(Math.min(zeros, ones));
        } else {
            // If counts are equal, reducing the substring by 1 character
            // makes the new minority (zeros - 1)
            System.out.println(zeros - 1);
        }
    }
}