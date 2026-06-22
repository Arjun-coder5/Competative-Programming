import java.util.*;

public class Ques_92 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();

            char mn = 'z';
            int idx = 0;

            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) < mn) {
                    mn = s.charAt(i);
                    idx = i;
                }
            }

            String a = String.valueOf(mn);
            String b = s.substring(0, idx) + s.substring(idx + 1);

            System.out.println(a + " " + b);
        }
    }
}