import java.util.*;

public class Ques_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next().toLowerCase();
        String s2 = sc.next().toLowerCase();

        int compare = s1.compareTo(s2);

        if (compare < 0) {
            System.out.println(-1);
        } else if (compare == 0) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
    }
}
