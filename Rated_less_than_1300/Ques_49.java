import java.util.*;

public class Ques_49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        System.out.println(s.replaceAll("(WUB)+", " ").trim());
    }
}
