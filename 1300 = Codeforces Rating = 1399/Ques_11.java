import java.util.*;

public class Ques_11{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long x = sc.nextInt();
    long y = sc.nextInt();
     long k = Math.abs(x) + Math.abs(y);
          if (x > 0 && y > 0) {
            System.out.println("0 " + k + " " + k + " 0");
        } 
        else if (x < 0 && y > 0) {
            System.out.println(-k + " 0 0 " + k);
        } 
        else if (x < 0 && y < 0) {
            System.out.println("0 " + (-k) + " " + (-k) + " 0");
        } 
        else {
            System.out.println(k + " 0 0 " + (-k));
        }


  }
}