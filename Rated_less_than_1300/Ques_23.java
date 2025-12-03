import java.util.*;

public class Ques_23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = sc.next();

        HashSet<Character> set = new HashSet<>();

        for (char c : username.toCharArray()) {
            set.add(c);  // set stores only unique characters
        }

        int distinct = set.size();

        if (distinct % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
    }
}
