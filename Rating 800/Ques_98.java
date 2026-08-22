import java.util.*;

public class Ques_98 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int ans = 0;

        ans += n / 100;
        n %= 100;

        ans += n / 20;
        n %= 20;

        ans += n / 10;
        n %= 10;

        ans += n / 5;
        n %= 5;

        ans += n;

        System.out.println(ans);
    }
}