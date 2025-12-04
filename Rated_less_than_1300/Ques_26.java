import java.util.*;

public class Ques_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String p = sc.nextLine();

        for (char c : p.toCharArray()) {
            if (c == 'H' || c == 'Q' || c == '9') {
                System.out.println("YES");
                return;
            }
        }

        System.out.println("NO");
    }
}
