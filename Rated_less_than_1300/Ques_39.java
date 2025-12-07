import java.util.*;

public class Ques_39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // ✅ pehle n input lo

        if (n == 0) {           // ✅ special case baad mein check karo
            System.out.println("0 0 0");
            return;
        }

        int a = 0;
        int b = 1;

        while (b < n) {
            int c = a + b;
            a = b;
            b = c;
        }

        // ✅ final correct output
        System.out.println("0 " + a + " " + (b - a));
    }
}
