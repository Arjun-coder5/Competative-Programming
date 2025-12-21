import java.util.*;

public class Ques_51{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int start = Math.max(a + 1, n - b);
        int result = n - start + 1;

        System.out.println(result);
    }
}
