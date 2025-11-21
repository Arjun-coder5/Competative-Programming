import java.util.*;

public class Ques_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); ) {
            if (s.charAt(i) == '.') {
                sb.append('0');
                i++;
            } else {
                // safe check: ensure we are not going out of bounds
                if (i + 1 < s.length() && s.charAt(i + 1) == '.') {
                    sb.append('1');
                } else {
                    sb.append('2');
                }
                i += 2;
            }
        }
        System.out.println(sb.toString());
    }
}
