import java.util.Scanner;
public class Ques_62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            long a1 = sc.nextLong();
            long a2 = sc.nextLong();
            long a3 = sc.nextLong();
            
        
            long val = Math.abs(a1 + a3 - 2 * a2);
            
            if (val % 3 == 0) {
                System.out.println(0);
            } else {
              
                System.out.println(1);
            }
        }
        
        sc.close();
    }
}