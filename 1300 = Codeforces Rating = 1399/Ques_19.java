import java.util.Scanner;

public class Ques_19 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int curr = 0;
    int max = 0;
    for(int i = 0;i<n;i++){
      int ai = sc.nextInt();
      int bi = sc.nextInt();
      curr = curr-ai;
      curr = curr+bi;
      max = Math.max(max,curr);
    }
    System.out.println(max);
  }
}
