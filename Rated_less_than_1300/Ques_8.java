import java.util.Scanner;

public class Ques_8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String ans = "";
    int lower = 0, upper = 0;

    for (char ch : s.toCharArray()) {
      if (Character.isUpperCase(ch)) upper++;
      else lower++;
    }

 
    if (upper > lower) {
      ans = s.toUpperCase();
    } else {
      ans = s.toLowerCase();
    }

    System.out.println(ans);
  }
}
