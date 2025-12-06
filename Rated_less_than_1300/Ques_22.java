import java.util.*;

public class Ques_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        while (n-- > 0) {
            String word = sc.next();

            if (word.length() > 10) {
                int between = word.length() - 2;
                System.out.println("" + word.charAt(0) + between + word.charAt(word.length() - 1));
            } else {
                System.out.println(word);
                
            }
        }
    }
}
