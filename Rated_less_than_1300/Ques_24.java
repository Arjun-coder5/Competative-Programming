import java.util.*;

public class Ques_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String guest = sc.next();
        String host = sc.next();
        String pile = sc.next();

        String combined = guest + host;

        char[] arr1 = combined.toCharArray();
        char[] arr2 = pile.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (Arrays.equals(arr1, arr2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
