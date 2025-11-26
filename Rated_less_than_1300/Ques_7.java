import java.util.Scanner;

public class Ques_7 {
  public static void main(String[] args) {
    // Word :
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
   String ans = Character.toUpperCase(s.charAt(0))+s.substring(1);
   System.out.println(ans);
}
}