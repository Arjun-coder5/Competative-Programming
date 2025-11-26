import java.util.Scanner;

public class Ques_10 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();

    int remove = 0;

    for (int i = 0; i < n - 1; i++) {
      if (s.charAt(i) == s.charAt(i + 1)) {
        remove++;
      }
    }

    System.out.println(remove);
  }
}
