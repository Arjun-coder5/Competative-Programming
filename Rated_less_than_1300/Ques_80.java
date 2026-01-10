import java.util.*;

public class Ques_80 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // boys
        int m = sc.nextInt(); // girls

        char first, second;
        int c1, c2;

        if (n >= m) {
            first = 'B'; c1 = n;
            second = 'G'; c2 = m;
        } else {
            first = 'G'; c1 = m;
            second = 'B'; c2 = n;
        }

        StringBuilder ans = new StringBuilder();

        while (c1 > 0 && c2 > 0) {
            ans.append(first);
            ans.append(second);
            c1--; c2--;
        }

        while (c1-- > 0) ans.append(first);
        while (c2-- > 0) ans.append(second);

        System.out.println(ans.toString());
    }
}
