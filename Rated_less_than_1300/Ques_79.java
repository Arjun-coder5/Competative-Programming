import java.util.*;

public class Ques_79 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = s.charAt(i) - '0';
            b[i] = s.charAt(i + n) - '0';
        }

        Arrays.sort(a);
        Arrays.sort(b);

        boolean less = true;
        boolean greater = true;

        for (int i = 0; i < n; i++) {
            if (!(a[i] < b[i])) less = false;
            if (!(a[i] > b[i])) greater = false;
        }

        if (less || greater) System.out.println("YES");
        else System.out.println("NO");
    }
}
