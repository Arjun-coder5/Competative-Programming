import java.util.*;

public class Ques_54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 1) {
            System.out.println(1);
            return;
        }

        // print n first
        System.out.print(n + " ");
        
        // print 1 to n-1
        for (int i = 1; i < n; i++) {
            System.out.print(i + " ");
        }
    }
}
